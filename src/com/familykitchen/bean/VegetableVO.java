package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@类:VegetableVO
 *@作者:violet
 *@E-mail:violet_gt@126.com
 *@日期:2015-5-8 1
 */

public class VegetableVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1022872594808585370L;

	/**蔬菜id*/
	private java.lang.Integer pk_vegetable;

	/**蔬菜名称*/
	private java.lang.String vname;

	/**蔬菜图片*/
	private String vimage;

	/**蔬菜数量*/
	private java.lang.Integer amount;

	/**供应商id*/
	private VegetableSupplierVO pk_supplier;

	/**单价*/
	private java.math.BigDecimal price;
	
	/**累计销量*/
	private java.lang.Integer totalsalecount;

	/** 食材经度 */
	private String longitude;
	
	/** 食材纬度 */
	private String latitude;
	
	/**市场价格*/
	private java.math.BigDecimal marketprice;
	
	/** 距离 */
	private String distance;
	
	/**
	 *方法: 取得pk_vegetable
	 *@return: java.lang.Integer  pk_vegetable
	 */
	public java.lang.Integer getPk_vegetable(){
		return this.pk_vegetable;
	}

	/**
	 *方法: 设置pk_vegetable
	 *@param: java.lang.Integer  pk_vegetable
	 */
	public void setPk_vegetable(java.lang.Integer pk_vegetable){
		this.pk_vegetable = pk_vegetable;
	}

	/**
	 *方法: 取得vname
	 *@return: java.lang.String  vname
	 */
	public java.lang.String getVname(){
		return this.vname;
	}

	/**
	 *方法: 设置vname
	 *@param: java.lang.String  vname
	 */
	public void setVname(java.lang.String vname){
		this.vname = vname;
	}

	/**
	 *方法: 取得vimage
	 *@return: String  vimage
	 */
	public String getVimage(){
		return this.vimage;
	}

	/**
	 *方法: 设置vimage
	 *@param: String  vimage
	 */
	public void setVimage(String vimage){
		this.vimage = vimage;
	}

	/**
	 *方法: 取得amount
	 *@return: java.lang.Integer  amount
	 */
	public java.lang.Integer getAmount(){
		return this.amount;
	}

	/**
	 *方法: 设置amount
	 *@param: java.lang.Integer  amount
	 */
	public void setAmount(java.lang.Integer amount){
		this.amount = amount;
	}

	/**
	 *方法: 取得pk_supplier
	 *@return: VegetableSupplierVO  pk_supplier
	 */
	public VegetableSupplierVO getPk_supplier(){
		return this.pk_supplier;
	}

	/**
	 *方法: 设置pk_supplier
	 *@param: VegetableSupplierVO  pk_supplier
	 */
	public void setPk_supplier(VegetableSupplierVO pk_supplier){
		this.pk_supplier = pk_supplier;
	}

	/**
	 *方法: 取得price
	 *@return: java.math.BigDecimal  price
	 */
	public java.math.BigDecimal getPrice(){
		return this.price;
	}

	/**
	 *方法: 设置price
	 *@param: java.math.BigDecimal  price
	 */
	public void setPrice(java.math.BigDecimal price){
		this.price = price;
	}

	public java.lang.Integer getTotalsalecount() {
		return totalsalecount;
	}

	public void setTotalsalecount(java.lang.Integer totalsalecount) {
		this.totalsalecount = totalsalecount;
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