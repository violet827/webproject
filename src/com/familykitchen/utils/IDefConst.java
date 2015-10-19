package com.familykitchen.utils;

public interface IDefConst {

	// 菜品状态：0 待审核 1已发布  2已审核 3已删除  4不需要发布
	public static final int DISHSTATUS_ADD = 0; 
	
	public static final int DISHSTATUS_PUBLISHED = 1; 
	
	public static final int DISHSTATUS_APPROVED = 2;
	
	public static final int DISHTYPE_DELETED = 3;
	
	public static final int DISHTYPE_NOTPUBLISHED = 4;
	
	
	// 订单菜品类型   0成品菜 1蔬菜
	public static final int ORDERTYPE_FINISHED = 0; 
	
	public static final int ORDERTYPE_VEGETABLE = 1;
	
	// 订单处理状态   0待处理 1已确认 2取消未确认 3已完成 4已点赞 5取消已确认
	public static final int DEALSTATUS_TODO = 0; 
	
	public static final int DEALSTATUS_VALIDATE = 1;
	
	public static final int DEALSTATUS_CANCEL = 2; 
	
	public static final int DEALSTATUS_FINISHED = 3;
	
	public static final int DEALSTATUS_LIKED = 4;
	
	public static final int DEALSTATUS_CANCELED = 5; 
	
	// 支付状态   0未支付 1已支付
	public static final int PAYSTATUS_NOPAY = 0; 
	
	public static final int PAYSTATUS_PAYED= 1;
	
	// 支付方式   0 在线支付 1货到付款
	public static final int PAYTYPE_ONLINE = 0; 
	
	public static final int PAYTYPE_AFTERRECEIVE = 1;
	
	// 取货方式    0 快递 1自取
	public static final int GETMODE_EXPRESS = 0; 
	
	public static final int GETMODE_BYSELF = 1;

	// 菜品口味
	public static final int DISHTASTETYPE_FRESH = 0; // 鲜
	
	public static final int DISHTASTETYPE_HOT = 1; // 辣
	
	public static final int DISHTASTETYPE_SWEET = 2; // 甜
	
	public static final int DISHTASTETYPE_ORIGIN = 2; // 原味
	
	public static final int DISHTASTETYPE_FRESH_HOT = 2; // 鲜甜
	
	public static final int DISHTASTETYPE_FRAGRANT_HOT = 2; // 香辣

	public static final int DISHTASTETYPE_SALT_FRESH = 2; // 咸鲜
	
	public static final int DISHTASTETYPE_FUME_HOT = 2; // 熏辣
	
	public static final int DISHTASTETYPE_SOY_FRAGRANT = 2; //酱香
	
	public static final int DISHTASTETYPE_BLOAT = 2; //腌制腊味
	
}
