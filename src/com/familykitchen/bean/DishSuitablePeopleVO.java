package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@类:DishSuitablePeopleVO
 *@作者:violet
 *@E-mail:violet_gt@126.com
 *@日期:2015-5-8 1
 */

public class DishSuitablePeopleVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3024763706631833360L;

	/**适合人群id*/
	private java.lang.Integer pk_suitablepeople;

	/**适合人群*/
	private java.lang.String suitablepeople;

	/**
	 *方法: 取得pk_suitablepeople
	 *@return: java.lang.Integer  pk_suitablepeople
	 */
	public java.lang.Integer getPk_suitablepeople(){
		return this.pk_suitablepeople;
	}

	/**
	 *方法: 设置pk_suitablepeople
	 *@param: java.lang.Integer  pk_suitablepeople
	 */
	public void setPk_suitablepeople(java.lang.Integer pk_suitablepeople){
		this.pk_suitablepeople = pk_suitablepeople;
	}

	/**
	 *方法: 取得suitablepeople
	 *@return: java.lang.String  suitablepeople
	 */
	public java.lang.String getSuitablepeople(){
		return this.suitablepeople;
	}

	/**
	 *方法: 设置suitablepeople
	 *@param: java.lang.String  suitablepeople
	 */
	public void setSuitablepeople(java.lang.String suitablepeople){
		this.suitablepeople = suitablepeople;
	}

}