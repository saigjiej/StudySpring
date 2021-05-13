package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

@Configuration
public class JavaConfig {
	/* xml => <bean id="obj1" class = "kr.hs.study.beans.TestBean1" lazy-init = "true" scope="prototype"/>  */
	
	@Bean(name="new", initMethod="init", destroyMethod="destroy")
	@Lazy
	@Scope("prototype") // 매번 객체 새로 생성
	public TestBean1 java1() {
		TestBean1 t1= new TestBean1();
		return t1;
	}
	
	@Bean
	public TestBean1 java2() {
		TestBean1 t2 = new TestBean1();
		return t2;
	}
	
	@Bean
	public TestBean2 t1() {
		TestBean2 t2 = new TestBean2(10,"spring1",new DataBean2());
		return t2;
	}
	
	//setter(java setter)
	@Bean
	public TestBean2 t2() {
		TestBean2 t3 = new TestBean2();
		t3.setA(100);
		t3.setB("spring3");
		t3.setC(new DataBean2());
		return t3;
	}
	
	

	

}
