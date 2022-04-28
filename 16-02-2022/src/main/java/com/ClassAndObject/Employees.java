package com.ClassAndObject;

public class Employees 
{
	int id;
	String name;
	double salary;
	String address;
	
	 public Employees() 
	{
		id = 2546;
		name = "Charles";
		salary = 30000;
		address = "chennai";
		}
	
	 private void getemployeedetails() 
	 {
		System.out.println(id);
		System.out.println(name);
        System.out.println(salary);
        System.out.println(address);
	}
	 
	 
	     public static void main( String[] args )
    {
	    	  Employees employee1 = new Employees();
	    	  
	    	  employee1.getemployeedetails();
    }
}
        
