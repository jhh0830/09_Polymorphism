package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Mother;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Person;

public abstract class FamilyRun implements Basic{

	public static void main(String[] args) {
		//1. �������̽� ���� ��
		// Person p = new Person();
		/*
		Person p1 = new Mother("�����", 50, 70, "���");
		Person p2 = new Baby("������", 3.5, 70);
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.eat(); // ���� : ������ + 10, �ǰ��� - 10
		p2.eat(); // �ֱ� : ������ + 3, �ǰ��� + 1
		
		p1.sleep(); // ���� : �ǰ��� + 10
		p2.sleep(); // �ֱ� : �ǰ��� + 3
		
		System.out.println("=== ������ ===");
		System.out.println(p1);
		System.out.println(p2);
		*/
		
		// 2. �������̽� ���� ��
		// Basic b = new Basic();
		// > ���������� ��ü ���� �Ұ���
		
		//Basic b;
		// > ���������� ���� �����ν� Ȱ�� ����(������ ���� ����)
		
		Basic b1 = new Mother("�����", 50 ,70,"���");
		Basic b2 = new Baby("������", 3.5, 70);
		System.out.println(b1);
		System.out.println(b2);
		b1.eat();
		b2.eat();
		b1.sleep();
		b2.sleep();
		System.out.println("=== ������ ===");
		System.out.println(b1);
		System.out.println(b2);
		
		
		
	}

}
