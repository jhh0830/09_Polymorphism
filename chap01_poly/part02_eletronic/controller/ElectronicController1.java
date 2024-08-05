package com.kh.chap01_poly.part02_eletronic.controller;

import com.kh.chap01_poly.part02_eletronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_eletronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_eletronic.model.vo.Tablet;

// 다형성을 적용시키기 전
public class ElectronicController1 {

	// 용산 전자 상가에 새로 차린가게
	// 각 전자제품을 담을 상자를 "필드" 로써 구현
	// 접근 제한자 자료형 필드명;
	
	private Desktop desk; // 데스크탑 제품을 담을 상자
	private NoteBook note; // 노트북 제품을 담을 상자
	private Tablet tab; // 태블릿 제품을 담을 상자
	
	
	// 제품을 납품받았을 때 해당 제품을 알맞은 상자에 넣는 기능
	public void insert(Desktop d) {
		desk = d;
	}
	public void insert(NoteBook n) {
		note = n;
	}
	public void insert(Tablet t) {
		tab= t;
	}
	// 해당 제품을 상자로부터 꺼내서 내어주는 기능
	
	public Desktop selectDesktop() {
		return desk;
	}
	// 매개변수가 완전히 같아 오버로딩이 불가
	// 메소드명을 각각 따로 지어줘야함!!
	
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
}
