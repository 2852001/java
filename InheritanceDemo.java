package com.inheritance;
//Single level inheritance
class Father  //superclass
{
	int fProperty = 10;
	
}
class Son extends Father  //subclass
{
	int sProperty = 5;
	void totalProperty()
	{
		System.out.println("Total property of son: "+(sProperty+fProperty)+" lakhs");
		
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		Son s = new Son();
		s.totalProperty();

	}

}

