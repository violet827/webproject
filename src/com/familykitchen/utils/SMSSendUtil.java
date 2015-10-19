package com.familykitchen.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Properties;

/**
 * ����ͨ����ȡ ����
 * 
 * @author guoting
 * 
 */
public class SMSSendUtil {

	public static HashMap<String, String> getSmsConfigData() {
		SMSSendUtil loadProp = new SMSSendUtil();
		InputStream in = loadProp.getClass().getResourceAsStream(
				"smsconfig.properties");
		Properties prop = new Properties();
		try {
			prop.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("apikey", prop.getProperty("apikey"));
		map.put("username", prop.getProperty("username"));
		map.put("password", prop.getProperty("password"));

		return map;
	}

	/**
	 * ����ֵ ˵�� success:msgid �ύ�ɹ�������״̬���4.1 error:msgid �ύʧ�� error:Missing
	 * username �û���Ϊ�� error:Missing password ����Ϊ�� error:Missing apikey APIKEYΪ��
	 * error:Missing recipient �ֻ�����Ϊ�� error:Missing message content ��������Ϊ��
	 * error:Account is blocked �ʺű����� error:Unrecognized encoding ����δ��ʶ��
	 * error:APIKEY or password error APIKEY ��������� error:Unauthorized IP address
	 * δ��Ȩ IP ��ַ error:Account balance is insufficient ���� error:Black keywords
	 * is:������ ���δ�
	 */
	
	public boolean sendMsg(String telphone, String msgcontent) {
		try {
			HashMap<String, String> map = SMSSendUtil.getSmsConfigData();

			// ����StringBuffer�������������ַ���
			StringBuffer str = new StringBuffer("http://m.5c.com.cn/api/send/?");

			// APIKEY
			str.append("apikey=" + map.get("apikey"));

			// �û���
			str.append("&username=" + map.get("username"));

			// ��StringBuffer׷������
			str.append("&password=" + map.get("password"));

			// ��StringBuffer׷���ֻ�����
			str.append("&mobile=" + telphone);

			// ��StringBuffer׷����Ϣ����תURL��׼��
			str.append("&content=" + URLEncoder.encode(msgcontent, "GBK"));

			// ����url����
			URL url = new URL(str.toString());

			// ��url����
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();

			// ����url����ʽ ��get�� ���� ��post��
			connection.setRequestMethod("POST");

			// ����
			BufferedReader in = new BufferedReader(new InputStreamReader(
					url.openStream()));

			// ���ط��ͽ��
			String inputline = in.readLine();

			if (inputline != null && inputline.contains("success"))
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
		
	public String sendCheckCode(String telphone) {
		try {
			String checkcode = CheckCodeGenerateUtil.genRandomString();
			// ��������
			String msgcontent = "���ھӳ�����������֤��Ϊ��" + checkcode;
			
			if (sendMsg(telphone, msgcontent))
				return checkcode;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
}