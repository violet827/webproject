package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@��:DishSuitablePeopleVO
 *@����:violet
 *@E-mail:violet_gt@126.com
 *@����:2015-5-8 1
 */

public class DishSuitablePeopleVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3024763706631833360L;

	/**�ʺ���Ⱥid*/
	private java.lang.Integer pk_suitablepeople;

	/**�ʺ���Ⱥ*/
	private java.lang.String suitablepeople;

	/**
	 *����: ȡ��pk_suitablepeople
	 *@return: java.lang.Integer  pk_suitablepeople
	 */
	public java.lang.Integer getPk_suitablepeople(){
		return this.pk_suitablepeople;
	}

	/**
	 *����: ����pk_suitablepeople
	 *@param: java.lang.Integer  pk_suitablepeople
	 */
	public void setPk_suitablepeople(java.lang.Integer pk_suitablepeople){
		this.pk_suitablepeople = pk_suitablepeople;
	}

	/**
	 *����: ȡ��suitablepeople
	 *@return: java.lang.String  suitablepeople
	 */
	public java.lang.String getSuitablepeople(){
		return this.suitablepeople;
	}

	/**
	 *����: ����suitablepeople
	 *@param: java.lang.String  suitablepeople
	 */
	public void setSuitablepeople(java.lang.String suitablepeople){
		this.suitablepeople = suitablepeople;
	}

}