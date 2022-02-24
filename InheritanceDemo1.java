package com.inheritance1;



//Single level inheritance
class Employee  //superclass
{
	
	int employeeId;
	String employeeName;
	long mobileNumber;
	String designation;
}
class Compensation3 extends Employee //subclass
{
	
	int basicSalary,hra,pf,ta;
	int homeLoan,persLoan,medLoan;
	int sickLeave,casualLeave;
	
	Compensation3(int employeeId,String employeeName,long mobileNumber,String designation,int basicSalary,int hra,int pf,int ta, int homeLoan, int persLoan, int medLoan, int sickLeave, int casualLeave)
	{
	 this.employeeId = employeeId;
	 this.employeeName = employeeName;
	 this.mobileNumber = mobileNumber;
	 this.designation = designation;
	 this.basicSalary = basicSalary;
	 this.hra = hra;
	 this.pf = pf;
	 this.ta = ta;
	 this.homeLoan = homeLoan;
	 this.persLoan = persLoan;
	 this.medLoan = medLoan;
	 this.sickLeave = sickLeave;
	 this.casualLeave = casualLeave;
	 
		
	 
	 
	}
	
	void allInfo()
	{
		System.out.println("employeeId is: "+employeeId);
		System.out.println("employeeName is: "+employeeName);
		System.out.println("mobileNumber is: "+mobileNumber);
		System.out.println("designation is: "+designation);
		System.out.println("basicSalary is: "+basicSalary);
		System.out.println("hra is: "+hra);
		System.out.println("pf is: "+pf);
		System.out.println("ta is: "+ta);
		System.out.println("homeLoan is: "+homeLoan+"rs");
		System.out.println("persLoan is: "+persLoan+"rs");
		System.out.println("medLoan is: "+medLoan+"rs");
		System.out.println("sickLeave is:"+sickLeave+"days");
		System.out.println("casualLeave is:"+casualLeave+"days");
	}
}
public class InheritanceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compensation3 c = new Compensation3(1001,"HARI",1234567899,"ENGINEER",10000,8000,3000,2000,100000, 200000, 300000, 2, 5);
		c.allInfo();
	}

}


