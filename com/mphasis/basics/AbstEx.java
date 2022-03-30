package com.mphasis.basics;


class CalculatorImp implements Calculator1,Calculator2{
	@Override
	public
	void sum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	public
	void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
	}

	@Override
	public
	void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
	}

	@Override
	public
	void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a/b);
	}
	
	
}


public class AbstEx {
	public static void main(String[] args) {
		
		CalculatorImp imp=new CalculatorImp();
		imp.sum(20, 30);
		
		
	}

}

