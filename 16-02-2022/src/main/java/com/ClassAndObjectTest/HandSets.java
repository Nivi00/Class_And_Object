package com.ClassAndObjectTest;

public class HandSets 
{
	int ModelNumber;
    String ROM;
    double RAM;
    String HandSetName;
    
   public HandSets() 
   {
	ModelNumber = 1807;
    ROM = "FuntouchOS_4.5";
    RAM = 4;
    HandSetName = "VivoY95";
 }
   private void GetHandSetDetails () 
   {
	System.out.println(ModelNumber);
	System.out.println(RAM);
	System.out.println(ROM);
	System.out.println(HandSetName);
	}
	public static void main(String[] args) {
		
		HandSets handSet1 = new HandSets();
		handSet1.GetHandSetDetails();

	}

}
