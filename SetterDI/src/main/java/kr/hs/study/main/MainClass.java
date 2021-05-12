package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1 = ctx.getBean("obj1", TestBean1.class);
		System.out.println("t1" + t1);
		
		TestBean1 t2 = ctx.getBean("obj1", TestBean1.class);
		System.out.println("t2:" + t2);
		
		// obj2, obj3 출력하기 / DataBean1 넣는 것까지
//		TestBean2 t3 = ctx.getBean("obj2", TestBean2.class);
//		t3.prData();
		
//		TestBean2 t4 = ctx.getBean("obj3", TestBean2.class);
//		t4.prData();
		
		System.out.println("====================================");
		TestBean3 t3 = ctx.getBean("obj4", TestBean3.class);
		System.out.println("t3:" + t3);
		System.out.println("t3.data3:" + t3.getData3());
		System.out.println("t3.data3:" + t3.getData4());
		System.out.println("t3.data3:" + t3.getData5());
		
		System.out.println("====================================");
		TestBean3 t4 = ctx.getBean("obj5", TestBean3.class);
		System.out.println("t4:" + t4);
		System.out.println("t4.data4:" + t4.getData3());
		System.out.println("t4.data4:" + t4.getData4());
		System.out.println("t4.data4:" + t4.getData5());
		
		System.out.println("====================================");
		TestBean3 t5 = ctx.getBean("obj6", TestBean3.class);
		System.out.println("t5:" + t5);
		System.out.println("t5.data5:" + t5.getData3());
		System.out.println("t5.data5:" + t5.getData4());
		System.out.println("t5.data5:" + t5.getData5());
		
		System.out.println("====================================");
		TestBean3 t6 = ctx.getBean("obj7", TestBean3.class);
		System.out.println("t6:" + t5);
		System.out.println("t6.data6:" + t6.getData3());
		System.out.println("t6.data6:" + t6.getData4());
		System.out.println("t6.data6:" + t6.getData5());
		
		
		
		
		ctx.close();

	}

}
