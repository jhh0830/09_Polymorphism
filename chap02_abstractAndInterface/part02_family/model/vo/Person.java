package com.kh.chap02_abstractAndInterface.part02_family.model.vo;
// 추상클래스 (public abstract class)
public abstract class Person {
	
	
	// 필드부
	private String name; // 이름
	private double weight; // 몸무게
	private int health; //건강도
	
	// 생성자부
	public Person() {}

	public Person(String name, double weight, int health) {
		super();
		this.name = name;
		this.weight = weight;
		this.health = health;
	}
	//메소드부
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	@Override
	public String toString() {
		return "name : " + name + ", weight : " + weight + ", health : " + health;
	}
	// 사람이라면 응당 해야하는 행위 들 - 밥을 먹는다, 잠을 잔다
	/*
	public abstract void eat(); 
	public abstract void sleep();
	*/
	// > Basic 이라는 인터페이스로 코드 이관
}
