package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.SamsungTV;
import kr.hs.study.config.JavaConfig;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		SamsungTV s1 = ctx2.getBean("s1", SamsungTV.class);
		s1.PowerOn();
		s1.PowerDown();
		s1.getSpeaker().volumeUp();
		s1.getSpeaker().volumeDown();
		
		ctx2.close();
		

	}

}
