package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@��:UserFavimageVO
 *@����:violet
 *@E-mail:violet_gt@126.com
 *@����:2015-5-8 1
 */

public class UserFavimageVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6164160690248896417L;

	/**�û��ղ�id*/
	private java.lang.Integer pk_user_favimage;

	/**�û�id*/
	private UserVO pk_user;

	/**�ղ�ͼƬ·��*/
	private String imagepath;

	/**
	 *����: ȡ��pk_user_favimage
	 *@return: java.lang.Integer  pk_user_favimage
	 */
	public java.lang.Integer getPk_user_favimage(){
		return this.pk_user_favimage;
	}

	/**
	 *����: ����pk_user_favimage
	 *@param: java.lang.Integer  pk_user_favimage
	 */
	public void setPk_user_favimage(java.lang.Integer pk_user_favimage){
		this.pk_user_favimage = pk_user_favimage;
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
	 *����: ȡ��imagepath
	 *@return: String  imagepath
	 */
	public String getImagepath(){
		return this.imagepath;
	}

	/**
	 *����: ����imagepath
	 *@param: String  imagepath
	 */
	public void setImagepath(String imagepath){
		this.imagepath = imagepath;
	}

}