package com.thiskeyword;

public class Product {

	String tvModel;//fields
	int mfgYear;
	int tvPrice;
	int screenSize;
	// app action or behaviour
	void setDetails(String tvModel,int mfgYear,int tvPrice,int screenSize)
	{
	this.tvModel = tvModel;
	this.mfgYear = mfgYear;
	this.tvPrice = tvPrice;
	this.screenSize = screenSize;
	}
	void allInfo()
	{
	System.out.println("tv model is:"+tvModel);
	System.out.println("tv mfgYear is:"+mfgYear);
	System.out.println("tv price is:"+tvPrice);
	System.out.println("tv size is:"+screenSize+"inches");
	}
	
	
	
	public static void main(String[] args) {
		Product p = new Product();
		p.setDetails("LG LED", 2020,30000, 21);
	    p.allInfo();
	}

}

