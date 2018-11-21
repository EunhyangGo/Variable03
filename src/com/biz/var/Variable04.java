package com.biz.var;

public class Variable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum = 0;
		
		double d = Math.random();
		System.out.println(d);
		// 0<= d <1 →0.0~0.99999999 *10
		double d10 = d *10;
		System.out.println(d10);
		
		int i = (int)d10; //int형으로 강제로 변환시키는것.
		System.out.println(i); //정수부분만 남는 숫자가 나타남
		System.out.println(i+1); //1부터 10까지의 범위가 추출된다.
		
		int intR = (int)(Math.random() *10) +1; //1부터 10까지의 범위가 추출된다.
		
		intR = (int)(Math.random()*(100-50+1)) + 50; // 50부터 100까지의 값을 추출하는 계산 공식이됩니다.
		intR = (int)(Math.random()*(100-50+1)); //1부터 50까지의 값을 추출...?
		
		for(int k = 0; k <10; k++) {
			intR = (int)(Math.random()*(100-50+1)) + 50;
			System.out.println(intR);
		}
	}

}
