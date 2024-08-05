package com.test;

abstract class Hall {
	public abstract void getFire();
}

class Base{
	
}

class Sub extends Base{
	
}

class Sub2 extends Base{
	
}
public class Haddon extends Hall{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Haddon().getFire();
		Base b = new Base();
		Sub s = (Sub)b;
	}

	@Override
	public void getFire() {
		// TODO Auto-generated method stub
		System.out.print("oppo");
	}

}
