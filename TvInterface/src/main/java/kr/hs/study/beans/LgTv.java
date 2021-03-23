package kr.hs.study.beans;

public class LgTv implements TvInterface {
	public LgTv() {
		System.out.println("LgTv의 생성자");
	}

	public void volumeUP() {
		// TODO Auto-generated method stub
		System.out.println("LgTv의 볼륨이 올라갔습니다.");
	}

	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("LgTv의 볼륨이 낮아졌습니다.");
	}

	public void PowerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTv의 전원이 켜졌습니다.");

	}

	public void PowerOff() {
		// TODO Auto-generated method stub
		System.out.println("LgTv의 전원이 꺼졌습니다.");

	}

	public void SoniSound() {
		// TODO Auto-generated method stub
		System.out.println("Soni 스피커");
	}

}
