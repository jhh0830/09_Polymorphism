package com.kh.chap02_abstractAndInterface.part01_basic.run;

import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Football;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Sports;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Basketball;

public class BasicRun {

	public static void main(String[] args) {
		
		// Sports ��ü ����
		//Sports  s = new Sports();
		// > �߻�Ŭ������ ���� ��ü ������ �Ұ�!!
		//   �̿ϼ��� Ŭ�����̱� ����
		
		//Sports s;
		// > ��, ��ü ������ �ȵɻ�, ���������δ� ��� ����
		
		
		// s= new Sports();
		//s = new Basketball();
		// > ��, �������� �����ؼ� �ڽİ�ü�� �޾��ִ� �뵵�δ� ��� ����
		
		// ��ü �迭 ���� �̿� ����
		Sports[] arr= new Sports[2];
		arr[0] =  new Basketball();
		arr[1] = new Football();
		
		// �ݺ��� Ȱ��
		for(int i = 0; i < arr.length; i++) {
			arr[i].rule();
		}
		
		/*
		 * *�߻�޼ҵ�
		 * �̿ϼ��� �޼ҵ�� ����� ({����}) �� �����Ǿ����� �ʴ� �޼ҵ�
		 * �ڽ�Ŭ�������� �������̵��� ���� �ϼ��� (������ ������� �ؾ���)
		 * > �������̵��� ���� ���� ��� ���� �߻�
		 * > �޼ҵ� ����� ���ϼ��� Ȯ���ϱ� ���� �������� ���
		 * > �ڵ� ���� ǥ��ȭ�� Ʋ�� ������ �������� ���!!
		 * 
		 * 
		 * *�߻�Ŭ����
		 * �߻�޼ҵ尡 "�ϳ���" �����ϴ� ���� �ݵ�� �߻�Ŭ������ ����
		 * (�Ϲ��ʵ� + �Ϲݸ޼ҵ� + �߻�޼ҵ�(��������))
		 * ��, �߻�޼ҵ尡 ���� ������ �ش� Ŭ������ �߻�Ŭ������ �� �� ����
		 * > �߻�Ŭ���� ���� �̿ϼ��� Ŭ�����̱� ������ ��ü ������ �Ұ�!!
		 * > ��, ���������δ� ��� ������ (������ ���� ����)
		 * 
		 * * �߻�޼ҵ尡 ������ abstract Ű���常 ���̸� 
		 * �ش� Ŭ������ �߻�Ŭ������ �ۼ� �����ϴ�.
		 * > �ڵ� �۾� �� Ŭ������ ���� �� ��ü������ ������ �����ΰ� ���� �� (������)
		 * > ���� Ű �������� ��ü ������ ���� �Ұ��ϰԲ� ���� ���� �� (�����)
		 * 
		 */
		
		
	}

}
