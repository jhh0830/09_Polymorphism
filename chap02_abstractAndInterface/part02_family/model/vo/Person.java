package com.kh.chap02_abstractAndInterface.part02_family.model.vo;
// �߻�Ŭ���� (public abstract class)
public abstract class Person {
	
	
	// �ʵ��
	private String name; // �̸�
	private double weight; // ������
	private int health; //�ǰ���
	
	// �����ں�
	public Person() {}

	public Person(String name, double weight, int health) {
		super();
		this.name = name;
		this.weight = weight;
		this.health = health;
	}
	//�޼ҵ��
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
	// ����̶�� ���� �ؾ��ϴ� ���� �� - ���� �Դ´�, ���� �ܴ�
	/*
	public abstract void eat(); 
	public abstract void sleep();
	*/
	// > Basic �̶�� �������̽��� �ڵ� �̰�
}
