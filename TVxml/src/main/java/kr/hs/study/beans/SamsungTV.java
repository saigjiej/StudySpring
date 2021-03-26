package kr.hs.study.beans;

public class SamsungTV implements TVInterface{
	public void SamsungTV() {
		System.out.println("Samsumg의 생성자");
	}
	
	private int price;
	private SonySpeaker speaker;
	
	public SamsungTV(int price, SonySpeaker speaker) {
		this.price = price;
		this.speaker = speaker;
	}
	
	public void PowerOn() {
		System.out.println("SamsungTV power on");
		
	}

	public void PowerDown() {
		System.out.println("SamsungTV power down");
		
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
	
}
