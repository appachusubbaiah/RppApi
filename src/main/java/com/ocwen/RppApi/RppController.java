package com.ocwen.RppApi;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ocwen.RppApi.Responses.BrokenReasonResponse;
import com.ocwen.RppApi.Responses.DataResponse;
import com.ocwen.RppApi.Responses.InvestorResponse;
import com.ocwen.RppApi.Responses.PeriodResponse;
import com.ocwen.RppApi.requests.InvestorRequest;
import com.ocwen.services.PeriodService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/rpp")
public class RppController {

	/*@RequestMapping("/")
	  String home() {
	    return "Hello World!";
	  }*/
	
	@Autowired
	PeriodService periodService;
	
	/*@GetMapping(path = "/", produces = "application/json")
	public @ResponseBody ResponseEntity<Object> retrievePeriod()
	{
		List<PeriodResponse> pList=null;
		pList=periodService.getPeriods();
		return new ResponseEntity<Object>(pList, HttpStatus.OK);
	}*/
	
	@GetMapping(path = "/brokreasons", produces = "application/json")
	public @ResponseBody ResponseEntity<Object> retrieveBrokenReasons()
	{
		List<BrokenReasonResponse> pList=null;
		pList=periodService.getBrokenReasons();
		return new ResponseEntity<Object>(pList, HttpStatus.OK);
	}
	
	@GetMapping(path = "/investors", produces = "application/json")
	public @ResponseBody ResponseEntity<Object> retrieveInvestors()
	{
		List<InvestorResponse> pList=null;
		pList=periodService.getInvestors();
		return new ResponseEntity<Object>(pList, HttpStatus.OK);
	}
	
	@GetMapping(path = "/", produces = "application/json")
	public @ResponseBody ResponseEntity<Object> retrieveData()
	{
		List<DataResponse> pList=null;
		pList=periodService.getData();
		return new ResponseEntity<Object>(pList, HttpStatus.OK);
	}
	
	@PostMapping(path = "/")
	public @ResponseBody ResponseEntity<Object> retrieveFilteredData(@RequestBody InvestorRequest request, HttpSession session,
			HttpServletResponse httpServletResponse, HttpServletRequest httpServletRequest)
	{
		String investor=request.getInvName();
		String brokenreason=request.getBrokenReasons();
		List<DataResponse> pList=null;
		pList=periodService.getFilteredData(investor,brokenreason);
		return new ResponseEntity<Object>(pList, HttpStatus.OK);
	}
	
	/*@GetMapping(path = "/", produces = "application/json")
	public @ResponseBody ResponseEntity<Object> retrieveData(@PathVariable String period
			,@PathVariable String investor)
	{
		List<DataResponse> pList=null;
		pList=periodService.getData(period,investor);
		return new ResponseEntity<Object>(pList, HttpStatus.OK);
	}*/
	
	/*@GetMapping(path = "/{period}", produces = "application/json")
	public @ResponseBody ResponseEntity<Object> retrieveData(@PathVariable String period)
	{
		List<DataResponse> pList=null;
		pList=periodService.getData(period);
		return new ResponseEntity<Object>(pList, HttpStatus.OK);
	}*/
	
}
