package com.test1;

public class DPTRReportTransfer {
	private String reportName;
	private String transferMode;
	private String fileLocation;
	private String targetSystem;
	private String targetLocation;
	private String transferTime;
	private boolean deltaFileLocation;
	private String scriptName;
	private int errorCode;
	private String errorSeverity;
	private String entityState;

	public DPTRReportTransfer() {

	}

	public DPTRReportTransfer(String reportName, String transferMode, String fileLocation, String targetSystem,
			String targetLocation, String transferTime, boolean deltaFileLocation, String scriptName, int errorCode,
			String errorSeverity, String entityState) {
		super();
		this.reportName = reportName;
		this.transferMode = transferMode;
		this.fileLocation = fileLocation;
		this.targetSystem = targetSystem;
		this.targetLocation = targetLocation;
		this.transferTime = transferTime;
		this.deltaFileLocation = deltaFileLocation;
		this.scriptName = scriptName;
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

	public String getTransferMode() {
		return transferMode;
	}

	public void setTransferMode(String transferMode) {
		this.transferMode = transferMode;
	}

	public String getFileLocation() {
		return fileLocation;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public String getTargetSystem() {
		return targetSystem;
	}

	public void setTargetSystem(String targetSystem) {
		this.targetSystem = targetSystem;
	}

	public String getTargetLocation() {
		return targetLocation;
	}

	public void setTargetLocation(String targetLocation) {
		this.targetLocation = targetLocation;
	}

	public String getTransferTime() {
		return transferTime;
	}

	public void setTransferTime(String transferTime) {
		this.transferTime = transferTime;
	}

	public boolean isDeltaFileLocation() {
		return deltaFileLocation;
	}

	public void setDeltaFileLocation(boolean deltaFileLocation) {
		this.deltaFileLocation = deltaFileLocation;
	}

	public String getScriptName() {
		return scriptName;
	}

	public void setScriptName(String scriptName) {
		this.scriptName = scriptName;
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
