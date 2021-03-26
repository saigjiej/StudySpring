package kr.hs.study.beans;

public class AppleSpeaker implements SpeakerInterface{
	public AppleSpeaker() {
		System.out.println("AppleSpeaker의 생성자");
	}
	public void volumeUp() {
		System.out.println("AppleSpeaker volume up");
	}
	public void volumeDown() {
		System.out.println("AppleSpeaker volume down");
	}

}
