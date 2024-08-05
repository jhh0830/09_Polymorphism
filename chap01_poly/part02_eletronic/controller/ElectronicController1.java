package com.kh.chap01_poly.part02_eletronic.controller;

import com.kh.chap01_poly.part02_eletronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_eletronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_eletronic.model.vo.Tablet;

// �������� �����Ű�� ��
public class ElectronicController1 {

	// ��� ���� �󰡿� ���� ��������
	// �� ������ǰ�� ���� ���ڸ� "�ʵ�" �ν� ����
	// ���� ������ �ڷ��� �ʵ��;
	
	private Desktop desk; // ����ũž ��ǰ�� ���� ����
	private NoteBook note; // ��Ʈ�� ��ǰ�� ���� ����
	private Tablet tab; // �º� ��ǰ�� ���� ����
	
	
	// ��ǰ�� ��ǰ�޾��� �� �ش� ��ǰ�� �˸��� ���ڿ� �ִ� ���
	public void insert(Desktop d) {
		desk = d;
	}
	public void insert(NoteBook n) {
		note = n;
	}
	public void insert(Tablet t) {
		tab= t;
	}
	// �ش� ��ǰ�� ���ڷκ��� ������ �����ִ� ���
	
	public Desktop selectDesktop() {
		return desk;
	}
	// �Ű������� ������ ���� �����ε��� �Ұ�
	// �޼ҵ���� ���� ���� ���������!!
	
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
}
