package kr.hs.study.main;

import kr.hs.study.beans.Hello;
import kr.hs.study.beans.HelloWorldKo;
import kr.hs.study.beans.Person;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello hello = new HelloWorldKo(); // 객체생성
		hello.sayHello();
		
		Person person = new Person();
		person.setName("kim");
		person.setAge(30);
		System.out.println(person.getName());
		System.out.println(person.getAge());
		
		Person p = new Person("lee", 25);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
	}

}
