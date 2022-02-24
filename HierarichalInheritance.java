package com.inheritance;

class Parents
{
	int pProperty = 10;
	
}
class Child1 extends Parents
{
	int c1Property = 20;
	void c1TotalProperty()
	{
		System.out.println("c1TotalProperty is :"+(pProperty+c1Property)+" lakhs");
	}
	
}
class Child2 extends Parents
{
	int c2Property = 25;
	void c2TotalProperty()
	{
		System.out.println("c1TotalProperty is :"+(pProperty+c2Property)+" lakhs");
	}
	
}
public class HierarichalInheritance {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.c1TotalProperty();
		Child2 c2 = new Child2();
		c2.c2TotalProperty();

	}

}
