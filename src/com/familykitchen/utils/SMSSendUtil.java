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
 * 短信通道读取 工具
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
	 * 返回值 说明 success:msgid 提交成功，发送状态请见4.1 error:msgid 提交失败 error:Missing
	 * username 用户名为空 error:Missing password 密码为空 error:Missing apikey APIKEY为空
	 * error:Missing recipient 手机号码为空 error:Missing message content 短信内容为空
	 * error:Account is blocked 帐号被禁用 error:Unrecognized encoding 编码未能识别
	 * error:APIKEY or password error APIKEY 或密码错误 error:Unauthorized IP address
	 * 未授权 IP 地址 error:Account balance is insufficient 余额不足 error:Black keywords
	 * is:党中央 屏蔽词
	 */
	
	public boolean sendMsg(String telphone, String msgcontent) {
		try {
			HashMap<String, String> map = SMSSendUtil.getSmsConfigData();

			// 创建StringBuffer对象用来操作字符串
			StringBuffer str = new StringBuffer("http://m.5c.com.cn/api/send/?");

			// APIKEY
			str.append("apikey=" + map.get("apikey"));

			// 用户名
			str.append("&username=" + map.get("username"));

			// 向StringBuffer追加密码
			str.append("&password=" + map.get("password"));

			// 向StringBuffer追加手机号码
			str.append("&mobile=" + telphone);

			// 向StringBuffer追加消息内容转URL标准码
			str.append("&content=" + URLEncoder.encode(msgcontent, "GBK"));

			// 创建url对象
			URL url = new URL(str.toString());

			// 打开url连接
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();

			// 设置url请求方式 ‘get’ 或者 ‘post’
			connection.setRequestMethod("POST");

			// 发送
			BufferedReader in = new BufferedReader(new InputStreamReader(
					url.openStream()));

			// 返回发送结果
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
			// 发送内容
			String msgcontent = "【邻居厨房】您的验证码为：" + checkcode;
			
			if (sendMsg(telphone, msgcontent))
				return checkcode;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
}