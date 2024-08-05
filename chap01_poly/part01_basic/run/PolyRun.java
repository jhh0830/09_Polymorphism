package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {

		// 명심할 사항 : "=" 대입연산자를 기준으로 왼쪽과 오른쪽의 자료형은 같아야함!!
		
		// 1. 부모 타입 참조변수로 부모 객체를 다루는 경우
		System.out.println("1. 부모 타입 참조변수로 부모 객체를 다루는 경우");
		
		Parent p1 = new Parent();
		p1.printParent();
		//p1.printChile1();
		//p1.printChile2();
		// > p1 참조변수로 Parent 에만 접근 가능
		
		
		// 2. 자식 타입 참조변수로 자식 객체를 다루는 경우
		System.out.println("2. 자식 타입 참조변수로 자식 객체를 다루는 경우");
		Child1 c1 = new Child1();
		c1.printChild1(); // 내꺼는 내꺼
		c1.printParent(); // 부모님꺼도 내꺼
		// > c1 참조변수로 Child1, Parent 둘다 접근 가능
		
		// 3. 부모 타입 참조변수로 자식 객체를 다루는 경우
		// (다형성이 적용된 개념)
		System.out.println("3. 부모 타입 참조변수로 자식 객체를 다루는 경우(다형성 적용)");
		
		Parent p2 = /*(Parent)*/ new Child1();
		// > 양쪽의 자료형이 다름에도 불구하고 오류 발생 x
		// Child1 타입의 주소값이 Parent 형으로 "자동형변환"이 되고있다.
		// >"상속" 구조에서는 클래스 간의 "형변환"이 가능하다.
		
		// Child1 타입의 객체가 생성되면서 주소값 생성
		// --> Parent 타입으로 형변환
		// --> Parent 타입 상자에 담긴 꼴
		
		
		p2.printParent(); 
	
		//p2.printChild1();
		// 결국 Parent로 형변환이 되었기 때문에 Parent 에만 접근 가능
		((Child1)p2).printChild1();
		// > 다시 Child1 타입으로 형변환을 함으로써 원상복귀 후 Child1 에 접근 가능
		// ((Child1)p2).printParent();
		// > 부모님 꺼도 내꺼
		
		/*
		 * * 다형성
		 * - 직역하면 다양한 형태를 갖는 성질
		 * - "상속" 관계에서의 각 타입별 "형변환" 개념
		 * (즉, 상속이 대전재임!!)
		 * 
		 * 
		 * 
		 * 			자동형변환
		 *       <--------
		 *  부모 타입        자식 타입
		 * 		----------->
		 * 			강제형변환
		 * 
		 * 1.  UPCasting
		 * 자식 타입이 부모 타입으로 형변환 되는 과정
		 * 자동형변환 (형변환 연산자 생략 가능)
		 * 
		 * 
		 * 2. DownCasting
		 * 부모 타입이 자식 타입으로 형변환 되는 과정
		 * 강제형변환 (형변환 연사자를 명시적으로 작성해야함)
		 * 
		 * 
		 */
		
		// * 다형성을 쓰는 이유
		
		// Child1 객체 2개, Child2 객체 2개
		// > 변수만 이용한다면 변수가 총 4개가 필요함
		// > 배열을 이용한다면 Child1 배열 1개, Child2 배열 1개
		// - 객체 배여을 이용해보자
		
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 1, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(5, 7, 2);
		arr2[1] = new Child2(2, 3, 5);
		
		// 위의 방법도 충분히 가능하지만,
		// 다형성을 적용하면 "부모타입 참조변수" 로
		// 다양한 "자식타입객체" 를 받아줄 수 있기 때문
		// 효율적으로 객체배열을 화용할 수 있게 된다!!
		
		System.out.println("=== 다형성을 접목한 객체배열 ===");
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
		
		// 주의할 점!!
		//((Child2)arr[0]).printChild2(); // Child1 --> Parent --> Child2
		// > ClassCastException 오류 발생
		//   클래스간에 형변환이 잘못 되었을 경우 발생하는 오류
		// > Child1 과 Child2는 우연히 부모클래스가 같을 뿐
		// 아무사이도 아니기 때문에 형변환이 불가하다!!
		
		
		System.out.println("=== 반복문 이용해서 해보기===");
		
		for(int  i = 0; i<arr.length; i++ ) {
			// 각 인덱스 별로 실제로 참조하고 있는 지식타입으로
			// 다운캐스팅 후 메소드 호출
			
			//((자식타입)arr[i]).자식메소드();
			//((Child1)arr[i]).printChild1(); > ClassCastException 오류 발생
			// > 원본 타입에 알맞게 원상복귀 (형변환) 을 해야 함 !!
			// > 형변환 전 해당타입이 Child1 이였는지 Child2 였는지 검사하고 들어가기
			// * instanceof 연산자
			// 현재 해당 참조변수가 실제로 어떤 자식 객체를 참조하고 있는지 확인 가능
			//System.out.println(arr[i]instanceof Child1);
			//System.out.println(arr[i]instanceof Parent);
			/*
			if(arr[i] instanceof Child1) {
				
				((Child1)arr[i]).printChild1();

				}else {
					((Child2)arr[i]).printChild2();
				}
				
			}*/
			// > 제대로 동장하나, 구문이 이걸어지고 있음!!
			
			// 팁) 
			arr[i].print();
			// > 단, 오버라이딩을 이용하면 굳이 형변환을 통해 원상복귀를 안해도 됨
			//   호출 시, 실질적으로 참조하고 있는 원본 자식타입의 오버라이딩 된 메소드를
			//   찾아가서 알아서 호출됨 
			// (오버라이딩된 메소드가 우선순위가 더 높기 때문 - 동적 바인딩)
			
			
		}
		
		
	}

}
