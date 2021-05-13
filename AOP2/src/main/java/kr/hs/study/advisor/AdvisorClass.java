package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void before() {
		System.out.println("before method");
	}
	public void after() {
		System.out.println("after method");
	}
	
	public int around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around 메서트 호출1");
		int a = (Integer)pjp.proceed(); // 비지니스 로직 실행
		System.out.println("around 메서트 호출2");
		return a;
	}
	
	public void after_returning() {
		System.out.println("after_returning 메서드 호출 ");
	}
	
	public void after_Throwing(Exception e) {
		System.out.println("after throwing 호출");
	}

}
