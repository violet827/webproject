package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@��:DishTypeVO
 *@����:violet
 *@E-mail:violet_gt@126.com
 *@����:2015-5-8 1
 */

public class DishTypeVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8110920998325514163L;

	/**��ϵid*/
	private java.lang.Integer pk_dishtype;

	/**��ϵ����*/
	private java.lang.String typename;

	/**��ϵ����*/
	private java.lang.String typecode;

	/**
	 *����: ȡ��pk_dishtype
	 *@return: java.lang.Integer  pk_dishtype
	 */
	public java.lang.Integer getPk_dishtype(){
		return this.pk_dishtype;
	}

	/**
	 *����: ����pk_dishtype
	 *@param: java.lang.Integer  pk_dishtype
	 */
	public void setPk_dishtype(java.lang.Integer pk_dishtype){
		this.pk_dishtype = pk_dishtype;
	}

	/**
	 *����: ȡ��typename
	 *@return: java.lang.String  typename
	 */
	public java.lang.String getTypename(){
		return this.typename;
	}

	/**
	 *����: ����typename
	 *@param: java.lang.String  typename
	 */
	public void setTypename(java.lang.String typename){
		this.typename = typename;
	}

	/**
	 *����: ȡ��typecode
	 *@return: java.lang.String  typecode
	 */
	public java.lang.String getTypecode(){
		return this.typecode;
	}

	/**
	 *����: ����typecode
	 *@param: java.lang.String  typecode
	 */
	public void setTypecode(java.lang.String typecode){
		this.typecode = typecode;
	}

}