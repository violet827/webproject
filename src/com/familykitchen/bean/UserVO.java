package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@��:UserVO
 *@����:violet
 *@E-mail:violet_gt@126.com
 *@����:2015-5-8 1
 */

public class UserVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1779990488380459473L;

	/**�û�id*/
	private java.lang.Integer pk_user;

	/**�û��ǳ�*/
	private java.lang.String name;

	/**�û�����*/
	private java.lang.String password;

	/**�绰����*/
	private java.lang.String telphone;

	/**����*/
	private java.lang.String birthday;

	/**����*/
	private java.lang.String intro;

	/**
	 *����: ȡ��pk_user
	 *@return: java.lang.Integer  pk_user
	 */
	public java.lang.Integer getPk_user(){
		return this.pk_user;
	}

	/**
	 *����: ����pk_user
	 *@param: java.lang.Integer  pk_user
	 */
	public void setPk_user(java.lang.Integer pk_user){
		this.pk_user = pk_user;
	}

	/**
	 *����: ȡ��name
	 *@return: java.lang.String  name
	 */
	public java.lang.String getName(){
		return this.name;
	}

	/**
	 *����: ����name
	 *@param: java.lang.String  name
	 */
	public void setName(java.lang.String name){
		this.name = name;
	}

	/**
	 *����: ȡ��password
	 *@return: java.lang.String  password
	 */
	public java.lang.String getPassword(){
		return this.password;
	}

	/**
	 *����: ����password
	 *@param: java.lang.String  password
	 */
	public void setPassword(java.lang.String password){
		this.password = password;
	}

	/**
	 *����: ȡ��telphone
	 *@return: java.lang.String  telphone
	 */
	public java.lang.String getTelphone(){
		return this.telphone;
	}

	/**
	 *����: ����telphone
	 *@param: java.lang.String  telphone
	 */
	public void setTelphone(java.lang.String telphone){
		this.telphone = telphone;
	}

	/**
	 *����: ȡ��birthday
	 *@return: java.lang.String  birthday
	 */
	public java.lang.String getBirthday(){
		return this.birthday;
	}

	/**
	 *����: ����birthday
	 *@param: java.lang.String  birthday
	 */
	public void setBirthday(java.lang.String birthday){
		this.birthday = birthday;
	}

	/**
	 *����: ȡ��intro
	 *@return: java.lang.String  intro
	 */
	public java.lang.String getIntro(){
		return this.intro;
	}

	/**
	 *����: ����intro
	 *@param: java.lang.String  intro
	 */
	public void setIntro(java.lang.String intro){
		this.intro = intro;
	}

}