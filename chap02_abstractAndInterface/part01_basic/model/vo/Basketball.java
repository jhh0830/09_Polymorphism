package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public class Basketball extends Sports {
	
	
	// 미완성된 클래스인 추상클래스를 상속받게 되면
	// 부모크래세스에 있는 추상메소드(미완성된 메소드)
	// 를 강제로 "오버라이딩" 을 통해 완성시켜줘야함!!
	@Override
	public void rule(){
		System.out.println("손으로 공을 던져 링에 넣어야 한다. ");
	}
}
