package com.ocwen.RppApi.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.ocwen.RppApi.Responses.PeriodResponse;

public class PeriodRowmapper implements RowMapper<PeriodResponse> {
	
	@Override
	public PeriodResponse mapRow(ResultSet rs, int rownum) throws SQLException {
		PeriodResponse retVal=new PeriodResponse();
		retVal.setPeriod(rs.getString("period_description"));
		return retVal;
	}

}
