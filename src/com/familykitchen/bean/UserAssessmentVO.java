package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@��:UserAssessmentVO
 *@����:violet
 *@E-mail:violet_gt@126.com
 *@����:2015-5-8 1
 */

public class UserAssessmentVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3674846923986225000L;

	/**�û�����id*/
	private java.lang.Integer pk_user_assessment;

	/**�û�id*/
	private UserVO pk_user;

	/**�����û�id*/
	private UserVO pk_assessmentuser;

	/**��������*/
	private java.lang.String assessment;

	/**
	 *����: ȡ��pk_user_assessment
	 *@return: java.lang.Integer  pk_user_assessment
	 */
	public java.lang.Integer getPk_user_assessment(){
		return this.pk_user_assessment;
	}

	/**
	 *����: ����pk_user_assessment
	 *@param: java.lang.Integer  pk_user_assessment
	 */
	public void setPk_user_assessment(java.lang.Integer pk_user_assessment){
		this.pk_user_assessment = pk_user_assessment;
	}

	/**
	 *����: ȡ��pk_user
	 *@return: UserVO  pk_user
	 */
	public UserVO getPk_user(){
		return this.pk_user;
	}

	/**
	 *����: ����pk_user
	 *@param: UserVO  pk_user
	 */
	public void setPk_user(UserVO pk_user){
		this.pk_user = pk_user;
	}

	/**
	 *����: ȡ��pk_assessmentuser
	 *@return: UserVO  pk_assessmentuser
	 */
	public UserVO getPk_assessmentuser(){
		return this.pk_assessmentuser;
	}

	/**
	 *����: ����pk_assessmentuser
	 *@param: UserVO  pk_assessmentuser
	 */
	public void setPk_assessmentuser(UserVO pk_assessmentuser){
		this.pk_assessmentuser = pk_assessmentuser;
	}

	/**
	 *����: ȡ��assessment
	 *@return: java.lang.String  assessment
	 */
	public java.lang.String getAssessment(){
		return this.assessment;
	}

	/**
	 *����: ����assessment
	 *@param: java.lang.String  assessment
	 */
	public void setAssessment(java.lang.String assessment){
		this.assessment = assessment;
	}

}