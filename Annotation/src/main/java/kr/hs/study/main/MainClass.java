package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
//		TestBean t1 = ctx1.getBean("t1",TestBean.class);
//		System.out.println("t1:"+t1);
		
		// 주소값 출력되야 됨
//		TestBean2 t2 = ctx1.getBean(TestBean2.class);
//		System.out.println(t2.getA());
//		System.out.println(t2.getB());
//		System.out.println(t2.getC());
//		System.out.println(t2.getD());
//		System.out.println("================================");
		
		TestBean3 t3 = ctx1.getBean(TestBean3.class);
		System.out.println(t3.getData1());
		System.out.println(t3.getData2());
		System.out.println(t3.getData3());
		System.out.println(t3.getData4());
		
		System.out.println("================================");
		ctx1.close();
		
		
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
//		TestBean t3 = ctx2.getBean("t1",TestBean.class);
//		System.out.println("t3:"+t3);
//		TestBean2 t4 = ctx2.getBean("t2",TestBean2.class);
//		System.out.println(t4.getA());
//		System.out.println(t4.getB());
//		System.out.println(t4.getC());
//		System.out.println(t4.getD());
		
		TestBean3 t5 = ctx2.getBean("java1",TestBean3.class);
		System.out.println(t5.getData1());
		System.out.println(t5.getData2());
		System.out.println(t5.getData3());
		System.out.println(t5.getData4());
		
		
		ctx2.close();

	}

}
