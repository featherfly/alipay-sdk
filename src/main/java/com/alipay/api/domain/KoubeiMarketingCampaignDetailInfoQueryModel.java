package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询活动的详情信息
 *
 * @author auto create
 * @since 1.0, 2017-08-08 19:55:56
 */
public class KoubeiMarketingCampaignDetailInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6151173314839469834L;

	/**
	 * 营销活动id，配合《店铺优惠查询》接口使用，该接口返回camp_list列表中的biz_id则对应该id。
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 适用门店限制返回数量
	 */
	@ApiField("shop_limit_count")
	private Long shopLimitCount;

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public Long getShopLimitCount() {
		return this.shopLimitCount;
	}
	public void setShopLimitCount(Long shopLimitCount) {
		this.shopLimitCount = shopLimitCount;
	}

}
