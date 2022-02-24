package com.superkeyword;

class Demo
{
	int a = 10;
}
class Test extends Demo
{
	int a = 20;
	Test()
	{
		System.out.println("Super class a value is: "+super.a);
		System.out.println("Sub class a value is: "+a);
	}
}
public class SuperDemo {

	public static void main(String[] args) {
	Test t = new Test();
	

	}

}
