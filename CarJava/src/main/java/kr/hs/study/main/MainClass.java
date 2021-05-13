package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HyunDai;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		HyunDai c1 = ctx.getBean("c1", HyunDai.class);
		c1.money(1000);
		c1.order();
		c1.getName();
		c1.getColor();
		
		ctx.close();

	}

}
