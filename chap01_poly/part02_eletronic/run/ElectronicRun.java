package com.kh.chap01_poly.part02_eletronic.run;

import com.kh.chap01_poly.part02_eletronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02_eletronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_eletronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_eletronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_eletronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
		/*
		// 가게 오픈
		// 1. 다형성을 적용 안했을 경우 (ElectronicController1)
		ElectronicController1 ec1 = new ElectronicController1();
		// > 객체를 생성하는 순간 맴버변수로 정의해놨던
		//    각 제품을 담는 상자가 생성 (desk, note, tab)
		
		
		// 각 상자에는 모두 null 이 담겨있음 (즉 ,제품이 아직 없음)
		// > 제품을 납품받아서 각 상자에 포장해보기
		//Desktop d = new Desktop("삼성", "게이밍 데스크탑", 2000000, "Geforce 1070");
		ec1.insert(new Desktop("삼성" ,"게이밍 데스크탑", 200000, "Geforce 1070"));
		ec1.insert(new NoteBook("엘지", "그램", 1500000, 3));
		ec1.insert(new Tablet("애플","아이패드 프로", 1000000, true));
		
		// 장사 시작!!
		
		// 손님 입장 : 데스크탑, 노트북, 태블릿 제품 모두 보여주세요
		
		Desktop d = ec1.selectDesktop();
		NoteBook n = ec1.selectNoteBook();
		Tablet t = ec1.selectTablet();
		
		// 보여주기 (출력문)
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		
		// 2. 다형성을 적용했을 경우 (ElectronicContoroller2)
		ElectronicController2 ec2 = new ElectronicController2();
		// > 객체 생성과 동시에 어느 제품이든지 3개를 담을 수 있는
		//   창고 공간이 생성됨 (elec)
		
		// 장사 준비
		// > 제품을 납품 받아서 창고에다가 차곡차곡 보관해두기
		
		ec2.insert(new Desktop("삼성","게이밍 데스크탑", 2000000, "Geforce 1070"), 0);
		ec2.insert(new NoteBook("엘지", "그램", 1500000,3),1);
		ec2.insert(new Tablet("애플", "아이패드 프로", 1000000, true), 2);
		
		// 장사 시작
		// 손님 입장 : 데스크탑, 노트북, 태블릿 제품을 보여주세요
		// 강제 형변환을 해야지 알수가있다 그냥쓰면 어디서 왔는지 확실하게 구분이 불가능함
		/*
		Desktop d = (Desktop) ec2.select(0);
		NoteBook n = (NoteBook) ec2.select(1);
		Tablet t = (Tablet) ec2.select(2);
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		Electronic[] elec = ec2.select();
		for(int i = 0; i < elec.length; i++) {
		System.out.println(elec[i]);
		}
		
		/*
		 * * 다형성을 사용하는 이유
		 * 1. 부모타입의 객체배열로 다양한 자식객체들을 받아줄 수 있음
		 * 2. 메소드의 매개변수나 반환형에 다형성을 적용하게 되면
		 * 	  메소드의 갯수를 확 줄여줄 수 있다.
		 * 
		 * 
		 */
	}

}
