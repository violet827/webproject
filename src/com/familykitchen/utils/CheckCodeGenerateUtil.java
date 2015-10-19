package com.familykitchen.utils;

import java.util.Random;

/**
 * 
 * 短信校验流程：
 * 客户端向服务器发起一次请求，会传递手机号码，
 * 服务器产生一个校验码，并且向该手机号发送，
 * 客户端接收这个校验码，再根据客户输入的进行比对
 * 
	提供一个生成校验码和发送短信的接口，接收的参数是手机号，返回参数是校验码
 * @author guoting
 *
 */
public class CheckCodeGenerateUtil {
	
    private static int NUM = 6;

//    private static char[] seq = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
//            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
//            'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8',
//            '9' };

    private static char[] seq = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
    
//    public static void main(String[] args) throws IOException {
//    	for(int i=0; i<10; i++) {
//    		String randomstr = genRandomString();
//    		System.out.println("randomstr" + i + "->" +randomstr);
//    	}
//    }

    public static String genRandomString() {
        Random r = new Random();

        // 用于存储随机生成的验证码
        StringBuffer number = new StringBuffer();

        // 生成验证码
        for (int i = 0; i < NUM; i++) {
            String ch = String.valueOf(seq[r.nextInt(seq.length)]);
            number.append(ch);
        }

//        System.out.println(number.toString());
        return number.toString();
    }

}