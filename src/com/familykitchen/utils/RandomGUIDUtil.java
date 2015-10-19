package com.familykitchen.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/**
 * ����ȫ��Ψһ��32λ����
 * @author yangdandan
 */
public class RandomGUIDUtil extends Object {

    public String valueBeforeMD5 = "";
    public String valueAfterMD5 = "";
    private static Random myRand;
    private static SecureRandom mySecureRand;

    private static String s_id;

    /*
     *  ��̬���ʼ��
     */

    static {
        mySecureRand = new SecureRandom();
        long secureInitializer = mySecureRand.nextLong();
        myRand = new Random(secureInitializer);
        try {
            s_id = InetAddress.getLocalHost().toString();
        } catch (UnknownHostException e) {
            System.out.println("�����ָ����ϸ��Ϣ��Ƕ���쳣!");
        }

    }


    public RandomGUIDUtil() throws Exception {
        getRandomGUID(false);
    }

    public RandomGUIDUtil(boolean secure) throws Exception {
        getRandomGUID(secure);
    }

    /*
     * �������GUID
     */
    private void getRandomGUID(boolean secure) throws Exception {
        MessageDigest md5 = null;
        StringBuffer sbValueBeforeMD5 = new StringBuffer();

        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            System.out.println("��ʼ��MD5����");
            throw new NoSuchAlgorithmException("��ʼ��MD5����");
        }

        try {
            long time = System.currentTimeMillis();
            long rand = 0;

            if (secure) {
                rand = mySecureRand.nextLong();
            } else {
                rand = myRand.nextLong();
            }

            sbValueBeforeMD5.append(s_id);
            sbValueBeforeMD5.append(":");
            sbValueBeforeMD5.append(Long.toString(time));
            sbValueBeforeMD5.append(":");
            sbValueBeforeMD5.append(Long.toString(rand));

            valueBeforeMD5 = sbValueBeforeMD5.toString();
            md5.update(valueBeforeMD5.getBytes());

            byte[] array = md5.digest();
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < array.length; ++j) {
                int b = array[j] & 0xFF;
                if (b < 0x10) sb.append('0');
                sb.append(Integer.toHexString(b));
            }

            valueAfterMD5 = sb.toString();

        } catch (Exception e) {
        	 System.out.println("���MD5���������!");
            throw new Exception("��ʼ��MD5����");
        }
    }

    /**
     * ����һ��GUID��
     * @return GUID
     * @throws Exception
     */
    public static String newGuid() throws Exception{
        RandomGUIDUtil rdmGUID = new RandomGUIDUtil();
        return rdmGUID.toString();
    }

    /*
     * �������������š��Կ����š�����ţ��Ա�֤Ψһ�Ե�32λ����
     */
    public String toString() {
        String raw = valueAfterMD5.toUpperCase();
        StringBuffer sb = new StringBuffer();
        sb.append(raw.substring(0, 8));
        sb.append(raw.substring(8, 12));
        sb.append(raw.substring(12, 16));
        sb.append(raw.substring(16, 20));
        sb.append(raw.substring(20));
        return sb.toString();
    }
    
}


