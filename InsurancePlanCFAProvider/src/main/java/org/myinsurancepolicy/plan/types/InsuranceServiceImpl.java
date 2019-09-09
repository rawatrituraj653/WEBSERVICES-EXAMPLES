package org.myinsurancepolicy.plan.types;

import javax.jws.WebService;

@WebService(endpointInterface ="org.myinsurancepolicy.plan.types.EInsuranceTest" )
public class InsuranceServiceImpl implements  EInsuranceTest {
	
	
	public InsuranceServiceImpl() {
		System.out.println("InsuranceServiceImpl:: Constructor Executed");
	}
	@Override
	public PlanInfoType getInsurancePlanInfo(PlanType planType) {
		System.out.println("getInsurancePlanInfo():: Executed");
		PlanInfoType infoType =new PlanInfoType();
		infoType.setPersonName(planType.getPersonName());
		infoType.setPlanStatus(true);
		infoType.setBenefitAmt(400000);
		infoType.setCreditAmt(200000);
		infoType.setPendingAmt(200000);
		return infoType;
	}	
}
