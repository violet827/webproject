package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@��:DishTasteTypeVO
 *@����:violet
 *@E-mail:violet_gt@126.com
 *@����:2015-5-8 1
 */

public class DishTasteTypeVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2241814061837469323L;

	/**��ζid*/
	private java.lang.Integer pk_dishtastetype;

	/**��ζ����*/
	private java.lang.String tastename;

	/**
	 *����: ȡ��pk_dishtastetype
	 *@return: java.lang.Integer  pk_dishtastetype
	 */
	public java.lang.Integer getPk_dishtastetype(){
		return this.pk_dishtastetype;
	}

	/**
	 *����: ����pk_dishtastetype
	 *@param: java.lang.Integer  pk_dishtastetype
	 */
	public void setPk_dishtastetype(java.lang.Integer pk_dishtastetype){
		this.pk_dishtastetype = pk_dishtastetype;
	}

	/**
	 *����: ȡ��tastename
	 *@return: java.lang.String  tastename
	 */
	public java.lang.String getTastename(){
		return this.tastename;
	}

	/**
	 *����: ����tastename
	 *@param: java.lang.String  tastename
	 */
	public void setTastename(java.lang.String tastename){
		this.tastename = tastename;
	}

}