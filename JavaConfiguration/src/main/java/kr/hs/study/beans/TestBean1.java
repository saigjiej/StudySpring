package kr.hs.study.beans;

public class TestBean1 {
	public TestBean1() {
		System.out.println("TestBean1의 기본생성자");
	}
	
	public void init() {
		System.out.println("initMethod");
		
	}
	
	public void destroy() {
		System.out.println("destroyMethod");
		
	}

}
