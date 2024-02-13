package com.ocwen.RppApi.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ocwen.RppApi.Responses.DataResponse;

public class DataRowMapper implements RowMapper<DataResponse> {
	
	@Override
	public DataResponse mapRow(ResultSet rs, int rownum) throws SQLException {
		DataResponse retVal=new DataResponse();
		retVal.setTandiLoancount(rs.getInt("TANDI"));
		retVal.setTotActiveRpp(rs.getInt("TOTACCRPP"));
		retVal.setPeriod(rs.getString("PERIOD"));
		retVal.setPotNewPlans(rs.getInt("POTNEWPLANS"));
		retVal.setRppSatisfied(rs.getInt("RPPCOMPLETED"));
		retVal.setRppBroken(rs.getInt("RPPBroken"));
		retVal.setRppOriginated(rs.getInt("RPPORIGINATED"));
		retVal.setNewDisbTandI(rs.getInt("NEWDISBTANDI"));
		retVal.setNewDisbT(rs.getInt("NEWDISBTAX"));
		retVal.setNewDisbI(rs.getInt("NEWDISBINS"));
		retVal.setDelq(rs.getInt("DELQ"));
		retVal.setFailedSgnAgmt(rs.getInt("FAILEDSIGNAGMT"));
		retVal.setDeath(rs.getInt("DEATH"));
		retVal.setVacancy(rs.getInt("VACANCY"));
		retVal.setBnkrptcy(rs.getInt("BNKRPTCY"));
		retVal.setOneMonth(rs.getInt("1Month"));
		retVal.setTwoMonth(rs.getInt("2Month"));
		retVal.setThreeMonth(rs.getInt("3Month"));
		retVal.setFourMonth(rs.getInt("4Month"));
		retVal.setFiveMonth(rs.getInt("5Month"));
		retVal.setSixMonth(rs.getInt("6Month"));
		retVal.setSevenMonth(rs.getInt("7Month"));
		retVal.setEightMonth(rs.getInt("8Month"));
		retVal.setNineMonth(rs.getInt("9Month"));
		retVal.setTenMonth(rs.getInt("10Month"));
		retVal.setElevenMonth(rs.getInt("11Month"));
		retVal.setTwelveMonth(rs.getInt("12Month"));
		retVal.setThirteenToeighteenMonth(rs.getInt("13To18Month"));
		retVal.setNinteenToTwentyfourMonth(rs.getInt("19To24month"));
		retVal.setGtreterThan24Month(rs.getInt(">24Months"));
		retVal.setNewDisbHOA(rs.getInt("HOA"));
		retVal.setTotalPayments(rs.getInt("TOTALPAYMENTS"));
		retVal.setLoansWithPayments(rs.getInt("LOANSWITHPAYMENTS"));
		retVal.setTaxCount(rs.getInt("TAX"));
		retVal.setInsCount(rs.getInt("INSURANCE"));
		retVal.setTaxAndInsCount(rs.getInt("TAXANDINSURANCE"));
		return retVal;
	}

}
