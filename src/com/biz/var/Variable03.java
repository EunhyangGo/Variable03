package com.biz.var;

public class Variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intNum = 0;
		intNum +=10;
		intNum +=20;
		intNum +=30;
		intNum +=40;
		
		System.out.println(intNum);
		
		intNum = 0;
		int intCount = 0;
		
		intNum +=((intCount+=1) *10);
		intNum +=((intCount+=1) *10);
		intNum +=((intCount+=1) *10);
		intNum +=((intCount+=1) *10);
		intNum +=((intCount+=1) *10);
		intNum +=((intCount+=1) *10);
		System.out.println(intNum);
		
		intNum = 0;
		intCount = 0;
		
		intNum +=((intCount++) *10); //0
		intNum +=((intCount++) *10); //10
		intNum +=((intCount++) *10); //20
		intNum +=((intCount++) *10); //30
		intNum +=((intCount++) *10); //40
		intNum +=((intCount++) *10); //50
		System.out.println(intNum);
		
		intNum = 0;
		for(int i = 0; i<5; i++) {
			intNum += (i*10);
			//변수가 어떻게 변하는가. 가급적이면 숫자를 직접쓰지말고 코드를 줄여서 사용해보자.
		}
	}

}
