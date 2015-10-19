package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@类:UserAddressVO
 *@作者:violet
 *@E-mail:violet_gt@126.com
 *@日期:2015-5-8 1
 */

public class UserAddressVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -145834638198348796L;

	/**地址主键*/
	private java.lang.Integer pk_address;

	/**用户主键*/
	private UserVO pk_user;

	/**省份*/
	private java.lang.String prov;

	/**城市*/
	private java.lang.String city;

	/**县区*/
	private java.lang.String town;

	/**街道*/
	private java.lang.String street;

	/**详细地址*/
	private java.lang.String detailaddress;

	/**邮编*/
	private java.lang.String postcode;

	/**取货人姓名*/
	private java.lang.String getusername;

	/**取货人电话*/
	private java.lang.String getusertel;
	
	private Boolean kitchenflag;
	
	private Boolean defaultflag;

	/**
	 *方法: 取得pk_address
	 *@return: java.lang.Integer  pk_address
	 */
	public java.lang.Integer getPk_address(){
		return this.pk_address;
	}

	

	public Boolean getKitchenflag() {
		return kitchenflag;
	}



	public void setKitchenflag(Boolean kitchenflag) {
		this.kitchenflag = kitchenflag;
	}



	public Boolean getDefaultflag() {
		return defaultflag;
	}



	public void setDefaultflag(Boolean defaultflag) {
		this.defaultflag = defaultflag;
	}



	/**
	 *方法: 设置pk_address
	 *@param: java.lang.Integer  pk_address
	 */
	public void setPk_address(java.lang.Integer pk_address){
		this.pk_address = pk_address;
	}

	/**
	 *方法: 取得pk_user
	 *@return: UserVO  pk_user
	 */
	public UserVO getPk_user(){
		return this.pk_user;
	}

	/**
	 *方法: 设置pk_user
	 *@param: UserVO  pk_user
	 */
	public void setPk_user(UserVO pk_user){
		this.pk_user = pk_user;
	}

	/**
	 *方法: 取得prov
	 *@return: java.lang.String  prov
	 */
	public java.lang.String getProv(){
		return this.prov;
	}

	/**
	 *方法: 设置prov
	 *@param: java.lang.String  prov
	 */
	public void setProv(java.lang.String prov){
		this.prov = prov;
	}

	/**
	 *方法: 取得city
	 *@return: java.lang.String  city
	 */
	public java.lang.String getCity(){
		return this.city;
	}

	/**
	 *方法: 设置city
	 *@param: java.lang.String  city
	 */
	public void setCity(java.lang.String city){
		this.city = city;
	}

	/**
	 *方法: 取得town
	 *@return: java.lang.String  town
	 */
	public java.lang.String getTown(){
		return this.town;
	}

	/**
	 *方法: 设置town
	 *@param: java.lang.String  town
	 */
	public void setTown(java.lang.String town){
		this.town = town;
	}

	/**
	 *方法: 取得street
	 *@return: java.lang.String  street
	 */
	public java.lang.String getStreet(){
		return this.street;
	}

	/**
	 *方法: 设置street
	 *@param: java.lang.String  street
	 */
	public void setStreet(java.lang.String street){
		this.street = street;
	}

	/**
	 *方法: 取得detailaddress
	 *@return: java.lang.String  detailaddress
	 */
	public java.lang.String getDetailaddress(){
		return this.detailaddress;
	}

	/**
	 *方法: 设置detailaddress
	 *@param: java.lang.String  detailaddress
	 */
	public void setDetailaddress(java.lang.String detailaddress){
		this.detailaddress = detailaddress;
	}

	/**
	 *方法: 取得postcode
	 *@return: java.lang.String  postcode
	 */
	public java.lang.String getPostcode(){
		return this.postcode;
	}

	/**
	 *方法: 设置postcode
	 *@param: java.lang.String  postcode
	 */
	public void setPostcode(java.lang.String postcode){
		this.postcode = postcode;
	}

	/**
	 *方法: 取得getusername
	 *@return: java.lang.String  getusername
	 */
	public java.lang.String getGetusername(){
		return this.getusername;
	}

	/**
	 *方法: 设置getusername
	 *@param: java.lang.String  getusername
	 */
	public void setGetusername(java.lang.String getusername){
		this.getusername = getusername;
	}

	/**
	 *方法: 取得getusertel
	 *@return: java.lang.String  getusertel
	 */
	public java.lang.String getGetusertel(){
		return this.getusertel;
	}

	/**
	 *方法: 设置getusertel
	 *@param: java.lang.String  getusertel
	 */
	public void setGetusertel(java.lang.String getusertel){
		this.getusertel = getusertel;
	}

}