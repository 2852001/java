package com.inheritance;
//Hybrid inheritance

class GrandFather
{
	int gfProperty = 9;
	
}
class Father3 extends GrandFather //superclass
{
	int fProperty = 10;
	
}
class Mother1  //superclass
{
	int mProperty = 5;
	
}
class Son2 extends Father3,Mother1
{
	int sProperty = 7;
	void totalProperty()
	{
		System.out.println("Total property of grand son is: "+(sProperty+fProperty+mProperty)+" lakhs");
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		
	}

}
//Hybrid inheritance is not possible in java.(multiple inheritance is not possible using classes)
