package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {

		// ����� ���� : "=" ���Կ����ڸ� �������� ���ʰ� �������� �ڷ����� ���ƾ���!!
		
		// 1. �θ� Ÿ�� ���������� �θ� ��ü�� �ٷ�� ���
		System.out.println("1. �θ� Ÿ�� ���������� �θ� ��ü�� �ٷ�� ���");
		
		Parent p1 = new Parent();
		p1.printParent();
		//p1.printChile1();
		//p1.printChile2();
		// > p1 ���������� Parent ���� ���� ����
		
		
		// 2. �ڽ� Ÿ�� ���������� �ڽ� ��ü�� �ٷ�� ���
		System.out.println("2. �ڽ� Ÿ�� ���������� �ڽ� ��ü�� �ٷ�� ���");
		Child1 c1 = new Child1();
		c1.printChild1(); // ������ ����
		c1.printParent(); // �θ�Բ��� ����
		// > c1 ���������� Child1, Parent �Ѵ� ���� ����
		
		// 3. �θ� Ÿ�� ���������� �ڽ� ��ü�� �ٷ�� ���
		// (�������� ����� ����)
		System.out.println("3. �θ� Ÿ�� ���������� �ڽ� ��ü�� �ٷ�� ���(������ ����)");
		
		Parent p2 = /*(Parent)*/ new Child1();
		// > ������ �ڷ����� �ٸ����� �ұ��ϰ� ���� �߻� x
		// Child1 Ÿ���� �ּҰ��� Parent ������ "�ڵ�����ȯ"�� �ǰ��ִ�.
		// >"���" ���������� Ŭ���� ���� "����ȯ"�� �����ϴ�.
		
		// Child1 Ÿ���� ��ü�� �����Ǹ鼭 �ּҰ� ����
		// --> Parent Ÿ������ ����ȯ
		// --> Parent Ÿ�� ���ڿ� ��� ��
		
		
		p2.printParent(); 
	
		//p2.printChild1();
		// �ᱹ Parent�� ����ȯ�� �Ǿ��� ������ Parent ���� ���� ����
		((Child1)p2).printChild1();
		// > �ٽ� Child1 Ÿ������ ����ȯ�� �����ν� ���󺹱� �� Child1 �� ���� ����
		// ((Child1)p2).printParent();
		// > �θ�� ���� ����
		
		/*
		 * * ������
		 * - �����ϸ� �پ��� ���¸� ���� ����
		 * - "���" ���迡���� �� Ÿ�Ժ� "����ȯ" ����
		 * (��, ����� ��������!!)
		 * 
		 * 
		 * 
		 * 			�ڵ�����ȯ
		 *       <--------
		 *  �θ� Ÿ��        �ڽ� Ÿ��
		 * 		----------->
		 * 			��������ȯ
		 * 
		 * 1.  UPCasting
		 * �ڽ� Ÿ���� �θ� Ÿ������ ����ȯ �Ǵ� ����
		 * �ڵ�����ȯ (����ȯ ������ ���� ����)
		 * 
		 * 
		 * 2. DownCasting
		 * �θ� Ÿ���� �ڽ� Ÿ������ ����ȯ �Ǵ� ����
		 * ��������ȯ (����ȯ �����ڸ� ��������� �ۼ��ؾ���)
		 * 
		 * 
		 */
		
		// * �������� ���� ����
		
		// Child1 ��ü 2��, Child2 ��ü 2��
		// > ������ �̿��Ѵٸ� ������ �� 4���� �ʿ���
		// > �迭�� �̿��Ѵٸ� Child1 �迭 1��, Child2 �迭 1��
		// - ��ü �迩�� �̿��غ���
		
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 1, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(5, 7, 2);
		arr2[1] = new Child2(2, 3, 5);
		
		// ���� ����� ����� ����������,
		// �������� �����ϸ� "�θ�Ÿ�� ��������" ��
		// �پ��� "�ڽ�Ÿ�԰�ü" �� �޾��� �� �ֱ� ����
		// ȿ�������� ��ü�迭�� ȭ���� �� �ְ� �ȴ�!!
		
		System.out.println("=== �������� ������ ��ü�迭 ===");
		Parent[] arr = new Parent[4];
		arr[0] = /*(Parent)*/ new Child1(1, 2, 4);
		arr[1] = /*(Parent)*/ new Child2(5, 7, 2);
		arr[2] = /*(Parent)*/ new Child2(2, 3, 5);
		arr[3] = /*(Parent)*/ new Child1(2, 1, 5);
		
		/*
		arr[0].printParent();
		arr[1].printParent();
		arr[2].printParent();
		arr[3].printParent();
		*/
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		
		// ������ ��!!
		//((Child2)arr[0]).printChild2(); // Child1 --> Parent --> Child2
		// > ClassCastException ���� �߻�
		//   Ŭ�������� ����ȯ�� �߸� �Ǿ��� ��� �߻��ϴ� ����
		// > Child1 �� Child2�� �쿬�� �θ�Ŭ������ ���� ��
		// �ƹ����̵� �ƴϱ� ������ ����ȯ�� �Ұ��ϴ�!!
		
		
		System.out.println("=== �ݺ��� �̿��ؼ� �غ���===");
		
		for(int  i = 0; i<arr.length; i++ ) {
			// �� �ε��� ���� ������ �����ϰ� �ִ� ����Ÿ������
			// �ٿ�ĳ���� �� �޼ҵ� ȣ��
			
			//((�ڽ�Ÿ��)arr[i]).�ڽĸ޼ҵ�();
			//((Child1)arr[i]).printChild1(); > ClassCastException ���� �߻�
			// > ���� Ÿ�Կ� �˸°� ���󺹱� (����ȯ) �� �ؾ� �� !!
			// > ����ȯ �� �ش�Ÿ���� Child1 �̿����� Child2 ������ �˻��ϰ� ����
			// * instanceof ������
			// ���� �ش� ���������� ������ � �ڽ� ��ü�� �����ϰ� �ִ��� Ȯ�� ����
			//System.out.println(arr[i]instanceof Child1);
			//System.out.println(arr[i]instanceof Parent);
			/*
			if(arr[i] instanceof Child1) {
				
				((Child1)arr[i]).printChild1();

				}else {
					((Child2)arr[i]).printChild2();
				}
				
			}*/
			// > ����� �����ϳ�, ������ �̰ɾ����� ����!!
			
			// ��) 
			arr[i].print();
			// > ��, �������̵��� �̿��ϸ� ���� ����ȯ�� ���� ���󺹱͸� ���ص� ��
			//   ȣ�� ��, ���������� �����ϰ� �ִ� ���� �ڽ�Ÿ���� �������̵� �� �޼ҵ带
			//   ã�ư��� �˾Ƽ� ȣ��� 
			// (�������̵��� �޼ҵ尡 �켱������ �� ���� ���� - ���� ���ε�)
			
			
		}
		
		
	}

}
