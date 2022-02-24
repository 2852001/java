package com.superkeyword;

class Demo2
{
	Demo2(int a)
	{
		System.out.println("Hi "+a);
	}
}
class Test2 extends Demo2
{
	Test2()
	{
		super(10);
		System.out.println("Hello");
	}
}
public class SuperkeywordDemo2 {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		

	}

}
