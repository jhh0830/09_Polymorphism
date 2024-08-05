package com.kh.chap02_abstractAndInterface.part01_basic.run;

import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Football;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Sports;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Basketball;

public class BasicRun {

	public static void main(String[] args) {
		
		// Sports 객체 생성
		//Sports  s = new Sports();
		// > 추상클래스로 절대 객체 생성이 불가!!
		//   미완성된 클래스이기 때문
		
		//Sports s;
		// > 단, 객체 생성만 안될뿐, 참조변수로는 사용 가능
		
		
		// s= new Sports();
		//s = new Basketball();
		// > 즉, 다형성이 적용해서 자식객체를 받아주는 용도로는 사용 가능
		
		// 객체 배열 또한 이용 가능
		Sports[] arr= new Sports[2];
		arr[0] =  new Basketball();
		arr[1] = new Football();
		
		// 반복문 활용
		for(int i = 0; i < arr.length; i++) {
			arr[i].rule();
		}
		
		/*
		 * *추상메소드
		 * 미완성된 메소드로 몸통부 ({여기}) 가 구현되어있지 않는 메소드
		 * 자식클레스에서 오버라이딩을 통해 완성됨 (강제로 오버라딩 해야함)
		 * > 오버라이딩을 하지 않을 경우 에러 발생
		 * > 메소드 사용의 통일성을 확보하기 위한 목적으로 사용
		 * > 코드 상의 표준화된 틀을 제공할 목적으로 사용!!
		 * 
		 * 
		 * *추상클래스
		 * 추상메소드가 "하나라도" 존재하는 순간 반드시 추상클래스로 정의
		 * (일반필드 + 일반메소드 + 추상메소드(생략가능))
		 * 단, 추상메소드가 굳이 없더라도 해당 클래스를 추상클래스로 둘 수 있음
		 * > 추상클래스 또한 미완성된 클래스이기 때문에 객체 생성이 불가!!
		 * > 단, 참조변수로는 사용 가능함 (다형성 적용 가능)
		 * 
		 * * 추상메소드가 없더라도 abstract 키워드만 붙이면 
		 * 해당 클래스를 추상클래스로 작성 가능하다.
		 * > 코드 작업 시 클래스가 아직 덜 구체적으로 구현된 상태인것 같을 때 (개념적)
		 * > 현재 키 을래스로 객체 생성이 당장 불가하게끔 막고 싶을 때 (기술적)
		 * 
		 */
		
		
	}

}
