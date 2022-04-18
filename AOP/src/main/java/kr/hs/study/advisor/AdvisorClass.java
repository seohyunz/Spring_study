package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void beforemethod() {
		System.out.println("beforemethod �޼���");
	}
	
	public void aroundMethod(ProceedingJoinPoint pjp)throws Throwable{
		System.out.println("around �޼��� ȣ��1");
		pjp.proceed(); //���� �ٽ� �޼��� ���� 
		System.out.println("around �޼��� ȣ��2");
	}
	
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod �޼���");
	}
	
	public void afterThrowingMethod(Throwable e) {
		System.out.println("afterThrowingMethod �޼���");
		System.out.println("e:" +e);
	}
	
	
}
