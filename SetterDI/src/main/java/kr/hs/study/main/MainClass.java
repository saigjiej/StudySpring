package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean("obj1", TestBean1.class);
		System.out.println("t1" + t1);
		
		TestBean1 t2 = ctx.getBean("obj1", TestBean1.class);
		System.out.println("t2:" + t2);
		
		// obj2, obj3 출력하기 / DataBean1 넣는 것까지
		TestBean2 t3 = ctx.getBean("obj2", TestBean2.class);
		t3.prData();
		
		TestBean2 t4 = ctx.getBean("obj3", TestBean2.class);
		t4.prData();
		
		
		ctx.close();

	}

}
