package com.ocwen.RppApi.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ocwen.RppApi.Responses.BrokenReasonResponse;

public class BrokenReasonRowMapper implements RowMapper<BrokenReasonResponse>{

	@Override
	public BrokenReasonResponse mapRow(ResultSet rs, int rownum) throws SQLException {
		BrokenReasonResponse retVal=new BrokenReasonResponse();
		retVal.setBrokenReason(rs.getString("TASK_NOTE"));
		return retVal;
	}
	
}
