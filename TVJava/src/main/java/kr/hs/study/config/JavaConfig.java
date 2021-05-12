package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.SamsungTV;
import kr.hs.study.beans.SonySpeaker;

@Configuration
public class JavaConfig {
	
	@Bean(name="s1")
	public SamsungTV s1() {
		SamsungTV s1 = new SamsungTV(1000, new SonySpeaker());
		return s1;
	}
}