package com.kh.chap01_poly.part02_eletronic.controller;

import com.kh.chap01_poly.part02_eletronic.model.vo.Electronic;

// ������ ���� ��
public class ElectronicController2 {

	// ��� ���ڻ󰡿� ���� ���� ����
	// � ������ ������ǰ�̵� �� ������ �� �ִ� â�� "�ʵ�" �ν� ����
	// ���������� �ڷ��� �ʵ��;
	private Electronic[] elec = new Electronic[3];
	
	// ��ǰ�� ��ǰ�޾Ƽ� â���� �� ĭ�� ����ִ� ���
	public void insert(Electronic any , int index) {
		elec[index] = any;
	}
	
	// â���� x��ĭ�� ���� ��ǰ�� ������ �����ִ� ���
	public Electronic select(int index) {
		return elec[index];
	}
	
	// â�� �ִ� ��� ��ǰ�� �� ������ �����ִ� ���
	
	public Electronic[] select() {
		return elec;
		
	}
	
	
}
