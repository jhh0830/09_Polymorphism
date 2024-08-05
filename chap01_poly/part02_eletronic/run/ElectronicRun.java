package com.kh.chap01_poly.part02_eletronic.run;

import com.kh.chap01_poly.part02_eletronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02_eletronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_eletronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_eletronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_eletronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
		/*
		// ���� ����
		// 1. �������� ���� ������ ��� (ElectronicController1)
		ElectronicController1 ec1 = new ElectronicController1();
		// > ��ü�� �����ϴ� ���� �ɹ������� �����س���
		//    �� ��ǰ�� ��� ���ڰ� ���� (desk, note, tab)
		
		
		// �� ���ڿ��� ��� null �� ������� (�� ,��ǰ�� ���� ����)
		// > ��ǰ�� ��ǰ�޾Ƽ� �� ���ڿ� �����غ���
		//Desktop d = new Desktop("�Ｚ", "���̹� ����ũž", 2000000, "Geforce 1070");
		ec1.insert(new Desktop("�Ｚ" ,"���̹� ����ũž", 200000, "Geforce 1070"));
		ec1.insert(new NoteBook("����", "�׷�", 1500000, 3));
		ec1.insert(new Tablet("����","�����е� ����", 1000000, true));
		
		// ��� ����!!
		
		// �մ� ���� : ����ũž, ��Ʈ��, �º� ��ǰ ��� �����ּ���
		
		Desktop d = ec1.selectDesktop();
		NoteBook n = ec1.selectNoteBook();
		Tablet t = ec1.selectTablet();
		
		// �����ֱ� (��¹�)
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		
		// 2. �������� �������� ��� (ElectronicContoroller2)
		ElectronicController2 ec2 = new ElectronicController2();
		// > ��ü ������ ���ÿ� ��� ��ǰ�̵��� 3���� ���� �� �ִ�
		//   â�� ������ ������ (elec)
		
		// ��� �غ�
		// > ��ǰ�� ��ǰ �޾Ƽ� â���ٰ� �������� �����صα�
		
		ec2.insert(new Desktop("�Ｚ","���̹� ����ũž", 2000000, "Geforce 1070"), 0);
		ec2.insert(new NoteBook("����", "�׷�", 1500000,3),1);
		ec2.insert(new Tablet("����", "�����е� ����", 1000000, true), 2);
		
		// ��� ����
		// �մ� ���� : ����ũž, ��Ʈ��, �º� ��ǰ�� �����ּ���
		// ���� ����ȯ�� �ؾ��� �˼����ִ� �׳ɾ��� ��� �Դ��� Ȯ���ϰ� ������ �Ұ�����
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
		 * * �������� ����ϴ� ����
		 * 1. �θ�Ÿ���� ��ü�迭�� �پ��� �ڽİ�ü���� �޾��� �� ����
		 * 2. �޼ҵ��� �Ű������� ��ȯ���� �������� �����ϰ� �Ǹ�
		 * 	  �޼ҵ��� ������ Ȯ �ٿ��� �� �ִ�.
		 * 
		 * 
		 */
	}

}
