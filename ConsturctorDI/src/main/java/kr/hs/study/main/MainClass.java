package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestUser;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		// Java
		TestBean1 obj1 = new TestBean1();
		obj1.prData();
		System.out.println("================================");
		
		// Spring
		TestBean1 obj2 = ctx.getBean("t2", TestBean1.class);
		// TestBean1 obj2 = new TestBean1(10); -> Java
		obj2.prData();
		System.out.println("================================");
		
		TestBean1 obj3 = ctx.getBean("t3", TestBean1.class);
		obj3.prData();
		System.out.println("================================");
		
		TestBean1 obj4 = ctx.getBean("t4", TestBean1.class);
		obj4.prData();
		System.out.println("================================");
		
		TestBean1 obj5 = ctx.getBean("t5", TestBean1.class);
		obj5.prData();
		System.out.println("================================");
		
		TestBean2 obj6 = ctx.getBean("t6", TestBean2.class);
		obj6.prData();
		System.out.println("================================");
		
		
		TestBean3 obj7 = ctx.getBean("t7", TestBean3.class);
		System.out.println("obj7:data1:" + obj7.getData1());
		System.out.println("obj7:data2:" + obj7.getData2());
		
		ctx.close();
	}

}
