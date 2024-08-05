package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public abstract class Sports {
	
	// �ʵ��
	private int people;// �������� �����ϴ� �ο���
	
	// �����ں�
	public Sports() {}
	
	public Sports(int people) {
		this.people = people;
	}
	
	// �޼ҵ��
	
	public void setPeople(int people) {
		this.people = people;
	}
		
	public int getPeople() {
		return people;
	}
	@Override // �������̵� ��Ÿ������ ������ �̸� �������ִ°� ����.
	public String toString() {
		return "people : " + people; 
	}
	
	public abstract void rule();
	
	/*
	 * * ����Ŭ���� ���忡�� �ڽ�Ŭ�������� ���
	 * �޼ҵ带 �������̵� �ؼ� ���ٸ� ���� ����� �ڵ带 ä���� �ۼ��� �ʿ䰡 ���� �� ����
	 * 
	 * > �޼ҵ��� ����θ� ������!! (abstract Ű���带 ������)
	 * 
	 * 
	 * * �߻�޼ҵ�
	 * ����ΰ� �������� �ʴ� �̿ϼ��� �޼ҵ�
	 * �߻�޼ҵ带 �����ϰ��� �Ѵٸ�, "abstract" ��� ���� ��� �h��.
	 * > �̿ռ��� �޼ҵ尡 �ϳ��� ���ԵǴ� ���� �ش� Ŭ���� ����
	 * 	 �߻�Ŭ������ �Ǿ������. (�̿ϼ��� Ŭ����)
	 *   ���������� Ŭ���� �ʿ��� abstract Ű������ ���δ�.
	 * 		
	 * 
	 * 
	 */
	
}
