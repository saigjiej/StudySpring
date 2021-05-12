package kr.hs.study.beans;

public class LgTV implements TVInterface{
	public LgTV() {
		System.out.println("LgTV의 생성자");
	}

	public int price;
	public SonySpeaker speaker;

	public LgTV(int price, SonySpeaker speaker) {
		this.price = price;
		this.speaker = speaker;
	}
	

	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public SonySpeaker getSpeaker() {
		return speaker;
	}



	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}



	public void PowerOn() {
		System.out.println("LgTV power on");
		
	}

	public void PowerDown() {
		System.out.println("LgTV power down");
		
	}

}
