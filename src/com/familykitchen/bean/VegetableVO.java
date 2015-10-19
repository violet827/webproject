package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@��:VegetableVO
 *@����:violet
 *@E-mail:violet_gt@126.com
 *@����:2015-5-8 1
 */

public class VegetableVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1022872594808585370L;

	/**�߲�id*/
	private java.lang.Integer pk_vegetable;

	/**�߲�����*/
	private java.lang.String vname;

	/**�߲�ͼƬ*/
	private String vimage;

	/**�߲�����*/
	private java.lang.Integer amount;

	/**��Ӧ��id*/
	private VegetableSupplierVO pk_supplier;

	/**����*/
	private java.math.BigDecimal price;
	
	/**�ۼ�����*/
	private java.lang.Integer totalsalecount;

	/** ʳ�ľ��� */
	private String longitude;
	
	/** ʳ��γ�� */
	private String latitude;
	
	/**�г��۸�*/
	private java.math.BigDecimal marketprice;
	
	/** ���� */
	private String distance;
	
	/**
	 *����: ȡ��pk_vegetable
	 *@return: java.lang.Integer  pk_vegetable
	 */
	public java.lang.Integer getPk_vegetable(){
		return this.pk_vegetable;
	}

	/**
	 *����: ����pk_vegetable
	 *@param: java.lang.Integer  pk_vegetable
	 */
	public void setPk_vegetable(java.lang.Integer pk_vegetable){
		this.pk_vegetable = pk_vegetable;
	}

	/**
	 *����: ȡ��vname
	 *@return: java.lang.String  vname
	 */
	public java.lang.String getVname(){
		return this.vname;
	}

	/**
	 *����: ����vname
	 *@param: java.lang.String  vname
	 */
	public void setVname(java.lang.String vname){
		this.vname = vname;
	}

	/**
	 *����: ȡ��vimage
	 *@return: String  vimage
	 */
	public String getVimage(){
		return this.vimage;
	}

	/**
	 *����: ����vimage
	 *@param: String  vimage
	 */
	public void setVimage(String vimage){
		this.vimage = vimage;
	}

	/**
	 *����: ȡ��amount
	 *@return: java.lang.Integer  amount
	 */
	public java.lang.Integer getAmount(){
		return this.amount;
	}

	/**
	 *����: ����amount
	 *@param: java.lang.Integer  amount
	 */
	public void setAmount(java.lang.Integer amount){
		this.amount = amount;
	}

	/**
	 *����: ȡ��pk_supplier
	 *@return: VegetableSupplierVO  pk_supplier
	 */
	public VegetableSupplierVO getPk_supplier(){
		return this.pk_supplier;
	}

	/**
	 *����: ����pk_supplier
	 *@param: VegetableSupplierVO  pk_supplier
	 */
	public void setPk_supplier(VegetableSupplierVO pk_supplier){
		this.pk_supplier = pk_supplier;
	}

	/**
	 *����: ȡ��price
	 *@return: java.math.BigDecimal  price
	 */
	public java.math.BigDecimal getPrice(){
		return this.price;
	}

	/**
	 *����: ����price
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