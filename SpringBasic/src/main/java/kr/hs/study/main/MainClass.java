package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// 컨테이너의 설정파일을 읽어오고 객체생성해서 IOC 컨테이너에 보관
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		//컨테이너야. 너가 생성한 객체 중에 TestBean.class타입의 객체를 가지고 와서 t1에 넣어라
		/*
		 * Test t1 = ctx.getBean(TestBean.class); t1.method1();
		 */
		/*
		 * Test t1= (Test) ctx.getBean("t1"); t1.method1();
		 */
		
//		Test t1 = ctx.getBean("t1", TestBean.class);
//		t1.method1();
//		System.out.println("t1:" + t1);
		
		//t1 객체를 가지고 와서 t2에 넣어
//		Test t2 = ctx.getBean("t1", TestBean.class);
//		System.out.println("t2:" + t2);
		
		Test t2 = ctx.getBean("t2", TestBean2.class);
		System.out.println("t2:" + t2);

		ctx.close();
	}

}
