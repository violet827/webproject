package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@��:OrderVO
 *@����:violet
 *@E-mail:violet_gt@126.com
 *@����:2015-5-8 1
 */

public class OrderVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2770513119246948085L;

	/**����id*/
	private java.lang.Integer pk_order;

	/**�µ�ʱ��*/
	private java.lang.String orderdate;

	/**������Ʒ����   0��Ʒ�� 1�߲�*/
	private java.lang.Integer ordertype;

	/**������Ʒ*/
	private DishVO pk_dish;
	
	/**�����߲�*/
	private VegetableVO pk_vegetable;

	/**�����û�id*/
	private UserVO pk_orderuser;

	/**������Ʒ�ṩ�û�id*/
	private UserVO pk_saler;

	/**�������͵�ַ*/
	private String receiveaddress;

	/**����������ϵ�绰*/
	private java.lang.String telphone;

	/**��������״̬ 0������ 1��ȷ�� 2��ȡ�� 3�����*/
	private java.lang.Integer dealstatus;

	/**��������*/
	private java.lang.Integer ordercount;

	/**�����ܼ�*/
	private java.math.BigDecimal totalprice;

	/**�����ۿۼ�*/
	private java.math.BigDecimal saledprice;

	/**֧��״̬ 0��֧�� 1δ֧��*/
	private java.lang.Integer paystatus;

	/**֧����ʽ 0 ����֧�� 1��������*/
	private java.lang.Integer paytype;

	/**ȡ�˷�ʽ 0 ��� 1��ȡ*/
	private java.lang.Integer getmode;

	/**��Ʒ�ṩ����ַ*/
	private String kitchenaddress;

	/**������ע*/
	private java.lang.String ordermemo;

	/**��Ʒ�����绰*/
	private java.lang.String salertelphone;

	/**��ɾ����� 0δɾ�� 1��ɾ��*/
	private java.lang.Integer buyerdeleteflag;
	
	/**����ɾ����� 0δɾ�� 1��ɾ��*/
	private java.lang.Integer salerdeleteflag;
	
	/**������ 0δ���� 1�ѽ���*/
	private java.lang.Integer balanceflag;
	
	/**��������ͼƬ·��*/
	private java.lang.String imagedir;
	
	/**������32λΨһ����*/
	private java.lang.String orderguid;
	
	/**�г��۸�*/
	private java.math.BigDecimal marketprice;
	
	/**
	 *����: ȡ��pk_order
	 *@return: java.lang.Integer  pk_order
	 */
	public java.lang.Integer getPk_order(){
		return this.pk_order;
	}

	/**
	 *����: ����pk_order
	 *@param: java.lang.Integer  pk_order
	 */
	public void setPk_order(java.lang.Integer pk_order){
		this.pk_order = pk_order;
	}

	/**
	 *����: ȡ��orderdate
	 *@return: java.lang.String  orderdate
	 */
	public java.lang.String getOrderdate(){
		return this.orderdate;
	}

	/**
	 *����: ����orderdate
	 *@param: java.lang.String  orderdate
	 */
	public void setOrderdate(java.lang.String orderdate){
		this.orderdate = orderdate;
	}

	/**
	 *����: ȡ��ordertype
	 *@return: java.lang.Integer  ordertype
	 */
	public java.lang.Integer getOrdertype(){
		return this.ordertype;
	}

	/**
	 *����: ����ordertype
	 *@param: java.lang.Integer  ordertype
	 */
	public void setOrdertype(java.lang.Integer ordertype){
		this.ordertype = ordertype;
	}

	/**
	 *����: ȡ��pk_dish
	 *@return: DishVO  pk_dish
	 */
	public DishVO getPk_dish(){
		return this.pk_dish;
	}

	/**
	 *����: ����pk_dish
	 *@param: DishVO  pk_dish
	 */
	public void setPk_dish(DishVO pk_dish){
		this.pk_dish = pk_dish;
	}

	/**
	 *����: ȡ��pk_orderuser
	 *@return: UserVO  pk_orderuser
	 */
	public UserVO getPk_orderuser(){
		return this.pk_orderuser;
	}

	/**
	 *����: ����pk_orderuser
	 *@param: UserVO  pk_orderuser
	 */
	public void setPk_orderuser(UserVO pk_orderuser){
		this.pk_orderuser = pk_orderuser;
	}

	/**
	 *����: ȡ��pk_saler
	 *@return: UserVO  pk_saler
	 */
	public UserVO getPk_saler(){
		return this.pk_saler;
	}

	/**
	 *����: ����pk_saler
	 *@param: UserVO  pk_saler
	 */
	public void setPk_saler(UserVO pk_saler){
		this.pk_saler = pk_saler;
	}


	/**
	 *����: ȡ��telphone
	 *@return: java.lang.String  telphone
	 */
	public java.lang.String getTelphone(){
		return this.telphone;
	}

	/**
	 *����: ����telphone
	 *@param: java.lang.String  telphone
	 */
	public void setTelphone(java.lang.String telphone){
		this.telphone = telphone;
	}

	/**
	 *����: ȡ��dealstatus
	 *@return: java.lang.String  dealstatus
	 */
	public java.lang.Integer getDealstatus(){
		return this.dealstatus;
	}

	/**
	 *����: ����dealstatus
	 *@param: java.lang.Integer  dealstatus
	 */
	public void setDealstatus(java.lang.Integer dealstatus){
		this.dealstatus = dealstatus;
	}

	/**
	 *����: ȡ��ordercount
	 *@return: java.lang.Integer  ordercount
	 */
	public java.lang.Integer getOrdercount(){
		return this.ordercount;
	}

	/**
	 *����: ����ordercount
	 *@param: java.lang.Integer  ordercount
	 */
	public void setOrdercount(java.lang.Integer ordercount){
		this.ordercount = ordercount;
	}

	/**
	 *����: ȡ��totalprice
	 *@return: java.math.BigDecimal  totalprice
	 */
	public java.math.BigDecimal getTotalprice(){
		return this.totalprice;
	}

	/**
	 *����: ����totalprice
	 *@param: java.math.BigDecimal  totalprice
	 */
	public void setTotalprice(java.math.BigDecimal totalprice){
		this.totalprice = totalprice;
	}

	/**
	 *����: ȡ��saledprice
	 *@return: java.math.BigDecimal  saledprice
	 */
	public java.math.BigDecimal getSaledprice(){
		return this.saledprice;
	}

	/**
	 *����: ����saledprice
	 *@param: java.math.BigDecimal  saledprice
	 */
	public void setSaledprice(java.math.BigDecimal saledprice){
		this.saledprice = saledprice;
	}

	/**
	 *����: ȡ��paystatus
	 *@return: java.lang.Integer  paystatus
	 */
	public java.lang.Integer getPaystatus(){
		return this.paystatus;
	}

	/**
	 *����: ����paystatus
	 *@param: java.lang.Integer  paystatus
	 */
	public void setPaystatus(java.lang.Integer paystatus){
		this.paystatus = paystatus;
	}

	/**
	 *����: ȡ��paytype
	 *@return: java.lang.Integer  paytype
	 */
	public java.lang.Integer getPaytype(){
		return this.paytype;
	}

	/**
	 *����: ����paytype
	 *@param: java.lang.Integer  paytype
	 */
	public void setPaytype(java.lang.Integer paytype){
		this.paytype = paytype;
	}

	/**
	 *����: ȡ��getmode
	 *@return: java.lang.Integer  getmode
	 */
	public java.lang.Integer getGetmode(){
		return this.getmode;
	}

	/**
	 *����: ����getmode
	 *@param: java.lang.Integer  getmode
	 */
	public void setGetmode(java.lang.Integer getmode){
		this.getmode = getmode;
	}

	/**
	 *����: ȡ��ordermemo
	 *@return: java.lang.String  ordermemo
	 */
	public java.lang.String getOrdermemo(){
		return this.ordermemo;
	}

	/**
	 *����: ����ordermemo
	 *@param: java.lang.String  ordermemo
	 */
	public void setOrdermemo(java.lang.String ordermemo){
		this.ordermemo = ordermemo;
	}

	/**
	 *����: ȡ��salertelphone
	 *@return: java.lang.String  salertelphone
	 */
	public java.lang.String getSalertelphone(){
		return this.salertelphone;
	}

	/**
	 *����: ����salertelphone
	 *@param: java.lang.String  salertelphone
	 */
	public void setSalertelphone(java.lang.String salertelphone){
		this.salertelphone = salertelphone;
	}


	public String getReceiveaddress() {
		return receiveaddress;
	}

	public void setReceiveaddress(String receiveaddress) {
		this.receiveaddress = receiveaddress;
	}

	public String getKitchenaddress() {
		return kitchenaddress;
	}

	public void setKitchenaddress(String kitchenaddress) {
		this.kitchenaddress = kitchenaddress;
	}

	public VegetableVO getPk_vegetable() {
		return pk_vegetable;
	}

	public void setPk_vegetable(VegetableVO pk_vegetable) {
		this.pk_vegetable = pk_vegetable;
	}

	public java.lang.Integer getBuyerdeleteflag() {
		return buyerdeleteflag;
	}

	public void setBuyerdeleteflag(java.lang.Integer buyerdeleteflag) {
		this.buyerdeleteflag = buyerdeleteflag;
	}

	public java.lang.Integer getSalerdeleteflag() {
		return salerdeleteflag;
	}

	public void setSalerdeleteflag(java.lang.Integer salerdeleteflag) {
		this.salerdeleteflag = salerdeleteflag;
	}

	public java.lang.Integer getBalanceflag() {
		return balanceflag;
	}

	public void setBalanceflag(java.lang.Integer balanceflag) {
		this.balanceflag = balanceflag;
	}

	public java.lang.String getImagedir() {
		return imagedir;
	}

	public void setImagedir(java.lang.String imagedir) {
		this.imagedir = imagedir;
	}

	public java.lang.String getOrderguid() {
		return orderguid;
	}

	public void setOrderguid(java.lang.String orderguid) {
		this.orderguid = orderguid;
	}

	public java.math.BigDecimal getMarketprice() {
		return marketprice;
	}

	public void setMarketprice(java.math.BigDecimal marketprice) {
		this.marketprice = marketprice;
	}

	
}