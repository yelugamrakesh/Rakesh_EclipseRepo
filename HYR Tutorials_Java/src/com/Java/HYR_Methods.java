package com.Java;

public class HYR_Methods {

	
	 static int currentbalance=1000;
	
	 public static void greetcustomer()   //static Methods
	{
		System.out.println("welcome to the bank");
	}
	
	public  void deposit(int amount)   //Non static methods
	{
		currentbalance= currentbalance +amount;
	}
	
	public  static void withdrawl(int amount)  //static methods
	{
		currentbalance= currentbalance -amount;
	}
	   
	public int getcurrentbalance()   //Non static parameterized methdos
	{
		return currentbalance;
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greetcustomer();
		System.out.println("Your current balance is " +HYR_Methods.currentbalance);
	
		HYR_Methods bank=new HYR_Methods();
		bank.deposit(500);
		System.out.println("Your amount after deposit is " +currentbalance);
		
		withdrawl(200);
		System.out.println("Your current balance afte withdral is " +currentbalance);
		System.out.println(bank.getcurrentbalance());
		
	}

}
