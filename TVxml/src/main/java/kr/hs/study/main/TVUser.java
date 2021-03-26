package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.AppleSpeaker;
import kr.hs.study.beans.LgTV;
import kr.hs.study.beans.SamsungTV;
import kr.hs.study.beans.SonySpeaker;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		SonySpeaker s1 = ctx.getBean("s1", SonySpeaker.class);
		s1.volumeUp();
		s1.volumeDown();
		System.out.println("====================================================");
		AppleSpeaker s2 = ctx.getBean("s2", AppleSpeaker.class);
		s2.volumeUp();
		s2.volumeDown();
		System.out.println("====================================================");
		
		SamsungTV t1 = ctx.getBean("t1", SamsungTV.class);
		System.out.println(t1.getPrice());
		t1.getSpeaker().volumeUp();
		t1.getSpeaker().volumeDown();
		t1.PowerOn();
		t1.PowerDown();
		System.out.println("====================================================");
		LgTV t2 = ctx.getBean("t2", LgTV.class);
		System.out.println(t2.getPrice());
		t2.getSpeaker().volumeUp();
		t2.getSpeaker().volumeDown();
		t2.PowerOn();
		t2.PowerDown();
		
		ctx.close();

	}

}
