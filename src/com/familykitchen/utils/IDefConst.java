package com.familykitchen.utils;

public interface IDefConst {

	// ��Ʒ״̬��0 ����� 1�ѷ���  2����� 3��ɾ��  4����Ҫ����
	public static final int DISHSTATUS_ADD = 0; 
	
	public static final int DISHSTATUS_PUBLISHED = 1; 
	
	public static final int DISHSTATUS_APPROVED = 2;
	
	public static final int DISHTYPE_DELETED = 3;
	
	public static final int DISHTYPE_NOTPUBLISHED = 4;
	
	
	// ������Ʒ����   0��Ʒ�� 1�߲�
	public static final int ORDERTYPE_FINISHED = 0; 
	
	public static final int ORDERTYPE_VEGETABLE = 1;
	
	// ��������״̬   0������ 1��ȷ�� 2ȡ��δȷ�� 3����� 4�ѵ��� 5ȡ����ȷ��
	public static final int DEALSTATUS_TODO = 0; 
	
	public static final int DEALSTATUS_VALIDATE = 1;
	
	public static final int DEALSTATUS_CANCEL = 2; 
	
	public static final int DEALSTATUS_FINISHED = 3;
	
	public static final int DEALSTATUS_LIKED = 4;
	
	public static final int DEALSTATUS_CANCELED = 5; 
	
	// ֧��״̬   0δ֧�� 1��֧��
	public static final int PAYSTATUS_NOPAY = 0; 
	
	public static final int PAYSTATUS_PAYED= 1;
	
	// ֧����ʽ   0 ����֧�� 1��������
	public static final int PAYTYPE_ONLINE = 0; 
	
	public static final int PAYTYPE_AFTERRECEIVE = 1;
	
	// ȡ����ʽ    0 ��� 1��ȡ
	public static final int GETMODE_EXPRESS = 0; 
	
	public static final int GETMODE_BYSELF = 1;

	// ��Ʒ��ζ
	public static final int DISHTASTETYPE_FRESH = 0; // ��
	
	public static final int DISHTASTETYPE_HOT = 1; // ��
	
	public static final int DISHTASTETYPE_SWEET = 2; // ��
	
	public static final int DISHTASTETYPE_ORIGIN = 2; // ԭζ
	
	public static final int DISHTASTETYPE_FRESH_HOT = 2; // ����
	
	public static final int DISHTASTETYPE_FRAGRANT_HOT = 2; // ����

	public static final int DISHTASTETYPE_SALT_FRESH = 2; // ����
	
	public static final int DISHTASTETYPE_FUME_HOT = 2; // Ѭ��
	
	public static final int DISHTASTETYPE_SOY_FRAGRANT = 2; //����
	
	public static final int DISHTASTETYPE_BLOAT = 2; //������ζ
	
}
