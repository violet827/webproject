package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@类:VegetableSupplierVO
 *@作者:violet
 *@E-mail:violet_gt@126.com
 *@日期:2015-5-8 1
 */

public class VegetableSupplierVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3123372141809917692L;

	/**供应商id*/
	private java.lang.Integer pk_vegetable_supplier;

	/**供应商名称*/
	private java.lang.String suppliername;

	/**地址*/
	private java.lang.String supplierlocation;

	/**联系方式*/
	private java.lang.String suppliercontactinfo;

	/**供应商介绍*/
	private java.lang.String supplierintro;

	/**
	 *方法: 取得pk_vegetable_supplier
	 *@return: java.lang.Integer  pk_vegetable_supplier
	 */
	public java.lang.Integer getPk_vegetable_supplier(){
		return this.pk_vegetable_supplier;
	}

	/**
	 *方法: 设置pk_vegetable_supplier
	 *@param: java.lang.Integer  pk_vegetable_supplier
	 */
	public void setPk_vegetable_supplier(java.lang.Integer pk_vegetable_supplier){
		this.pk_vegetable_supplier = pk_vegetable_supplier;
	}

	/**
	 *方法: 取得suppliername
	 *@return: java.lang.String  suppliername
	 */
	public java.lang.String getSuppliername(){
		return this.suppliername;
	}

	/**
	 *方法: 设置suppliername
	 *@param: java.lang.String  suppliername
	 */
	public void setSuppliername(java.lang.String suppliername){
		this.suppliername = suppliername;
	}

	/**
	 *方法: 取得supplierlocation
	 *@return: java.lang.String  supplierlocation
	 */
	public java.lang.String getSupplierlocation(){
		return this.supplierlocation;
	}

	/**
	 *方法: 设置supplierlocation
	 *@param: java.lang.String  supplierlocation
	 */
	public void setSupplierlocation(java.lang.String supplierlocation){
		this.supplierlocation = supplierlocation;
	}

	/**
	 *方法: 取得suppliercontactinfo
	 *@return: java.lang.String  suppliercontactinfo
	 */
	public java.lang.String getSuppliercontactinfo(){
		return this.suppliercontactinfo;
	}

	/**
	 *方法: 设置suppliercontactinfo
	 *@param: java.lang.String  suppliercontactinfo
	 */
	public void setSuppliercontactinfo(java.lang.String suppliercontactinfo){
		this.suppliercontactinfo = suppliercontactinfo;
	}

	/**
	 *方法: 取得supplierintro
	 *@return: java.lang.String  supplierintro
	 */
	public java.lang.String getSupplierintro(){
		return this.supplierintro;
	}

	/**
	 *方法: 设置supplierintro
	 *@param: java.lang.String  supplierintro
	 */
	public void setSupplierintro(java.lang.String supplierintro){
		this.supplierintro = supplierintro;
	}

}