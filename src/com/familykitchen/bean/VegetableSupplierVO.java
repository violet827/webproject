package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@��:VegetableSupplierVO
 *@����:violet
 *@E-mail:violet_gt@126.com
 *@����:2015-5-8 1
 */

public class VegetableSupplierVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3123372141809917692L;

	/**��Ӧ��id*/
	private java.lang.Integer pk_vegetable_supplier;

	/**��Ӧ������*/
	private java.lang.String suppliername;

	/**��ַ*/
	private java.lang.String supplierlocation;

	/**��ϵ��ʽ*/
	private java.lang.String suppliercontactinfo;

	/**��Ӧ�̽���*/
	private java.lang.String supplierintro;

	/**
	 *����: ȡ��pk_vegetable_supplier
	 *@return: java.lang.Integer  pk_vegetable_supplier
	 */
	public java.lang.Integer getPk_vegetable_supplier(){
		return this.pk_vegetable_supplier;
	}

	/**
	 *����: ����pk_vegetable_supplier
	 *@param: java.lang.Integer  pk_vegetable_supplier
	 */
	public void setPk_vegetable_supplier(java.lang.Integer pk_vegetable_supplier){
		this.pk_vegetable_supplier = pk_vegetable_supplier;
	}

	/**
	 *����: ȡ��suppliername
	 *@return: java.lang.String  suppliername
	 */
	public java.lang.String getSuppliername(){
		return this.suppliername;
	}

	/**
	 *����: ����suppliername
	 *@param: java.lang.String  suppliername
	 */
	public void setSuppliername(java.lang.String suppliername){
		this.suppliername = suppliername;
	}

	/**
	 *����: ȡ��supplierlocation
	 *@return: java.lang.String  supplierlocation
	 */
	public java.lang.String getSupplierlocation(){
		return this.supplierlocation;
	}

	/**
	 *����: ����supplierlocation
	 *@param: java.lang.String  supplierlocation
	 */
	public void setSupplierlocation(java.lang.String supplierlocation){
		this.supplierlocation = supplierlocation;
	}

	/**
	 *����: ȡ��suppliercontactinfo
	 *@return: java.lang.String  suppliercontactinfo
	 */
	public java.lang.String getSuppliercontactinfo(){
		return this.suppliercontactinfo;
	}

	/**
	 *����: ����suppliercontactinfo
	 *@param: java.lang.String  suppliercontactinfo
	 */
	public void setSuppliercontactinfo(java.lang.String suppliercontactinfo){
		this.suppliercontactinfo = suppliercontactinfo;
	}

	/**
	 *����: ȡ��supplierintro
	 *@return: java.lang.String  supplierintro
	 */
	public java.lang.String getSupplierintro(){
		return this.supplierintro;
	}

	/**
	 *����: ����supplierintro
	 *@param: java.lang.String  supplierintro
	 */
	public void setSupplierintro(java.lang.String supplierintro){
		this.supplierintro = supplierintro;
	}

}