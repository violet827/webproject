package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@类:UserVO
 *@作者:violet
 *@E-mail:violet_gt@126.com
 *@日期:2015-5-8 1
 */

public class UserVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1779990488380459473L;

	/**用户id*/
	private java.lang.Integer pk_user;

	/**用户昵称*/
	private java.lang.String name;

	/**用户密码*/
	private java.lang.String password;

	/**电话号码*/
	private java.lang.String telphone;

	/**生日*/
	private java.lang.String birthday;

	/**介绍*/
	private java.lang.String intro;

	/**
	 *方法: 取得pk_user
	 *@return: java.lang.Integer  pk_user
	 */
	public java.lang.Integer getPk_user(){
		return this.pk_user;
	}

	/**
	 *方法: 设置pk_user
	 *@param: java.lang.Integer  pk_user
	 */
	public void setPk_user(java.lang.Integer pk_user){
		this.pk_user = pk_user;
	}

	/**
	 *方法: 取得name
	 *@return: java.lang.String  name
	 */
	public java.lang.String getName(){
		return this.name;
	}

	/**
	 *方法: 设置name
	 *@param: java.lang.String  name
	 */
	public void setName(java.lang.String name){
		this.name = name;
	}

	/**
	 *方法: 取得password
	 *@return: java.lang.String  password
	 */
	public java.lang.String getPassword(){
		return this.password;
	}

	/**
	 *方法: 设置password
	 *@param: java.lang.String  password
	 */
	public void setPassword(java.lang.String password){
		this.password = password;
	}

	/**
	 *方法: 取得telphone
	 *@return: java.lang.String  telphone
	 */
	public java.lang.String getTelphone(){
		return this.telphone;
	}

	/**
	 *方法: 设置telphone
	 *@param: java.lang.String  telphone
	 */
	public void setTelphone(java.lang.String telphone){
		this.telphone = telphone;
	}

	/**
	 *方法: 取得birthday
	 *@return: java.lang.String  birthday
	 */
	public java.lang.String getBirthday(){
		return this.birthday;
	}

	/**
	 *方法: 设置birthday
	 *@param: java.lang.String  birthday
	 */
	public void setBirthday(java.lang.String birthday){
		this.birthday = birthday;
	}

	/**
	 *方法: 取得intro
	 *@return: java.lang.String  intro
	 */
	public java.lang.String getIntro(){
		return this.intro;
	}

	/**
	 *方法: 设置intro
	 *@param: java.lang.String  intro
	 */
	public void setIntro(java.lang.String intro){
		this.intro = intro;
	}

}