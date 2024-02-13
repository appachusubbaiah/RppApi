package com.ocwen.RppApi.Responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BrokenReasonResponse {

	private String brokenReason;

	public BrokenReasonResponse()
	{
		super();
	}
	
	@JsonProperty("BrokenReason")
	public String getBrokenReason() {
		return brokenReason;
	}

	public void setBrokenReason(String brokenReason) {
		this.brokenReason = brokenReason;
	}
	
}
