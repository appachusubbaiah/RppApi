package com.ocwen.RppApi.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InvestorRequest {
	@JsonProperty("InvestorName")
	String invName;
	
	@JsonProperty("BrokenReason")
	String brokenReasons;

	public String getBrokenReasons() {
		return brokenReasons;
	}

	public void setBrokenReasons(String brokenReasons) {
		this.brokenReasons = brokenReasons;
	}

	public String getInvName() {
		return invName;
	}

	public void setInvName(String invName) {
		this.invName = invName;
	}
}
