package com.inheritance;
//Single level inheritance
class Father1  //superclass
{
	int fProperty = 10;
	
}
class Son1 extends Father1  //subclass
{
	int sProperty = 5;
	void totalProperty()
	{
		System.out.println("Total property of son: "+(sProperty+fProperty)+" lakhs");
		
	}
}
class Grandson extends Son1
{
	int gsProperty = 7;
	void gsTotalProperty()
	{
		System.out.println("Total property of grand son is: "+(sProperty+fProperty+gsProperty)+" lakhs");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Grandson gs = new Grandson();
		gs.gsTotalProperty();

	}

}
