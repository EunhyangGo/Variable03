package com.biz.var;

public class Variable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum = 0;
		
		double d = Math.random();
		System.out.println(d);
		// 0<= d <1 ��0.0~0.99999999 *10
		double d10 = d *10;
		System.out.println(d10);
		
		int i = (int)d10; //int������ ������ ��ȯ��Ű�°�.
		System.out.println(i); //�����κи� ���� ���ڰ� ��Ÿ��
		System.out.println(i+1); //1���� 10������ ������ ����ȴ�.
		
		int intR = (int)(Math.random() *10) +1; //1���� 10������ ������ ����ȴ�.
		
		intR = (int)(Math.random()*(100-50+1)) + 50; // 50���� 100������ ���� �����ϴ� ��� �����̵˴ϴ�.
		intR = (int)(Math.random()*(100-50+1)); //1���� 50������ ���� ����...?
		
		for(int k = 0; k <10; k++) {
			intR = (int)(Math.random()*(100-50+1)) + 50;
			System.out.println(intR);
		}
	}

}
