package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.LgTv;
import kr.hs.study.beans.SamsungTv;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 볼륨도 넣기
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		SamsungTv s1 = ctx.getBean("s1", SamsungTv.class);
		s1.volumeUP();
		SamsungTv s2 = ctx.getBean("s2", SamsungTv.class);
		s2.volumeDown();
		SamsungTv s3 = ctx.getBean("s3", SamsungTv.class);
		s3.PowerOn();
		SamsungTv s4 = ctx.getBean("s4", SamsungTv.class);
		s4.PowerOff();
		SamsungTv s5 = ctx.getBean("s5", SamsungTv.class);
		s5.SoniSound();
		
		System.out.println("================================");
		
		LgTv l1 = ctx.getBean("l1", LgTv.class);
		l1.volumeUP();
		LgTv l2 = ctx.getBean("l2", LgTv.class);
		l1.volumeDown();
		LgTv l3 = ctx.getBean("l3", LgTv.class);
		l1.PowerOn();
		LgTv l4 = ctx.getBean("l4", LgTv.class);
		l1.PowerOff();
		LgTv l5 = ctx.getBean("l5", LgTv.class);
		l1.SoniSound();
		
		
	}

}
