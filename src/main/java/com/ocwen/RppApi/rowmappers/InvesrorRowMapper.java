package com.ocwen.RppApi.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ocwen.RppApi.Responses.InvestorResponse;

public class InvesrorRowMapper implements RowMapper<InvestorResponse> {

	@Override
	public InvestorResponse mapRow(ResultSet rs, int rownum) throws SQLException {
		InvestorResponse retVal=new InvestorResponse();
		retVal.setInvestor(rs.getString("INVESTOR_NAME"));
		return retVal;
	}

}
