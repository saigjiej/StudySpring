package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;

@Configuration
@ComponentScan(basePackages="kr.hs.study.beans")
public class JavaConfig {
	@Bean
	public TestBean3 java1() {
		return new TestBean3(50,55.55,new DataBean3(), new DataBean4());
		//setter
//		TestBean3 t= new TestBean3();
//		t.setData1(70);
//		return t;
	}

}
