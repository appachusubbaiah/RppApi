package com.ocwen.repositories;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.ocwen.RppApi.Responses.BrokenReasonResponse;
import com.ocwen.RppApi.Responses.DataResponse;
import com.ocwen.RppApi.Responses.InvestorResponse;
import com.ocwen.RppApi.Responses.PeriodResponse;
import com.ocwen.RppApi.rowmappers.BrokenReasonRowMapper;
import com.ocwen.RppApi.rowmappers.DataRowMapper;
import com.ocwen.RppApi.rowmappers.InvesrorRowMapper;
import com.ocwen.RppApi.rowmappers.PeriodRowmapper;

import oracle.jdbc.OracleTypes;

@Repository
@Component
public class JdbcPeriodRepository implements PeriodRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public List<PeriodResponse> getPeriods() {
		/*return  jdbcTemplate.query(
                "select distinct period_description as period from RPPTANDILOANCOUNT",
                new Object[]{},
                (rs, rowNum) ->
                        new PeriodResponse(
                                rs.getString("period")
                         )
        );*/
		
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("RPP_SUITE")
		        .withProcedureName("sp_find_period");
		simpleJdbcCall.addDeclaredParameter(
		            //new SqlParameter("order_by", Types.NVARCHAR),
		            //new SqlParameter("direction", Types.VARCHAR),
		            //new SqlParameter("limit_", Types.INTEGER),
		            //new SqlParameter("offset_", Types.INTEGER),
		            new SqlOutParameter("p_result", OracleTypes.CURSOR, new PeriodRowmapper()));
		
		Map<String, Object> resultMap = simpleJdbcCall.execute();
		List<PeriodResponse> pList=null;
		if(resultMap!=null)
			pList=(List<PeriodResponse>) resultMap.get("p_result");
		return pList;
	}
	
	@Override
	public List<DataResponse> getData(String period,String investor,String brokenReason) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("RPP_SUITE")
		        .withProcedureName("SP_GET_RPPDATA");
		simpleJdbcCall.addDeclaredParameter(new SqlParameter("period", OracleTypes.VARCHAR));
		simpleJdbcCall.addDeclaredParameter(new SqlParameter("inv", OracleTypes.CLOB));
		simpleJdbcCall.addDeclaredParameter(new SqlParameter("brok", OracleTypes.VARCHAR));
		simpleJdbcCall.addDeclaredParameter(new SqlOutParameter("p_result", OracleTypes.CURSOR, new DataRowMapper()));
		
		Map<String, Object> resultMap = simpleJdbcCall.execute(period,investor,brokenReason);
		List<DataResponse> pList=null;
		if(resultMap!=null)
			pList=(List<DataResponse>) resultMap.get("p_result");
		return pList;
		
	}
	
	@Override
	public List<DataResponse> getData(String period) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("RPP_SUITE")
		        .withProcedureName("SP_GET_RPPDATA");
		simpleJdbcCall.addDeclaredParameter(new SqlParameter("period", OracleTypes.VARCHAR));
		simpleJdbcCall.addDeclaredParameter(new SqlParameter("investor", OracleTypes.NULL));
		simpleJdbcCall.addDeclaredParameter(new SqlParameter("brok", OracleTypes.NULL));
		simpleJdbcCall.addDeclaredParameter(new SqlOutParameter("p_result", OracleTypes.CURSOR, new DataRowMapper()));
		
		Map<String, Object> resultMap = simpleJdbcCall.execute(period,null,null);
		List<DataResponse> pList=null;
		if(resultMap!=null)
			pList=(List<DataResponse>) resultMap.get("p_result");
		return pList;
		
	}

	@Override
	public List<InvestorResponse> getInvestors() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("RPP_SUITE")
		        .withProcedureName("SP_GET_INVESTORS");
		simpleJdbcCall.addDeclaredParameter(
		            new SqlOutParameter("p_result", OracleTypes.CURSOR, new InvesrorRowMapper()));
		
		Map<String, Object> resultMap = simpleJdbcCall.execute();
		List<InvestorResponse> pList=null;
		if(resultMap!=null)
			pList=(List<InvestorResponse>) resultMap.get("p_result");
		return pList;
	}

	@Override
	public List<BrokenReasonResponse> getBrokenReasons() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("RPP_SUITE")
		        .withProcedureName("SP_GET_BROKENREASONS");
		simpleJdbcCall.addDeclaredParameter(
		            new SqlOutParameter("p_result", OracleTypes.CURSOR, new BrokenReasonRowMapper()));
		
		Map<String, Object> resultMap = simpleJdbcCall.execute();
		List<BrokenReasonResponse> pList=null;
		if(resultMap!=null)
			pList=(List<BrokenReasonResponse>) resultMap.get("p_result");
		return pList;
	}
}
