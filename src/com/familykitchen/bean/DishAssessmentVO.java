package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@类:DishAssessmentVO
 *@作者:violet
 *@E-mail:violet_gt@126.com
 *@日期:2015-5-8 1
 */

public class DishAssessmentVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2641333891630453805L;

	/**评价主键*/
	private java.lang.Integer pk_assessment;

	/**评价内容*/
	private java.lang.String asscontext;

	/**评价用户id*/
	private UserVO pk_fromuser;

	/**
	 *方法: 取得pk_assessment
	 *@return: java.lang.Integer  pk_assessment
	 */
	public java.lang.Integer getPk_assessment(){
		return this.pk_assessment;
	}

	/**
	 *方法: 设置pk_assessment
	 *@param: java.lang.Integer  pk_assessment
	 */
	public void setPk_assessment(java.lang.Integer pk_assessment){
		this.pk_assessment = pk_assessment;
	}

	/**
	 *方法: 取得asscontext
	 *@return: java.lang.String  asscontext
	 */
	public java.lang.String getAsscontext(){
		return this.asscontext;
	}

	/**
	 *方法: 设置asscontext
	 *@param: java.lang.String  asscontext
	 */
	public void setAsscontext(java.lang.String asscontext){
		this.asscontext = asscontext;
	}

	/**
	 *方法: 取得pk_fromuser
	 *@return: UserVO pk_fromuser
	 */
	public UserVO getPk_fromuser(){
		return this.pk_fromuser;
	}

	/**
	 *方法: 设置pk_fromuser
	 *@param: UserVO pk_fromuser
	 */
	public void setPk_fromuser(UserVO pk_fromuser){
		this.pk_fromuser = pk_fromuser;
	}

}