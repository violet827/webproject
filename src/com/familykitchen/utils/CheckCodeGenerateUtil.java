package com.familykitchen.utils;

import java.util.Random;

/**
 * 
 * ����У�����̣�
 * �ͻ��������������һ�����󣬻ᴫ���ֻ����룬
 * ����������һ��У���룬��������ֻ��ŷ��ͣ�
 * �ͻ��˽������У���룬�ٸ��ݿͻ�����Ľ��бȶ�
 * 
	�ṩһ������У����ͷ��Ͷ��ŵĽӿڣ����յĲ������ֻ��ţ����ز�����У����
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

        // ���ڴ洢������ɵ���֤��
        StringBuffer number = new StringBuffer();

        // ������֤��
        for (int i = 0; i < NUM; i++) {
            String ch = String.valueOf(seq[r.nextInt(seq.length)]);
            number.append(ch);
        }

//        System.out.println(number.toString());
        return number.toString();
    }

}