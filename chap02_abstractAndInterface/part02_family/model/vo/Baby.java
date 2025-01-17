package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Baby extends Person implements Basic{
	
	// 필드부
	
	// 생성자부
	public Baby() {}
	
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	// 메소드부
	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void eat() {
		
		// 몸무게 3 증가
		super.setWeight(super.getWeight()+3);
		
		// 건강도 1 증가 
		super.setHealth(super.getHealth()+1);
	}

	@Override
	public void sleep() {
		
		// 건강도 3 증가
		super.setHealth(super.getHealth()+ 3);
	}
	
	
}
