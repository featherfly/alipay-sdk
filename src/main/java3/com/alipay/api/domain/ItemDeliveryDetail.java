package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料生产订单物流详情, 包括物流订单号, 物流公司名称等信息
 *
 * @author auto create
 * @since 1.0, 2017-06-30 10:15:08
 */
public class ItemDeliveryDetail extends AlipayObject {

	private static final long serialVersionUID = 2535621249477152732L;

	/**
	 * 订单明细ID
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 物流公司code, 比如: SF-顺丰, POST-中国邮政, CAINIAO-菜鸟.
	 */
	@ApiField("logistic_code")
	private String logisticCode;

	/**
	 * 物流公司名称
	 */
	@ApiField("logistics_name")
	private String logisticsName;

	/**
	 * 物流订单号
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	public String getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	public String getLogisticCode() {
		return this.logisticCode;
	}
	public void setLogisticCode(String logisticCode) {
		this.logisticCode = logisticCode;
	}

	public String getLogisticsName() {
		return this.logisticsName;
	}
	public void setLogisticsName(String logisticsName) {
		this.logisticsName = logisticsName;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

}
