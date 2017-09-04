package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.aboard.apply response.
 * 
 * @author auto create
 * @since 1.0, 2017-08-07 17:11:45
 */
public class AlipayOpenPublicLifeAboardApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1284852911352738471L;

	/** 
	 * 上架成功后返回的提示
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
