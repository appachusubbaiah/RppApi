package com.ocwen.RppApi.Responses;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class DataResponse {
	
	private int tandiLoancount;
	private int totActiveRpp;
	private int potNewPlans;
	private int rppSatisfied;
	private int rppBroken;
	private int rppOriginated;
	private int newDisbTandI;
	private int newDisbT;
	private int newDisbI;
	private int newDisbHOA;
	private int delq;
	private int failedSgnAgmt;
	private int death;
	private int vacancy;
	private int oneMonth;
	private int twoMonth;
	private int threeMonth;
	private int fourMonth;
	private int fiveMonth;
	private int sixMonth;
	private int sevenMonth;
	private int eightMonth;
	private int nineMonth;
	private int tenMonth;
	private int elevenMonth;
	private int twelveMonth;
	private int thirteenToeighteenMonth;
	private int ninteenToTwentyfourMonth;
	private int gtreterThan24Month;
	private int totalPayments;
	private int loansWithPayments;
	private int taxCount;
	private int insCount;
	private int taxAndInsCount;
	
	@JsonProperty("Tax")
	public int getTaxCount() {
		return taxCount;
	}
	public void setTaxCount(int taxCount) {
		this.taxCount = taxCount;
	}
	
	@JsonProperty("Ins")
	public int getInsCount() {
		return insCount;
	}
	public void setInsCount(int insCount) {
		this.insCount = insCount;
	}
	
	@JsonProperty("TaxAndIns")
	public int getTaxAndInsCount() {
		return taxAndInsCount;
	}
	public void setTaxAndInsCount(int taxAndInsCount) {
		this.taxAndInsCount = taxAndInsCount;
	}
	@JsonProperty("TotalPayments")
	public int getTotalPayments() {
		return totalPayments;
	}
	public void setTotalPayments(int totalPayments) {
		this.totalPayments = totalPayments;
	}
	
	@JsonProperty("LoansWithPayments")
	public int getLoansWithPayments() {
		return loansWithPayments;
	}
	public void setLoansWithPayments(int loansWithPayments) {
		this.loansWithPayments = loansWithPayments;
	}
	
	@JsonProperty("1Month")
	public int getOneMonth() {
		return oneMonth;
	}
	public void setOneMonth(int oneMonth) {
		this.oneMonth = oneMonth;
	}
	@JsonProperty("2Month")
	public int getTwoMonth() {
		return twoMonth;
	}
	public void setTwoMonth(int twoMonth) {
		this.twoMonth = twoMonth;
	}
	
	@JsonProperty("3Month")
	public int getThreeMonth() {
		return threeMonth;
	}
	@JsonProperty("1Month")
	public void setThreeMonth(int threeMonth) {
		this.threeMonth = threeMonth;
	}
	
	@JsonProperty("4Month")
	public int getFourMonth() {
		return fourMonth;
	}
	public void setFourMonth(int fourMonth) {
		this.fourMonth = fourMonth;
	}
	
	@JsonProperty("5Month")
	public int getFiveMonth() {
		return fiveMonth;
	}
	public void setFiveMonth(int fiveMonth) {
		this.fiveMonth = fiveMonth;
	}
	
	@JsonProperty("6Month")
	public int getSixMonth() {
		return sixMonth;
	}
	public void setSixMonth(int sixMonth) {
		this.sixMonth = sixMonth;
	}
	
	@JsonProperty("7Month")
	public int getSevenMonth() {
		return sevenMonth;
	}
	public void setSevenMonth(int sevenMonth) {
		this.sevenMonth = sevenMonth;
	}
	
	@JsonProperty("8Month")
	public int getEightMonth() {
		return eightMonth;
	}
	public void setEightMonth(int eightMonth) {
		this.eightMonth = eightMonth;
	}
	
	@JsonProperty("9Month")
	public int getNineMonth() {
		return nineMonth;
	}
	public void setNineMonth(int nineMonth) {
		this.nineMonth = nineMonth;
	}
	
	@JsonProperty("10Month")
	public int getTenMonth() {
		return tenMonth;
	}
	public void setTenMonth(int tenMonth) {
		this.tenMonth = tenMonth;
	}
	
	@JsonProperty("11Month")
	public int getElevenMonth() {
		return elevenMonth;
	}
	public void setElevenMonth(int elevenMonth) {
		this.elevenMonth = elevenMonth;
	}
	
	@JsonProperty("12Month")
	public int getTwelveMonth() {
		return twelveMonth;
	}
	public void setTwelveMonth(int twelveMonth) {
		this.twelveMonth = twelveMonth;
	}
	
	@JsonProperty("13-18Month")
	public int getThirteenToeighteenMonth() {
		return thirteenToeighteenMonth;
	}
	public void setThirteenToeighteenMonth(int thirteenToeighteenMonth) {
		this.thirteenToeighteenMonth = thirteenToeighteenMonth;
	}
	
	@JsonProperty("19-24Month")
	public int getNinteenToTwentyfourMonth() {
		return ninteenToTwentyfourMonth;
	}
	public void setNinteenToTwentyfourMonth(int ninteenToTwentyfourMonth) {
		this.ninteenToTwentyfourMonth = ninteenToTwentyfourMonth;
	}
	
	@JsonProperty(">24Month")
	public int getGtreterThan24Month() {
		return gtreterThan24Month;
	}
	public void setGtreterThan24Month(int gtreterThan24Month) {
		this.gtreterThan24Month = gtreterThan24Month;
	}
	@JsonProperty("NewDisbursementTandI")
	public int getNewDisbTandI() {
		return newDisbTandI;
	}
	public void setNewDisbTandI(int newDisbTandI) {
		this.newDisbTandI = newDisbTandI;
	}
	
	@JsonProperty("NewDisbursementTax")
	public int getNewDisbT() {
		return newDisbT;
	}
	public void setNewDisbT(int newDisbT) {
		this.newDisbT = newDisbT;
	}
	
	@JsonProperty("NewDisbursementIns")
	public int getNewDisbI() {
		return newDisbI;
	}
	public void setNewDisbI(int newDisbI) {
		this.newDisbI = newDisbI;
	}
	
	@JsonProperty("61Daysdelq")
	public int getDelq() {
		return delq;
	}
	public void setDelq(int delq) {
		this.delq = delq;
	}
	
	@JsonProperty("FailedSignedAgreement")
	public int getFailedSgnAgmt() {
		return failedSgnAgmt;
	}
	public void setFailedSgnAgmt(int failedSgnAgmt) {
		this.failedSgnAgmt = failedSgnAgmt;
	}
	
	@JsonProperty("Death")
	public int getDeath() {
		return death;
	}
	public void setDeath(int death) {
		this.death = death;
	}
	
	@JsonProperty("Vacancy")
	public int getVacancy() {
		return vacancy;
	}
	public void setVacancy(int vacancy) {
		this.vacancy = vacancy;
	}
	
	@JsonProperty("Bankruptcy")
	public int getBnkrptcy() {
		return bnkrptcy;
	}
	public void setBnkrptcy(int bnkrptcy) {
		this.bnkrptcy = bnkrptcy;
	}

	private int bnkrptcy;
	
	@JsonProperty("RppOriginated")
	public int getRppOriginated() {
		return rppOriginated;
	}
	public void setRppOriginated(int rppOriginated) {
		this.rppOriginated = rppOriginated;
	}

	private String period;
	
	@JsonProperty("RppBroken")
	public int getRppBroken() {
		return rppBroken;
	}
	public void setRppBroken(int rppBroken) {
		this.rppBroken = rppBroken;
	}

	@JsonProperty("RppSatisfied")
	public int getRppSatisfied() {
		return rppSatisfied;
	}
	public void setRppSatisfied(int rppSatisfied) {
		this.rppSatisfied = rppSatisfied;
	}

	@JsonProperty("PotentialNewPlans")
	public int getPotNewPlans() {
		return potNewPlans;
	}
	public void setPotNewPlans(int potNewPlans) {
		this.potNewPlans = potNewPlans;
	}


	public DataResponse()
	{
		super();
	}
	public DataResponse(String period,int tandiLoancount, int totActiveRpp)
	{
		this.period=period;
		this.tandiLoancount=tandiLoancount;
		this.totActiveRpp=totActiveRpp;
	}
	
	@JsonProperty("Period")
	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	@JsonProperty("T And I LoanCount")
	public int getTandiLoancount() {
		return tandiLoancount;
	}

	@JsonProperty("Total Active Repayment Plans")
	public int getTotActiveRpp() {
		return totActiveRpp;
	}

	public void setTotActiveRpp(int totActiveRpp) {
		this.totActiveRpp = totActiveRpp;
	}

	public void setTandiLoancount(int tandiLoancount) {
		this.tandiLoancount = tandiLoancount;
	}
	
	@JsonProperty("HOA")
	public int getNewDisbHOA() {
		return newDisbHOA;
	}
	public void setNewDisbHOA(int newDisbHOA) {
		this.newDisbHOA = newDisbHOA;
	}
}
