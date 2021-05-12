package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HyunDai;
import kr.hs.study.beans.Kia;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		HyunDai c1 = ctx.getBean("c1", HyunDai.class);
		System.out.println("가격: " + c1.money(1000));
		c1.order();
		System.out.println("name: " + c1.getName());
		System.out.println("color: " + c1.getColor());
		System.out.println("==============================================");
		
		Kia c2 = ctx.getBean("c2", Kia.class);
		System.out.println("가격: " + c2.money(1000));
		c2.order();
		
		ctx.close();

	}

}
