package com.familykitchen.utils;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

/**
 * Java中的boolean类型和数据库的varchar类型转换
 * true：Y、1
 * false：N、0
 * 
 * @author guoting 
 * 
 */
public class BooleanTypeHandler implements TypeHandler {
	
	@Override
	public Object getResult(ResultSet arg0, int arg1) throws SQLException {
		int i = arg0.getInt(arg1);
		Boolean rt = Boolean.FALSE;
		
		if (i == 1 ){
			rt = Boolean.TRUE;
		}
		return rt; 
	}
	
	
	@Override
	public Object getResult(ResultSet arg0, String arg1) throws SQLException {
		String str = arg0.getString(arg1);
		Boolean rt = Boolean.FALSE;
		if (str == null)
			return rt;
		
		if (str.equalsIgnoreCase("Y") || str.equalsIgnoreCase("1")){
			rt = Boolean.TRUE;
		}
		return rt; 
	}

	@Override
	public Object getResult(CallableStatement arg0, int arg1)
			throws SQLException {
		Boolean b = arg0.getBoolean(arg1);
		return b == true ? "Y" : "N";
	}

	@Override
	public void setParameter(PreparedStatement arg0, int arg1, Object arg2,
			JdbcType arg3) throws SQLException {
		Boolean b = (Boolean) arg2;
		String value = (Boolean) b == true ? "Y" : "N";
		arg0.setString(arg1, value);
	}

	
}
