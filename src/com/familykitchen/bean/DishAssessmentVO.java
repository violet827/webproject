package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@��:DishAssessmentVO
 *@����:violet
 *@E-mail:violet_gt@126.com
 *@����:2015-5-8 1
 */

public class DishAssessmentVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2641333891630453805L;

	/**��������*/
	private java.lang.Integer pk_assessment;

	/**��������*/
	private java.lang.String asscontext;

	/**�����û�id*/
	private UserVO pk_fromuser;

	/**
	 *����: ȡ��pk_assessment
	 *@return: java.lang.Integer  pk_assessment
	 */
	public java.lang.Integer getPk_assessment(){
		return this.pk_assessment;
	}

	/**
	 *����: ����pk_assessment
	 *@param: java.lang.Integer  pk_assessment
	 */
	public void setPk_assessment(java.lang.Integer pk_assessment){
		this.pk_assessment = pk_assessment;
	}

	/**
	 *����: ȡ��asscontext
	 *@return: java.lang.String  asscontext
	 */
	public java.lang.String getAsscontext(){
		return this.asscontext;
	}

	/**
	 *����: ����asscontext
	 *@param: java.lang.String  asscontext
	 */
	public void setAsscontext(java.lang.String asscontext){
		this.asscontext = asscontext;
	}

	/**
	 *����: ȡ��pk_fromuser
	 *@return: UserVO pk_fromuser
	 */
	public UserVO getPk_fromuser(){
		return this.pk_fromuser;
	}

	/**
	 *����: ����pk_fromuser
	 *@param: UserVO pk_fromuser
	 */
	public void setPk_fromuser(UserVO pk_fromuser){
		this.pk_fromuser = pk_fromuser;
	}

}