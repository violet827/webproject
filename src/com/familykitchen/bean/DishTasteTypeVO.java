package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@类:DishTasteTypeVO
 *@作者:violet
 *@E-mail:violet_gt@126.com
 *@日期:2015-5-8 1
 */

public class DishTasteTypeVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2241814061837469323L;

	/**口味id*/
	private java.lang.Integer pk_dishtastetype;

	/**口味类型*/
	private java.lang.String tastename;

	/**
	 *方法: 取得pk_dishtastetype
	 *@return: java.lang.Integer  pk_dishtastetype
	 */
	public java.lang.Integer getPk_dishtastetype(){
		return this.pk_dishtastetype;
	}

	/**
	 *方法: 设置pk_dishtastetype
	 *@param: java.lang.Integer  pk_dishtastetype
	 */
	public void setPk_dishtastetype(java.lang.Integer pk_dishtastetype){
		this.pk_dishtastetype = pk_dishtastetype;
	}

	/**
	 *方法: 取得tastename
	 *@return: java.lang.String  tastename
	 */
	public java.lang.String getTastename(){
		return this.tastename;
	}

	/**
	 *方法: 设置tastename
	 *@param: java.lang.String  tastename
	 */
	public void setTastename(java.lang.String tastename){
		this.tastename = tastename;
	}

}