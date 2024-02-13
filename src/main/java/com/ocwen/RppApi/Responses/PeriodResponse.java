package com.ocwen.RppApi.Responses;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class PeriodResponse {

	private String period;

	public PeriodResponse()
	{
		super();
	}
	public PeriodResponse(String period)
	{
		this.period=period;
	}
	
	@JsonProperty("Period")
	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}
	
}
