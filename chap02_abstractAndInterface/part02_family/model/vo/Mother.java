package com.kh.chap02_abstractAndInterface.part02_family.model.vo;


//  				Ȯ���ϰڴ�.		�����ϰڴ�.
public class Mother extends Person implements Basic{
	// �ʵ��
	private String babyBirth; // �Ʊ��� ź������ : ���, �Ծ�, ����
	
	//�����ں�
	public Mother () {}

	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}

	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	@Override
	public String toString() {
		return super.toString() + ", babyBirth : " + babyBirth;
	}
	
	// ������ ���� ������
	@Override
	public void eat() {
		
		// �����԰� ������ �����Կ� 10 ����
		// ������ = ������ + 10;
		super.setWeight(super.getWeight() + 10); 
		
		
		// �ǰ����� �⺻�� �ǰ����� 10 ����
		// �ǰ��� = �ǰ��� - 10;
		super.setHealth(super.getHealth() - 10);
		
		
	}
	// ������ ���� �߶�
	public void sleep() {
		
		// �ǰ����� ������ �ǰ����� 10����
		super.setHealth((super.getHealth()+10));
		
	}
	
}
