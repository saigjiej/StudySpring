package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.HyunDai;

@Configuration
public class JavaConfig {
	
	@Bean(name="c1")
	public HyunDai c1() {
		HyunDai c1 = new HyunDai();
		return c1;
		
	}

}
