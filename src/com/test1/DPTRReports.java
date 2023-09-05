package com.test1;

public class DPTRReports {
	private String reportName;
	private String desc;
	private String data;
	private String generatedTime;
	private String transferTime;
	private boolean toBeSent;
	private boolean autoTransfer;
	private String transferType;
	private boolean deltaApplicable;
	private String entityState;
	private int errorCode;

	public DPTRReports() {

	}

	public DPTRReports(String reportName, String desc, String data, String generatedTime, String transferTime,
			boolean toBeSent, boolean autoTransfer, String transferType, boolean deltaApplicable, String entityState,
			int errorCode) {
		super();
		this.reportName = reportName;
		this.desc = desc;
		this.data = data;
		this.generatedTime = generatedTime;
		this.transferTime = transferTime;
		this.toBeSent = toBeSent;
		this.autoTransfer = autoTransfer;
		this.transferType = transferType;
		this.deltaApplicable = deltaApplicable;
		this.entityState = entityState;
		this.errorCode = errorCode;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getGeneratedTime() {
		return generatedTime;
	}

	public void setGeneratedTime(String generatedTime) {
		this.generatedTime = generatedTime;
	}

	public String getTransferTime() {
		return transferTime;
	}

	public void setTransferTime(String transferTime) {
		this.transferTime = transferTime;
	}

	public boolean isToBeSent() {
		return toBeSent;
	}

	public void setToBeSent(boolean toBeSent) {
		this.toBeSent = toBeSent;
	}

	public boolean isAutoTransfer() {
		return autoTransfer;
	}

	public void setAutoTransfer(boolean autoTransfer) {
		this.autoTransfer = autoTransfer;
	}

	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

	public boolean isDeltaApplicable() {
		return deltaApplicable;
	}

	public void setDeltaApplicable(boolean deltaApplicable) {
		this.deltaApplicable = deltaApplicable;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

}
