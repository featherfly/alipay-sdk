package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.trade.ticket.ticketcode.use response.
 * 
 * @author auto create
 * @since 1.0, 2017-08-29 14:16:26
 */
public class KoubeiTradeTicketTicketcodeUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6666859741996396463L;

	/** 
	 * 用户购买券的时候实际支付的金额
	 */
	@ApiField("buyer_pay_amount")
	private String buyerPayAmount;

	/** 
	 * 用户购买时商品的现价
	 */
	@ApiField("current_price")
	private String currentPrice;

	/** 
	 * 优惠金额，含商家补贴金额和口碑补贴金额
	 */
	@ApiField("discount_amount")
	private String discountAmount;

	/** 
	 * 交易中可给用户开具发票的金额
	 */
	@ApiField("invoice_amount")
	private String invoiceAmount;

	/** 
	 * 口碑商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 用户购买时商品的名称
	 */
	@ApiField("item_name")
	private String itemName;

	/** 
	 * 口碑补贴金额
	 */
	@ApiField("koubei_subsidy_amount")
	private String koubeiSubsidyAmount;

	/** 
	 * 券码所属的订单id
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 用户购买时商品的原价
	 */
	@ApiField("original_price")
	private String originalPrice;

	/** 
	 * 商家实收金额
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/** 
	 * 外部请求号，支持英文字母和数字，由开发者自行定义（不允许重复）
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 12位的券码，券码为纯数字，且唯一不重复
	 */
	@ApiField("ticket_code")
	private String ticketCode;

	/** 
	 * 核销流水号
	 */
	@ApiField("ticket_trans_id")
	private String ticketTransId;

	/** 
	 * 券核销时间
	 */
	@ApiField("use_date")
	private String useDate;

	/** 
	 * 券核销门店ID
	 */
	@ApiField("use_shop_id")
	private String useShopId;

	/** 
	 * 券核销门店名称
	 */
	@ApiField("use_shop_name")
	private String useShopName;

	/** 
	 * 券码对应的凭证资产id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setBuyerPayAmount(String buyerPayAmount) {
		this.buyerPayAmount = buyerPayAmount;
	}
	public String getBuyerPayAmount( ) {
		return this.buyerPayAmount;
	}

	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}
	public String getCurrentPrice( ) {
		return this.currentPrice;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getDiscountAmount( ) {
		return this.discountAmount;
	}

	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public String getInvoiceAmount( ) {
		return this.invoiceAmount;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemName( ) {
		return this.itemName;
	}

	public void setKoubeiSubsidyAmount(String koubeiSubsidyAmount) {
		this.koubeiSubsidyAmount = koubeiSubsidyAmount;
	}
	public String getKoubeiSubsidyAmount( ) {
		return this.koubeiSubsidyAmount;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getOriginalPrice( ) {
		return this.originalPrice;
	}

	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}
	public String getReceiptAmount( ) {
		return this.receiptAmount;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}
	public String getTicketCode( ) {
		return this.ticketCode;
	}

	public void setTicketTransId(String ticketTransId) {
		this.ticketTransId = ticketTransId;
	}
	public String getTicketTransId( ) {
		return this.ticketTransId;
	}

	public void setUseDate(String useDate) {
		this.useDate = useDate;
	}
	public String getUseDate( ) {
		return this.useDate;
	}

	public void setUseShopId(String useShopId) {
		this.useShopId = useShopId;
	}
	public String getUseShopId( ) {
		return this.useShopId;
	}

	public void setUseShopName(String useShopName) {
		this.useShopName = useShopName;
	}
	public String getUseShopName( ) {
		return this.useShopName;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
