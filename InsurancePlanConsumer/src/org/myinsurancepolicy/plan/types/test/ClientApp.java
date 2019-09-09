package org.myinsurancepolicy.plan.types.test;

import org.myinsurancepolicy.plan.types.EInsuranceTest;
import org.myinsurancepolicy.plan.types.InsuranceServiceImplService;
import org.myinsurancepolicy.plan.types.PlanInfoType;
import org.myinsurancepolicy.plan.types.PlanType;

public class ClientApp {

	public static void main(String[] args) {
		System.err.println("Main method");
		
		InsuranceServiceImplService service=new InsuranceServiceImplService();
		EInsuranceTest eInsuranceTest=service.getPort(EInsuranceTest.class);
		PlanInfoType infoType=eInsuranceTest.getInsurancePlanInfo(new PlanType() {{
				setPersonName("Amit Gupta");
				setPlanName("Health-Care");
				setAge(32);
				setPlanDuration(6.8);
				setInstallment(4123);	
		}});
		System.out.println(infoType);
		
	}
}
