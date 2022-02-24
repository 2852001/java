package com.thiskeyword;

 class Car {
	// car properties
	String carModel;//fields
	int mfgYear;
	int carPrice;
	// car action or behaviour
	 Car start()//method
	{
	System.out.println("turn key right to start");	
	return this;
	}
	 Car stop()
	{
	System.out.println("turn key left to stop");	
	return this;
	}
	Car setDetails(String a,int b,int c)
	{
	carModel = a;
	mfgYear = b;
	carPrice = c;
	
	return this;
	}
	Car allDetails()
	{
	System.out.println("car model is:"+carModel);
	System.out.println("car mfgYear is:"+mfgYear);
	System.out.println("car price is:"+carPrice);
	return this;
	}

	
 }//class closing

public class ThisFeature3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();//object syntax in java
		c.start().stop().setDetails("Audi",2022,10000000).allDetails();
		
	}

}
