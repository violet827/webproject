package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@类:DishCookingStyleVO
 *@作者:violet
 *@E-mail:violet_gt@126.com
 *@日期:2015-5-8 1
 */

public class DishCookingStyleVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2127625855595185122L;

	/**烹饪方式id*/
	private java.lang.Integer pk_cookingstyle;

	/**烹饪方式*/
	private java.lang.String cookingstyle;

	/**
	 *方法: 取得pk_cookingstyle
	 *@return: java.lang.Integer  pk_cookingstyle
	 */
	public java.lang.Integer getPk_cookingstyle(){
		return this.pk_cookingstyle;
	}

	/**
	 *方法: 设置pk_cookingstyle
	 *@param: java.lang.Integer  pk_cookingstyle
	 */
	public void setPk_cookingstyle(java.lang.Integer pk_cookingstyle){
		this.pk_cookingstyle = pk_cookingstyle;
	}

	/**
	 *方法: 取得cookingstyle
	 *@return: java.lang.String  cookingstyle
	 */
	public java.lang.String getCookingstyle(){
		return this.cookingstyle;
	}

	/**
	 *方法: 设置cookingstyle
	 *@param: java.lang.String  cookingstyle
	 */
	public void setCookingstyle(java.lang.String cookingstyle){
		this.cookingstyle = cookingstyle;
	}

}