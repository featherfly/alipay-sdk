package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlisisReportRow;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.alisis.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-16 20:33:11
 */
public class KoubeiMarketingDataAlisisReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7548896387342398653L;

	/** 
	 * 报表数据
	 */
	@ApiListField("report_data")
	@ApiField("alisis_report_row")
	private List<AlisisReportRow> reportData;

	public void setReportData(List<AlisisReportRow> reportData) {
		this.reportData = reportData;
	}
	public List<AlisisReportRow> getReportData( ) {
		return this.reportData;
	}

}
