package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;


@Configuration
@ComponentScan(basePackages="kr.hs.study.beans")
public class JavaConfig {
//	@Bean(name="t2")
//	public TestBean1 t2() {
//		return new TestBean1();
//	}

}
