package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@��:DishCookingStyleVO
 *@����:violet
 *@E-mail:violet_gt@126.com
 *@����:2015-5-8 1
 */

public class DishCookingStyleVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2127625855595185122L;

	/**��⿷�ʽid*/
	private java.lang.Integer pk_cookingstyle;

	/**��⿷�ʽ*/
	private java.lang.String cookingstyle;

	/**
	 *����: ȡ��pk_cookingstyle
	 *@return: java.lang.Integer  pk_cookingstyle
	 */
	public java.lang.Integer getPk_cookingstyle(){
		return this.pk_cookingstyle;
	}

	/**
	 *����: ����pk_cookingstyle
	 *@param: java.lang.Integer  pk_cookingstyle
	 */
	public void setPk_cookingstyle(java.lang.Integer pk_cookingstyle){
		this.pk_cookingstyle = pk_cookingstyle;
	}

	/**
	 *����: ȡ��cookingstyle
	 *@return: java.lang.String  cookingstyle
	 */
	public java.lang.String getCookingstyle(){
		return this.cookingstyle;
	}

	/**
	 *����: ����cookingstyle
	 *@param: java.lang.String  cookingstyle
	 */
	public void setCookingstyle(java.lang.String cookingstyle){
		this.cookingstyle = cookingstyle;
	}

}