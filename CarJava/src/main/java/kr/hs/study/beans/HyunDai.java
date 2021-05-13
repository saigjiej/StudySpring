package kr.hs.study.beans;

public class HyunDai implements Car{
	
	public HyunDai() {
		System.out.println("HyunDai의 생성자");
	}
	
	String name;
	String color;

	public HyunDai(String name, String color) {
		this.name = name;
		this.color = color;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	public int money(int money) {
		// TODO Auto-generated method stub
		return money;
	}

	public void order() {
		// TODO Auto-generated method stub
		System.out.println(name + " 주문하다");
	}


}
