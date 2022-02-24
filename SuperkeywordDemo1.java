package com.superkeyword;

class Demo1
{
	void Show()
	{
		System.out.println("Hi");
	}
}
class Test1 extends Demo1
{
	void Show()
	{
		super.Show();
		System.out.println("Hello");
	}
}
public class SuperkeywordDemo1 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.Show();

	}

}
