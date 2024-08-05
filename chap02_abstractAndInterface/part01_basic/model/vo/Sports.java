package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public abstract class Sports {
	
	// 필드부
	private int people;// 스포츠에 참여하는 인원수
	
	// 생성자부
	public Sports() {}
	
	public Sports(int people) {
		this.people = people;
	}
	
	// 메소드부
	
	public void setPeople(int people) {
		this.people = people;
	}
		
	public int getPeople() {
		return people;
	}
	@Override // 오버라이딩 오타날수도 있으니 미리 선언해주는게 좋다.
	public String toString() {
		return "people : " + people; 
	}
	
	public abstract void rule();
	
	/*
	 * * 무보클래스 입장에서 자식클래스들이 모두
	 * 메소드를 오버라이딩 해서 쓴다면 굳이 힘들게 코드를 채워서 작성할 필요가 없을 것 같음
	 * 
	 * > 메소드의 몸통부를 지우자!! (abstract 키워드를 붙이자)
	 * 
	 * 
	 * * 추상메소드
	 * 몸통부가 존재하지 않는 미완성된 메소드
	 * 추상메소드를 정의하고자 한다면, "abstract" 라는 예약어도 써야 햔다.
	 * > 미왕성된 메소드가 하나라도 포함되는 순간 해당 클래스 또한
	 * 	 추상클래스가 되어버린다. (미완성된 클래스)
	 *   마찬가지로 클래스 쪽에도 abstract 키워도를 붙인다.
	 * 		
	 * 
	 * 
	 */
	
}
