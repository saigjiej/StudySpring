package kr.hs.study.beans;

public class SonySpeaker implements SpeakerInterface{
	public SonySpeaker() {
		System.out.println("SonySpeaker의 생성자");
	}
	public void volumeUp() {
		System.out.println("SonySpeaker volume up");
	}
	public void volumeDown() {
		System.out.println("SonySpeaker volume down");
	}
}
