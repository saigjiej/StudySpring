package kr.hs.study.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj") //@Component("obj") => 같은 패키지에 같은이름의 클래스가 있을 수 없기 때문에 많이 사용하지 않음
@Lazy
@Scope("prototype")
public class TestBean3 {
	public TestBean3() {
		System.out.println("TestBean3의 기본생성자");
	}

}
