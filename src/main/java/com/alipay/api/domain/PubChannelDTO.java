package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡模板投放渠道
 *
 * @author auto create
 * @since 1.0, 2017-08-21 19:56:28
 */
public class PubChannelDTO extends AlipayObject {

	private static final long serialVersionUID = 4741912435326559743L;

	/**
	 * 扩展信息，无需配置
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 1、SHOP_DETAIL:店铺详情页 
2、PAYMENT_RESULT: 支付成功页（支付成功页暂不支持）
	 */
	@ApiField("pub_channel")
	private String pubChannel;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getPubChannel() {
		return this.pubChannel;
	}
	public void setPubChannel(String pubChannel) {
		this.pubChannel = pubChannel;
	}

}
