package com.test1;

public class DPTRTeportsEmailConfig {
	private String reportName;
	private String fromMail;
	private String userId;
	private String emailId;
	private String transferMode;
	private boolean cc;
	private boolean bcc;
	private int errorCode;
	private String errorSeverity;
	private String entityState;

	public DPTRTeportsEmailConfig() {

	}

	public DPTRTeportsEmailConfig(String reportName, String fromMail, String userId, String emailId,
			String transferMode, boolean cc, boolean bcc, int errorCode, String errorSeverity, String entityState) {
		super();
		this.reportName = reportName;
		this.fromMail = fromMail;
		this.userId = userId;
		this.emailId = emailId;
		this.transferMode = transferMode;
		this.cc = cc;
		this.bcc = bcc;
		this.errorCode = errorCode;
		this.errorSeverity = errorSeverity;
		this.entityState = entityState;
	}

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getFromMail() {
		return fromMail;
	}

	public void setFromMail(String fromMail) {
		this.fromMail = fromMail;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getTransferMode() {
		return transferMode;
	}

	public void setTransferMode(String transferMode) {
		this.transferMode = transferMode;
	}

	public boolean isCc() {
		return cc;
	}

	public void setCc(boolean cc) {
		this.cc = cc;
	}

	public boolean isBcc() {
		return bcc;
	}

	public void setBcc(boolean bcc) {
		this.bcc = bcc;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorSeverity() {
		return errorSeverity;
	}

	public void setErrorSeverity(String errorSeverity) {
		this.errorSeverity = errorSeverity;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
