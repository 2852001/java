package com.thiskeyword;

class Sample{
	int a,b,c,d;
   Sample(int a,int b)
  {
	   this.a = a;
	   this.b = b;
	  System.out.println("First Constructor");
  }
 Sample(int a,int b,int c)
 {
	 this(a,b);
	 this.c = c;
	 System.out.println("Second Constructor");
 }
 Sample(int a,int b,int c,int d)
 {
	 this(a,b,c);
	 this.d = d;
	 System.out.println("Third Constructor");
 }
}
public class ThisFeature2 {

	public static void main(String[] args) {
		Sample s = new Sample(10,20,30,40);
		
	}

}
