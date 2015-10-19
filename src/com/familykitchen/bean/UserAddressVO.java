package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@��:UserAddressVO
 *@����:violet
 *@E-mail:violet_gt@126.com
 *@����:2015-5-8 1
 */

public class UserAddressVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -145834638198348796L;

	/**��ַ����*/
	private java.lang.Integer pk_address;

	/**�û�����*/
	private UserVO pk_user;

	/**ʡ��*/
	private java.lang.String prov;

	/**����*/
	private java.lang.String city;

	/**����*/
	private java.lang.String town;

	/**�ֵ�*/
	private java.lang.String street;

	/**��ϸ��ַ*/
	private java.lang.String detailaddress;

	/**�ʱ�*/
	private java.lang.String postcode;

	/**ȡ��������*/
	private java.lang.String getusername;

	/**ȡ���˵绰*/
	private java.lang.String getusertel;
	
	private Boolean kitchenflag;
	
	private Boolean defaultflag;

	/**
	 *����: ȡ��pk_address
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
	 *����: ����pk_address
	 *@param: java.lang.Integer  pk_address
	 */
	public void setPk_address(java.lang.Integer pk_address){
		this.pk_address = pk_address;
	}

	/**
	 *����: ȡ��pk_user
	 *@return: UserVO  pk_user
	 */
	public UserVO getPk_user(){
		return this.pk_user;
	}

	/**
	 *����: ����pk_user
	 *@param: UserVO  pk_user
	 */
	public void setPk_user(UserVO pk_user){
		this.pk_user = pk_user;
	}

	/**
	 *����: ȡ��prov
	 *@return: java.lang.String  prov
	 */
	public java.lang.String getProv(){
		return this.prov;
	}

	/**
	 *����: ����prov
	 *@param: java.lang.String  prov
	 */
	public void setProv(java.lang.String prov){
		this.prov = prov;
	}

	/**
	 *����: ȡ��city
	 *@return: java.lang.String  city
	 */
	public java.lang.String getCity(){
		return this.city;
	}

	/**
	 *����: ����city
	 *@param: java.lang.String  city
	 */
	public void setCity(java.lang.String city){
		this.city = city;
	}

	/**
	 *����: ȡ��town
	 *@return: java.lang.String  town
	 */
	public java.lang.String getTown(){
		return this.town;
	}

	/**
	 *����: ����town
	 *@param: java.lang.String  town
	 */
	public void setTown(java.lang.String town){
		this.town = town;
	}

	/**
	 *����: ȡ��street
	 *@return: java.lang.String  street
	 */
	public java.lang.String getStreet(){
		return this.street;
	}

	/**
	 *����: ����street
	 *@param: java.lang.String  street
	 */
	public void setStreet(java.lang.String street){
		this.street = street;
	}

	/**
	 *����: ȡ��detailaddress
	 *@return: java.lang.String  detailaddress
	 */
	public java.lang.String getDetailaddress(){
		return this.detailaddress;
	}

	/**
	 *����: ����detailaddress
	 *@param: java.lang.String  detailaddress
	 */
	public void setDetailaddress(java.lang.String detailaddress){
		this.detailaddress = detailaddress;
	}

	/**
	 *����: ȡ��postcode
	 *@return: java.lang.String  postcode
	 */
	public java.lang.String getPostcode(){
		return this.postcode;
	}

	/**
	 *����: ����postcode
	 *@param: java.lang.String  postcode
	 */
	public void setPostcode(java.lang.String postcode){
		this.postcode = postcode;
	}

	/**
	 *����: ȡ��getusername
	 *@return: java.lang.String  getusername
	 */
	public java.lang.String getGetusername(){
		return this.getusername;
	}

	/**
	 *����: ����getusername
	 *@param: java.lang.String  getusername
	 */
	public void setGetusername(java.lang.String getusername){
		this.getusername = getusername;
	}

	/**
	 *����: ȡ��getusertel
	 *@return: java.lang.String  getusertel
	 */
	public java.lang.String getGetusertel(){
		return this.getusertel;
	}

	/**
	 *����: ����getusertel
	 *@param: java.lang.String  getusertel
	 */
	public void setGetusertel(java.lang.String getusertel){
		this.getusertel = getusertel;
	}

}