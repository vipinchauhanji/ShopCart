package com.poc.controller;

import java.util.Scanner;

import com.poc.authentication.UserLogin;


public class Main {
	
	/* this is controller class(main.java) of controller module.
	 * So this module consist of one class which control the flow of all other module or classes . 
	 * Basically this class directly interacts with user and ask for selection of choices.
	 * After selection jvm  navigate to caller method.
 
*/
	public static void main(String[] args) {
		System.out.println("welcome! to  Smart Shopping Cart");
		 System.out.println("------------------------------------");
		System.out.println("choose an appropriate option ");
		 System.out.println("1. register here");
	        System.out.println("2. login here ");
	        System.out.println("0. log out");
	        System.out.println("------------------------------------");
	        UserLogin ul=new UserLogin();
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		int ch=sc.nextInt();
		
		switch(ch)
		{
			case 1:ul.getRegister();
			       break;
			case 2:ul.getLogin();
			       break;
			case 0:System.exit(0);
			        break;
			default:System.out.println("enter valid choice");
		}
		
		}
		
		
		
	}

