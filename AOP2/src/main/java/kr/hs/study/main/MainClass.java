package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean t1 = ctx.getBean("t1", TestBean.class);
		//t1.add();
		System.out.println(t1.abs());
		//t1.sub();
		t1.ex();
		ctx.close();
		
		
	}

}
