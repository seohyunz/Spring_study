package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		pjp.proceed();
		System.out.println("adviosr °ü½É");
		
	}
}

