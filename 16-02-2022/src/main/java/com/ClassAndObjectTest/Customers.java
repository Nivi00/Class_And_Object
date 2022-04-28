package com.ClassAndObjectTest;
/**
 * class: it is a template to the object/instance
 * 
 * object/instance: it is a physical entity, which have memory allocation in RAM(Heap).
 *
 */

//class contains state(variables) and behavior(methods)
public class Customers 
{
	//state(variables)
	int Id;
	String Name;
	String Address;
	
	//constructor: used to initialize an object(state)
	public Customers() 
	{
		Id = 220296;
		Name = "Charles";
		Address = "Ennore";
		}
	//behavior(methods)
	public void GetCustomerDetails() 
	{
		System.out.println(Id);
		System.out.println(Name);
		System.out.println(Address);
		
	}
	
    public static void main(String[] args)
    {
		Customers customer1=new Customers();
		
		customer1.GetCustomerDetails();

	}

}

