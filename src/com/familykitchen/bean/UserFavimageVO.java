package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@类:UserFavimageVO
 *@作者:violet
 *@E-mail:violet_gt@126.com
 *@日期:2015-5-8 1
 */

public class UserFavimageVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6164160690248896417L;

	/**用户收藏id*/
	private java.lang.Integer pk_user_favimage;

	/**用户id*/
	private UserVO pk_user;

	/**收藏图片路径*/
	private String imagepath;

	/**
	 *方法: 取得pk_user_favimage
	 *@return: java.lang.Integer  pk_user_favimage
	 */
	public java.lang.Integer getPk_user_favimage(){
		return this.pk_user_favimage;
	}

	/**
	 *方法: 设置pk_user_favimage
	 *@param: java.lang.Integer  pk_user_favimage
	 */
	public void setPk_user_favimage(java.lang.Integer pk_user_favimage){
		this.pk_user_favimage = pk_user_favimage;
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
	 *方法: 取得imagepath
	 *@return: String  imagepath
	 */
	public String getImagepath(){
		return this.imagepath;
	}

	/**
	 *方法: 设置imagepath
	 *@param: String  imagepath
	 */
	public void setImagepath(String imagepath){
		this.imagepath = imagepath;
	}

}