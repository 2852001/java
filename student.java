package studentapp;

import java.util.Scanner;

public class student {
	//student properties
	int studentId;
	String studentName;
	String studentAddrs;
	long moblieNumber;
	int screensize;
	int html;
	int css;
	int js;
	int es6;
	int recatjs;
	int java;
	private static Scanner sc;
	//actions
	void setDetails(int a,String b,String c,long d,int e)
	{
		studentId = a;
		studentName = b;
		studentAddrs = c;
		moblieNumber = d;
	    screensize = e;
	    
	}
	void setMarks(int x,int y,int z,int u,int v,int w)
	{
		html = x;
		css = y;
		js = z;
		es6 = u;
		recatjs = v;
		java = w;
	}
	void allInfo()
	{
		System.out.print("student id is|: "+studentId);
		System.out.print("student name is:"+studentName);
		System.out.print("student address is:"+studentAddrs);
		System.out.print("moblieNumber is:"+moblieNumber);
		System.out.print("html marks is:"+html);
		System.out.print("css marks is:"+css);
		System.out.print("js marks is:"+js);
		System.out.print("es6 marks is:"+es6);
		System.out.print("recatjs marks is:"+recatjs);
		System.out.print("java marks is:"+java);
	}

        void marksCalculation()
	{
		int reactjs = 0;
		int total = html+css+es6+js+reactjs+java;
		System.out.println("Total marks is : "+total);
		
		int avg = total/6;
		System.out.println("Average is : "+avg);
		
		if(avg>90)
		{
			System.out.println("A");
		}
		else if(avg>80&&avg<90)
		{
			System.out.println("B");
		}
		else if(avg>70&&avg<80)
		{
			System.out.println("C");
		}
		else if(avg>60&&avg<70)
		{
			System.out.println("D");
		}
		else if(avg>50&&avg<60)
		{
			System.out.println("E");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

	
	public static void main(String[] args) {
		// need to give chance to end user
		
		sc = new Scanner(System.in);
		System.out.print("welcome to student app!!!");
		System.out.println("Please enter student id");
		int a = sc.nextInt();
		System.out.println("Please enter studentName");
		String b = sc.next();
		System.out.println("Please enter studentAddrs");
		String c = sc.next();
		System.out.println("Please enter moblieNumber");
		long d = sc.nextLong();
		System.out.println("Please enter screensize");
		int e = sc.nextInt();
		
		System.out.println("Please enter html marks");
		int x= sc.nextInt();
		System.out.println("Please enter css");
		int y= sc.nextInt();
		System.out.println("Please enter js");
		int z =sc.nextInt();
		System.out.println("Please enter es6");
		int u= sc.nextInt();
		System.out.println("Please enter recatjs");
		int v= sc.nextInt();
		System.out.println("Please enter java");
		int w= sc.nextInt();
		
		//create object for student
		      student stud = new student();
		      stud.setDetails(a,b,c,d,e); 
			  stud.setMarks(x,y,z,u,v,w);
		      stud.allInfo();
			  stud.marksCalculation();
		      
		     
		      
		
		
		
		
		
		
		
	    

	}

}
