package com.ocwen.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ocwen.RppApi.Responses.BrokenReasonResponse;
import com.ocwen.RppApi.Responses.DataResponse;
import com.ocwen.RppApi.Responses.InvestorResponse;
import com.ocwen.RppApi.Responses.PeriodResponse;

@Repository
public interface PeriodRepository {
	List<PeriodResponse> getPeriods();
	List<BrokenReasonResponse> getBrokenReasons();
	public List<DataResponse> getData(String period,String investor,String brokenReason);
	public List<DataResponse> getData(String period);
	List<InvestorResponse> getInvestors();
}
