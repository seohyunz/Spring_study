package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void beforemethod() {
		System.out.println("beforemethod 메서드");
	}
	
	public void aroundMethod(ProceedingJoinPoint pjp)throws Throwable{
		System.out.println("around 메서드 호출1");
		pjp.proceed(); //실제 핵심 메서드 실행 
		System.out.println("around 메서드 호출2");
	}
	
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod 메서드");
	}
	
	public void afterThrowingMethod(Throwable e) {
		System.out.println("afterThrowingMethod 메서드");
		System.out.println("e:" +e);
	}
	
	
}
