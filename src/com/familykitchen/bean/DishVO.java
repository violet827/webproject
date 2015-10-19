package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@��:DishVO
 *@����:violet
 *@E-mail:violet_gt@126.com
 *@����:2015-5-8 1
 */

public class DishVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6905481450495168526L;

	/**��Ʒid*/
	private java.lang.Integer pk_dish;

	/**����*/
	private java.lang.String dishname;

	/**��Ʒ����*/
	private java.lang.String dishintro;

	/**��ζid*/
	private String pk_dishtastetype;

	/**��Ʒ�����û�id*/
	private UserVO pk_user;

	/**������ʱ��*/
	private java.lang.String cookingtime;

	/**�ɶ�����*/
	private java.lang.Integer dishcount;

	/**ȡ�˷�ʽ*/
	private java.lang.Integer getmode;

	/**���ݼ۸�*/
	private java.math.BigDecimal unitprice;

	/**�Żݼ۸�*/
	private java.math.BigDecimal offprice;

	/**������ʱ��*/
	private java.lang.String cookfinishtime;

	/**������ֹʱ��*/
	private java.lang.String orderendtime;

	/**ʵ��ͼƬ*/
	private java.lang.String previewimagedir;

	/**��Ʒ״̬*/
	private java.lang.Integer dishstatus;

	/**��Ʒ�������ڣ�������ڶ��ŷָ�*/
	private java.lang.String publishdate;

	/**�ۼ�����*/
	private java.lang.Integer totalsalecount;

	/**������*/
	private java.lang.Integer likecount;

	/**��Ʒ�ṩ����ַ*/
	private String kitchenaddress;

	/** ��Ʒ���� */
	private String longitude;
	
	/** ��Ʒγ�� */
	private String latitude;
	
	/**�г��۸�*/
	private java.math.BigDecimal marketprice;
	
	/** ���� */
	private String distance;
	
	public java.lang.Integer getPk_dish() {
		return pk_dish;
	}

	public void setPk_dish(java.lang.Integer pk_dish) {
		this.pk_dish = pk_dish;
	}

	public java.lang.String getDishname() {
		return dishname;
	}

	public void setDishname(java.lang.String dishname) {
		this.dishname = dishname;
	}

	public java.lang.String getDishintro() {
		return dishintro;
	}

	public void setDishintro(java.lang.String dishintro) {
		this.dishintro = dishintro;
	}

	public UserVO getPk_user() {
		return pk_user;
	}

	public void setPk_user(UserVO pk_user) {
		this.pk_user = pk_user;
	}

	public java.lang.String getCookingtime() {
		return cookingtime;
	}

	public void setCookingtime(java.lang.String cookingtime) {
		this.cookingtime = cookingtime;
	}

	public java.lang.Integer getDishcount() {
		return dishcount;
	}

	public void setDishcount(java.lang.Integer dishcount) {
		this.dishcount = dishcount;
	}

	public java.lang.Integer getGetmode() {
		return getmode;
	}

	public void setGetmode(java.lang.Integer getmode) {
		this.getmode = getmode;
	}

	public java.math.BigDecimal getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(java.math.BigDecimal unitprice) {
		this.unitprice = unitprice;
	}

	public java.math.BigDecimal getOffprice() {
		return offprice;
	}

	public void setOffprice(java.math.BigDecimal offprice) {
		this.offprice = offprice;
	}

	public java.lang.String getCookfinishtime() {
		return cookfinishtime;
	}

	public void setCookfinishtime(java.lang.String cookfinishtime) {
		this.cookfinishtime = cookfinishtime;
	}

	public java.lang.String getOrderendtime() {
		return orderendtime;
	}

	public void setOrderendtime(java.lang.String orderendtime) {
		this.orderendtime = orderendtime;
	}

	public java.lang.String getPreviewimagedir() {
		return previewimagedir;
	}

	public void setPreviewimagedir(java.lang.String previewimagedir) {
		this.previewimagedir = previewimagedir;
	}

	public java.lang.Integer getDishstatus() {
		return dishstatus;
	}

	public void setDishstatus(java.lang.Integer dishstatus) {
		this.dishstatus = dishstatus;
	}

	public java.lang.String getPublishdate() {
		return publishdate;
	}

	public void setPublishdate(java.lang.String publishdate) {
		this.publishdate = publishdate;
	}

	public java.lang.Integer getTotalsalecount() {
		return totalsalecount;
	}

	public void setTotalsalecount(java.lang.Integer totalsalecount) {
		this.totalsalecount = totalsalecount;
	}

	public java.lang.Integer getLikecount() {
		return likecount;
	}

	public void setLikecount(java.lang.Integer likecount) {
		this.likecount = likecount;
	}

	public String getKitchenaddress() {
		return kitchenaddress;
	}

	public void setKitchenaddress(String kitchenaddress) {
		this.kitchenaddress = kitchenaddress;
	}

	public String getPk_dishtastetype() {
		return pk_dishtastetype;
	}

	public void setPk_dishtastetype(String pk_dishtastetype) {
		this.pk_dishtastetype = pk_dishtastetype;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public java.math.BigDecimal getMarketprice() {
		return marketprice;
	}

	public void setMarketprice(java.math.BigDecimal marketprice) {
		this.marketprice = marketprice;
	}

	

}