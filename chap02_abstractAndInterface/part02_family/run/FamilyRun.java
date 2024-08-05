package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Mother;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Person;

public abstract class FamilyRun implements Basic{

	public static void main(String[] args) {
		//1. 인터페이스 적용 전
		// Person p = new Person();
		/*
		Person p1 = new Mother("김엄마", 50, 70, "출산");
		Person p2 = new Baby("김응애", 3.5, 70);
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.eat(); // 엄마 : 몸무게 + 10, 건강도 - 10
		p2.eat(); // 애기 : 몸무게 + 3, 건강도 + 1
		
		p1.sleep(); // 엄마 : 건강도 + 10
		p2.sleep(); // 애기 : 건강도 + 3
		
		System.out.println("=== 다음날 ===");
		System.out.println(p1);
		System.out.println(p2);
		*/
		
		// 2. 인터페이스 적용 후
		// Basic b = new Basic();
		// > 마찬가지로 객체 생성 불가능
		
		//Basic b;
		// > 마찬가지로 참조 변수로써 활용 가능(다형성 적용 가능)
		
		Basic b1 = new Mother("김엄마", 50 ,70,"출산");
		Basic b2 = new Baby("김응애", 3.5, 70);
		System.out.println(b1);
		System.out.println(b2);
		b1.eat();
		b2.eat();
		b1.sleep();
		b2.sleep();
		System.out.println("=== 다음날 ===");
		System.out.println(b1);
		System.out.println(b2);
		
		
		
	}

}
