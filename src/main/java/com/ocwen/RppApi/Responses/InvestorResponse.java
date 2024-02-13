package com.ocwen.RppApi.Responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InvestorResponse {
private String investor;

@JsonProperty("InvestorName")
public String getInvestor() {
	return investor;
}

public void setInvestor(String investor) {
	this.investor = investor;
}

	
}
