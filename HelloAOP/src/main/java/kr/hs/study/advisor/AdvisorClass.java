package kr.hs.study.advisor;

public class AdvisorClass {
	public void before() {
		System.out.println("before method");
	}
	public void after() {
		System.out.println("after method");
	}
	public void around() {
		System.out.println("around method");
	}
	public void after_Returning() {
		
	}
	public void after_Throwing(Exception e) {
		System.out.println("after throwing 호출");
	}

}
