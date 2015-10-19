package com.familykitchen.bean;

import java.io.Serializable;

/**
 *@类:OrderVO
 *@作者:violet
 *@E-mail:violet_gt@126.com
 *@日期:2015-5-8 1
 */

public class OrderVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2770513119246948085L;

	/**订单id*/
	private java.lang.Integer pk_order;

	/**下单时间*/
	private java.lang.String orderdate;

	/**订单菜品类型   0成品菜 1蔬菜*/
	private java.lang.Integer ordertype;

	/**订单菜品*/
	private DishVO pk_dish;
	
	/**订单蔬菜*/
	private VegetableVO pk_vegetable;

	/**订单用户id*/
	private UserVO pk_orderuser;

	/**订单菜品提供用户id*/
	private UserVO pk_saler;

	/**订单配送地址*/
	private String receiveaddress;

	/**订单配送联系电话*/
	private java.lang.String telphone;

	/**订单处理状态 0待处理 1已确认 2已取消 3已完成*/
	private java.lang.Integer dealstatus;

	/**订单数量*/
	private java.lang.Integer ordercount;

	/**订单总价*/
	private java.math.BigDecimal totalprice;

	/**订单折扣价*/
	private java.math.BigDecimal saledprice;

	/**支付状态 0已支付 1未支付*/
	private java.lang.Integer paystatus;

	/**支付方式 0 在线支付 1货到付款*/
	private java.lang.Integer paytype;

	/**取菜方式 0 快递 1自取*/
	private java.lang.Integer getmode;

	/**菜品提供方地址*/
	private String kitchenaddress;

	/**订单备注*/
	private java.lang.String ordermemo;

	/**菜品卖方电话*/
	private java.lang.String salertelphone;

	/**买方删除标记 0未删除 1已删除*/
	private java.lang.Integer buyerdeleteflag;
	
	/**卖方删除标记 0未删除 1已删除*/
	private java.lang.Integer salerdeleteflag;
	
	/**结算标记 0未结算 1已结算*/
	private java.lang.Integer balanceflag;
	
	/**订单内容图片路径*/
	private java.lang.String imagedir;
	
	/**订单的32位唯一编码*/
	private java.lang.String orderguid;
	
	/**市场价格*/
	private java.math.BigDecimal marketprice;
	
	/**
	 *方法: 取得pk_order
	 *@return: java.lang.Integer  pk_order
	 */
	public java.lang.Integer getPk_order(){
		return this.pk_order;
	}

	/**
	 *方法: 设置pk_order
	 *@param: java.lang.Integer  pk_order
	 */
	public void setPk_order(java.lang.Integer pk_order){
		this.pk_order = pk_order;
	}

	/**
	 *方法: 取得orderdate
	 *@return: java.lang.String  orderdate
	 */
	public java.lang.String getOrderdate(){
		return this.orderdate;
	}

	/**
	 *方法: 设置orderdate
	 *@param: java.lang.String  orderdate
	 */
	public void setOrderdate(java.lang.String orderdate){
		this.orderdate = orderdate;
	}

	/**
	 *方法: 取得ordertype
	 *@return: java.lang.Integer  ordertype
	 */
	public java.lang.Integer getOrdertype(){
		return this.ordertype;
	}

	/**
	 *方法: 设置ordertype
	 *@param: java.lang.Integer  ordertype
	 */
	public void setOrdertype(java.lang.Integer ordertype){
		this.ordertype = ordertype;
	}

	/**
	 *方法: 取得pk_dish
	 *@return: DishVO  pk_dish
	 */
	public DishVO getPk_dish(){
		return this.pk_dish;
	}

	/**
	 *方法: 设置pk_dish
	 *@param: DishVO  pk_dish
	 */
	public void setPk_dish(DishVO pk_dish){
		this.pk_dish = pk_dish;
	}

	/**
	 *方法: 取得pk_orderuser
	 *@return: UserVO  pk_orderuser
	 */
	public UserVO getPk_orderuser(){
		return this.pk_orderuser;
	}

	/**
	 *方法: 设置pk_orderuser
	 *@param: UserVO  pk_orderuser
	 */
	public void setPk_orderuser(UserVO pk_orderuser){
		this.pk_orderuser = pk_orderuser;
	}

	/**
	 *方法: 取得pk_saler
	 *@return: UserVO  pk_saler
	 */
	public UserVO getPk_saler(){
		return this.pk_saler;
	}

	/**
	 *方法: 设置pk_saler
	 *@param: UserVO  pk_saler
	 */
	public void setPk_saler(UserVO pk_saler){
		this.pk_saler = pk_saler;
	}


	/**
	 *方法: 取得telphone
	 *@return: java.lang.String  telphone
	 */
	public java.lang.String getTelphone(){
		return this.telphone;
	}

	/**
	 *方法: 设置telphone
	 *@param: java.lang.String  telphone
	 */
	public void setTelphone(java.lang.String telphone){
		this.telphone = telphone;
	}

	/**
	 *方法: 取得dealstatus
	 *@return: java.lang.String  dealstatus
	 */
	public java.lang.Integer getDealstatus(){
		return this.dealstatus;
	}

	/**
	 *方法: 设置dealstatus
	 *@param: java.lang.Integer  dealstatus
	 */
	public void setDealstatus(java.lang.Integer dealstatus){
		this.dealstatus = dealstatus;
	}

	/**
	 *方法: 取得ordercount
	 *@return: java.lang.Integer  ordercount
	 */
	public java.lang.Integer getOrdercount(){
		return this.ordercount;
	}

	/**
	 *方法: 设置ordercount
	 *@param: java.lang.Integer  ordercount
	 */
	public void setOrdercount(java.lang.Integer ordercount){
		this.ordercount = ordercount;
	}

	/**
	 *方法: 取得totalprice
	 *@return: java.math.BigDecimal  totalprice
	 */
	public java.math.BigDecimal getTotalprice(){
		return this.totalprice;
	}

	/**
	 *方法: 设置totalprice
	 *@param: java.math.BigDecimal  totalprice
	 */
	public void setTotalprice(java.math.BigDecimal totalprice){
		this.totalprice = totalprice;
	}

	/**
	 *方法: 取得saledprice
	 *@return: java.math.BigDecimal  saledprice
	 */
	public java.math.BigDecimal getSaledprice(){
		return this.saledprice;
	}

	/**
	 *方法: 设置saledprice
	 *@param: java.math.BigDecimal  saledprice
	 */
	public void setSaledprice(java.math.BigDecimal saledprice){
		this.saledprice = saledprice;
	}

	/**
	 *方法: 取得paystatus
	 *@return: java.lang.Integer  paystatus
	 */
	public java.lang.Integer getPaystatus(){
		return this.paystatus;
	}

	/**
	 *方法: 设置paystatus
	 *@param: java.lang.Integer  paystatus
	 */
	public void setPaystatus(java.lang.Integer paystatus){
		this.paystatus = paystatus;
	}

	/**
	 *方法: 取得paytype
	 *@return: java.lang.Integer  paytype
	 */
	public java.lang.Integer getPaytype(){
		return this.paytype;
	}

	/**
	 *方法: 设置paytype
	 *@param: java.lang.Integer  paytype
	 */
	public void setPaytype(java.lang.Integer paytype){
		this.paytype = paytype;
	}

	/**
	 *方法: 取得getmode
	 *@return: java.lang.Integer  getmode
	 */
	public java.lang.Integer getGetmode(){
		return this.getmode;
	}

	/**
	 *方法: 设置getmode
	 *@param: java.lang.Integer  getmode
	 */
	public void setGetmode(java.lang.Integer getmode){
		this.getmode = getmode;
	}

	/**
	 *方法: 取得ordermemo
	 *@return: java.lang.String  ordermemo
	 */
	public java.lang.String getOrdermemo(){
		return this.ordermemo;
	}

	/**
	 *方法: 设置ordermemo
	 *@param: java.lang.String  ordermemo
	 */
	public void setOrdermemo(java.lang.String ordermemo){
		this.ordermemo = ordermemo;
	}

	/**
	 *方法: 取得salertelphone
	 *@return: java.lang.String  salertelphone
	 */
	public java.lang.String getSalertelphone(){
		return this.salertelphone;
	}

	/**
	 *方法: 设置salertelphone
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