package com.inheritance;
//Multiple inheritance
class Father2  //superclass
{
	int fProperty = 10;
	
}
class Mother  //superclass
{
	int mProperty = 5;
	
}
class Son1 extends Father2,Mother
{
	int sProperty = 7;
	void totalProperty()
	{
		System.out.println("Total property of grand son is: "+(sProperty+fProperty+mProperty)+" lakhs");
	}
}
public class MultipleInheritance {
	
	
	public static void main(String[] args) {
		Son1 s = new Son1();
		s.totalProperty();

	}

}
// In java multiple inhritance is not possible with classes.
