package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.bizadviser.myreport.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-08-25 10:59:27
 */
public class KoubeiMarketingDataBizadviserMyreportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8191226994131487326L;

	/** 
	 * 不同uniq_key 返回不同参数，详细请看：https://doc.open.alipay.com/docs/doc.htm?spm=0.0.0.0.1Zq3by&amp;docType=1&amp;articleId=107061&amp;previewCode=F30AA2D06B7CC0817AC7221A8CE288A4
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
