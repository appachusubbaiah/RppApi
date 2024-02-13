package com.ocwen.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ocwen.RppApi.Responses.BrokenReasonResponse;
import com.ocwen.RppApi.Responses.DataResponse;
import com.ocwen.RppApi.Responses.InvestorResponse;
import com.ocwen.RppApi.Responses.PeriodResponse;
import com.ocwen.repositories.JdbcPeriodRepository;

@Component
public class PeriodService {
	
	@Autowired
	JdbcPeriodRepository periodRepository;
	
	public List<PeriodResponse> getPeriods()
	{
		return periodRepository.getPeriods();
	}

	public List<InvestorResponse> getInvestors()
	{
		return periodRepository.getInvestors();
	}
	
	public List<DataResponse> getData(String period,String investor,String brokenreason)
	{
		return periodRepository.getData(period,investor,brokenreason);
	}

	public List<DataResponse> getData(String period)
	{
		return periodRepository.getData(period);
	}
	
	public List<BrokenReasonResponse> getBrokenReasons(){
		return periodRepository.getBrokenReasons();
	}
	
	public List<DataResponse> getData()
	{
		List<DataResponse> dataResponses = new ArrayList<>();
		List<PeriodResponse> lPeriods =periodRepository.getPeriods();
		lPeriods.stream().forEach(
				(l)-> 
							dataResponses.addAll(periodRepository.getData(l.getPeriod())));
		return dataResponses;
	}
	
	public List<DataResponse> getFilteredData(String investor,String brokenreason)
	{
		List<DataResponse> dataResponses = new ArrayList<>();
		List<PeriodResponse> lPeriods =periodRepository.getPeriods();
		lPeriods.stream().forEach(
				(l)-> 
							dataResponses.addAll(periodRepository.getData(l.getPeriod(),investor,brokenreason)));
		return dataResponses;
	}
}
