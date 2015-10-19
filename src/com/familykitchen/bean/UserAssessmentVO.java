package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@类:UserAssessmentVO
 *@作者:violet
 *@E-mail:violet_gt@126.com
 *@日期:2015-5-8 1
 */

public class UserAssessmentVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3674846923986225000L;

	/**用户评价id*/
	private java.lang.Integer pk_user_assessment;

	/**用户id*/
	private UserVO pk_user;

	/**评价用户id*/
	private UserVO pk_assessmentuser;

	/**评价内容*/
	private java.lang.String assessment;

	/**
	 *方法: 取得pk_user_assessment
	 *@return: java.lang.Integer  pk_user_assessment
	 */
	public java.lang.Integer getPk_user_assessment(){
		return this.pk_user_assessment;
	}

	/**
	 *方法: 设置pk_user_assessment
	 *@param: java.lang.Integer  pk_user_assessment
	 */
	public void setPk_user_assessment(java.lang.Integer pk_user_assessment){
		this.pk_user_assessment = pk_user_assessment;
	}

	/**
	 *方法: 取得pk_user
	 *@return: UserVO  pk_user
	 */
	public UserVO getPk_user(){
		return this.pk_user;
	}

	/**
	 *方法: 设置pk_user
	 *@param: UserVO  pk_user
	 */
	public void setPk_user(UserVO pk_user){
		this.pk_user = pk_user;
	}

	/**
	 *方法: 取得pk_assessmentuser
	 *@return: UserVO  pk_assessmentuser
	 */
	public UserVO getPk_assessmentuser(){
		return this.pk_assessmentuser;
	}

	/**
	 *方法: 设置pk_assessmentuser
	 *@param: UserVO  pk_assessmentuser
	 */
	public void setPk_assessmentuser(UserVO pk_assessmentuser){
		this.pk_assessmentuser = pk_assessmentuser;
	}

	/**
	 *方法: 取得assessment
	 *@return: java.lang.String  assessment
	 */
	public java.lang.String getAssessment(){
		return this.assessment;
	}

	/**
	 *方法: 设置assessment
	 *@param: java.lang.String  assessment
	 */
	public void setAssessment(java.lang.String assessment){
		this.assessment = assessment;
	}

}