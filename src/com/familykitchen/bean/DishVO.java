package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@类:DishVO
 *@作者:violet
 *@E-mail:violet_gt@126.com
 *@日期:2015-5-8 1
 */

public class DishVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6905481450495168526L;

	/**菜品id*/
	private java.lang.Integer pk_dish;

	/**菜名*/
	private java.lang.String dishname;

	/**菜品介绍*/
	private java.lang.String dishintro;

	/**口味id*/
	private String pk_dishtastetype;

	/**菜品发布用户id*/
	private UserVO pk_user;

	/**烹饪完成时间*/
	private java.lang.String cookingtime;

	/**可订份数*/
	private java.lang.Integer dishcount;

	/**取菜方式*/
	private java.lang.Integer getmode;

	/**单份价格*/
	private java.math.BigDecimal unitprice;

	/**优惠价格*/
	private java.math.BigDecimal offprice;

	/**烹饪完成时间*/
	private java.lang.String cookfinishtime;

	/**订单截止时间*/
	private java.lang.String orderendtime;

	/**实物图片*/
	private java.lang.String previewimagedir;

	/**菜品状态*/
	private java.lang.Integer dishstatus;

	/**菜品发布日期，多个日期逗号分隔*/
	private java.lang.String publishdate;

	/**累计销量*/
	private java.lang.Integer totalsalecount;

	/**点赞量*/
	private java.lang.Integer likecount;

	/**菜品提供方地址*/
	private String kitchenaddress;

	/** 菜品经度 */
	private String longitude;
	
	/** 菜品纬度 */
	private String latitude;
	
	/**市场价格*/
	private java.math.BigDecimal marketprice;
	
	/** 距离 */
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