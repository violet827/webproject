package com.familykitchen.utils;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class DBToJavaVO {

	private static final String TARGET_DIR="C:/tempVO/";							//���ļ���ŵ�·��
	private static final String DIVER_NAME="org.gjt.mm.mysql.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/myapp0420"; 
	private static final String USERNAME="root";
	private static final String PASSWORD="violet827";
	private static final String DATABASE_NAME="myapp0420";								//���ݿ�����
	private static final String AUTHOR="violet";										//����
	private static final String E_MAIL="violet_gt@126.com";					//��������
	private static final String PACKAGE_NAME="com.familykitchen.bean";						//����
	private Connection conn;
	private Statement stmt;
	private String sql;
	private ResultSet rs;
//	private String[] fields;	//����
//	private String[] dataTypes;	//��������
//	private String[] comments;	//���Ե�ע��
	/**
	 * ����:�������ݿ������VO--Value Object
	 * @param tableName
	 */
	private void tableToVo(){
		
		String readTableName = "tb_dish," +
				"tb_dish_assessment," +
				"tb_dish_cookingstyle," +
				"tb_dish_suitablepeople," +
				"tb_dish_tastetype," +
				"tb_dish_type," +
				"tb_vegetable," +
				"tb_vegetable_supplier," +
				"tb_order," +
				"tb_user," +
				"tb_user_assessment," +
				"tb_user_favimage," +
				"tb_user_address";
		String readClassName = "DishVO," +
				"DishAssessmentVO," +
				"DishCookingStyleVO," +
				"DishSuitablePeopleVO," +
				"DishTasteTypeVO," +
				"DishTypeVO," +
				"VegetableVO," +
				"VegetableSupplierVO," +
				"OrderVO," +
				"UserVO," +
				"UserAssessmentVO," +
				"UserFavimageVO," +
				"UserAddressVO";
		try {
//			InputStreamReader reader = new InputStreamReader(System.in);
//			BufferedReader bf = new BufferedReader(reader);
//			System.out.println("����Ҫת����VO�ı�����:");
//			readTableName = bf.readLine().trim();
			String[] tableNames = readTableName.split(",");
//			System.out.println("�������ɵ�����,�������ʱ��Ĭ�ϸ�������ͬ:");
//			readClassName = bf.readLine().trim();
			String[] classNames = readClassName.split(",");
			Class.forName(DIVER_NAME);
			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);	//�����ɹ�����,ֻ���Ľ����
			
			for (int t =0; t < tableNames.length; t++) {
				String tableName = tableNames[t];
				String className = classNames[t];
				sql = "SELECT COLUMN_NAME, DATA_TYPE, COLUMN_COMMENT"+
						  " FROM INFORMATION_SCHEMA.COLUMNS"+
						  " WHERE table_name = '"+tableName.toUpperCase()+"'"+		//����
						  " AND table_schema = '"+DATABASE_NAME+"'";				//���ݿ���
				System.out.println(sql);
				rs = stmt.executeQuery(sql);
				rs.last();										//��ָ��ָ�����������
				int fieldNum = rs.getRow();						//ȡ�����һ��������к�,��Ϊ������Ը���
				int n = fieldNum;
				if(n <= 0) {									//�ж����ݱ����Ƿ�����ֶ�
					System.out.println("�ñ����ڻ��߱���û���ֶ�");
					return;
				}
				
				String[] fields = new String[n];//����
				String[] dataTypes = new String[n];//��������
				String[] comments = new String[n];//���Ե�ע��
				fields[--n] = rs.getString(1);
				dataTypes[n] = rs.getString(2);
				comments[n] = rs.getString(3);
				while(rs.previous()){
					fields[--n]=rs.getString(1);			//ȡ�ý�����ĵ�һ������,��Ӧ������:Field
					dataTypes[n] = rs.getString(2);
					comments[n] = rs.getString(3);
				}
				//��ӡ�����Ϣ
				System.out.println("��Ҫת���ı���:"+tableName);
				System.out.println("�ñ��й���"+fieldNum+"���ֶ�,��Ϣ����:");
				for(int i=0,j=fields.length;i<j;i++){
					System.out.println("----------------------------------------");
					String field = fields[i];
					System.out.println("�ֶ�����:"+field);
					//���ֶ����Ƹ�ʽ����java����������ʽ
//					field=formatField(field);
					fields[i]=field;						//�Ѹ�ʽ������ֶη�������������
					System.out.println("��������:"+dataTypes[i]);
					//�����ݿ��ֶ�����ת����java��������
					String dataType = dataTypes[i].toLowerCase();
					dataType = formatDataType(dataType);
					dataTypes[i] = dataType;
					
					System.out.println("�ֶ�ע��:"+comments[i]);
					if("".equals(comments[i])||comments[i]==null){
						comments[i]=fields[i];
					}
					System.out.println("----------------------------------------");
				}
				//��ʽ��������
//				foramtClassName(className,tableName);
				//�������ļ�,д�뵽������
				writeObjectToFile(className, fields, dataTypes, comments);
			}
			
				
		} catch (ClassNotFoundException e) {
			System.out.println("δ�ҵ����ݿ�����");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//			//e.printStackTrace();
		}finally{
			try {
				if(stmt!=null){
					if(!stmt.isClosed()){
						stmt.close();
						stmt=null;
						System.gc();
					}
				}
				if(conn!=null){
					if(!conn.isClosed()){
						conn.close();
						conn=null;
						System.gc();
					}
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	/**
	 * �����ݿ��ֶθ�ʽ��java������
	 * @param field
	 * @return
	 */
//	private String formatField(String field){
//		String[] strs = field.split("_");
//		field="";
//		for(int m = 0,length=strs.length;m<length;m++){
//			if(m>0){
//				String tempStr = strs[m].toLowerCase();
//				tempStr = tempStr.substring(0, 1).toUpperCase()+tempStr.substring(1, tempStr.length());
//				field += tempStr;
//			}else{
//				field += strs[m].toLowerCase();
//			}
//		}
//		return field;
//	}
	
	private String formatDataType(String dataType){
		if(dataType.contains("char")){
			dataType="java.lang.String";
		}else if(dataType.contains("int")){
			dataType="java.lang.Integer";
		}else if(dataType.contains("float")){
			dataType="java.lang.Float";
		}else if(dataType.contains("double")){
			dataType="java.lang.Double";
		}else if(dataType.contains("number")||dataType.contains("decimal")){
			dataType="java.math.BigDecimal";
		}else if(dataType.contains("date")){
			dataType="java.sql.Date";
		}else if(dataType.contains("time")){
			dataType="java.sql.Timestamp";
		}else if(dataType.contains("clob")){
			dataType="java.sql.Clob";
		}else{
			dataType="java.lang.Object";
		}
		return dataType;
	}
	/**
	 * ��ʽ������
	 * @param className
	 * @param tableName
	 * @return
	 */
//	private String foramtClassName(String className,String tableName){
//		//������������Լ������,��ô���ݱ�����ʽ������
//		if("".equals(className)||className==null){
//			className="";
//			String[] tempArr = tableName.split("_");
//			for(int m=0,length=tempArr.length;m<length;m++){		
//				className += tempArr[m].substring(0,1).toUpperCase()+tempArr[m].substring(1,tempArr[m].length()).toLowerCase();
//			}
//		}else{
//			//��������Ѿ�����,��ô�������߶�ʮһ�Ͱ������ĵ�һ����ĸ��д
//			className = className.substring(0,1).toUpperCase()+className.substring(1,className.length());
//		}
//		return className;
//	}
	
	/**
	 * �����ಢд���ļ�
	 * @param className
	 */
	@SuppressWarnings("deprecation")
	private void writeObjectToFile(String className, String[] fields, String[] dataTypes, String[] comments){
		PrintWriter writer = null;
		try {
			 File dir = new File(TARGET_DIR);
			 if(!dir.exists()){
				 dir.mkdirs();
			 }
			 File file = new File(TARGET_DIR+className+".java");
			 if(!file.exists()){
				 file.createNewFile();
			 }
			 writer = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			 
			 //ƴ�ļ�����
			 StringBuffer content = new StringBuffer();
			 content.append("package "+PACKAGE_NAME+";\n\n");
			 content.append("/**\n");
			 content.append(" *@��:"+className+"\n");
			 content.append(" *@����:"+AUTHOR+"\n");
			 content.append(" *@E-mail:"+E_MAIL+"\n");
			 content.append(" *@����:"+new Date().toLocaleString().substring(0,10)+"\n");
			 content.append(" */\n\n");
			 content.append("public class "+className+"{\n\n");
			 for(int i=0,j=fields.length;i<j;i++){
				 content.append("	/**"+comments[i]+"*/\n");
				 content.append("	private "+dataTypes[i]+" "+fields[i]+";\n\n");
			 }
			 //get set ����
			 for(int i=0,j=fields.length;i<j;i++){
				 content.append("	/**\n");
				 content.append("	 *����: ȡ��"+fields[i]+"\n");
				 content.append("	 *@return: "+dataTypes[i]+"  "+fields[i]+"\n");
				 content.append("	 */\n");
				 content.append("	public "+dataTypes[i]+" get"+fields[i].substring(0,1).toUpperCase()+fields[i].substring(1,fields[i].length())+"(){\n");
				 content.append("		return this."+fields[i]+";\n");
				 content.append("	}\n\n");
				 content.append("	/**\n");
				 content.append("	 *����: ����"+fields[i]+"\n");
				 content.append("	 *@param: "+dataTypes[i]+"  "+fields[i]+"\n");
				 content.append("	 */\n");
				 content.append("	public void set"+fields[i].substring(0,1).toUpperCase()+fields[i].substring(1,fields[i].length())+"("+dataTypes[i]+" "+fields[i]+"){\n");
				 content.append("		this."+fields[i]+" = "+fields[i]+";\n");
				 content.append("	}\n\n");
			 }
			 content.append("}");
			 writer.write(content.toString());
			 writer.flush();
			 System.out.println("�����ɳɹ������·����"+TARGET_DIR);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(writer!=null){
				writer.close();
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			new DBToJavaVO().tableToVo();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
