package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@类:DishTypeVO
 *@作者:violet
 *@E-mail:violet_gt@126.com
 *@日期:2015-5-8 1
 */

public class DishTypeVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8110920998325514163L;

	/**菜系id*/
	private java.lang.Integer pk_dishtype;

	/**菜系名称*/
	private java.lang.String typename;

	/**菜系编码*/
	private java.lang.String typecode;

	/**
	 *方法: 取得pk_dishtype
	 *@return: java.lang.Integer  pk_dishtype
	 */
	public java.lang.Integer getPk_dishtype(){
		return this.pk_dishtype;
	}

	/**
	 *方法: 设置pk_dishtype
	 *@param: java.lang.Integer  pk_dishtype
	 */
	public void setPk_dishtype(java.lang.Integer pk_dishtype){
		this.pk_dishtype = pk_dishtype;
	}

	/**
	 *方法: 取得typename
	 *@return: java.lang.String  typename
	 */
	public java.lang.String getTypename(){
		return this.typename;
	}

	/**
	 *方法: 设置typename
	 *@param: java.lang.String  typename
	 */
	public void setTypename(java.lang.String typename){
		this.typename = typename;
	}

	/**
	 *方法: 取得typecode
	 *@return: java.lang.String  typecode
	 */
	public java.lang.String getTypecode(){
		return this.typecode;
	}

	/**
	 *方法: 设置typecode
	 *@param: java.lang.String  typecode
	 */
	public void setTypecode(java.lang.String typecode){
		this.typecode = typecode;
	}

}