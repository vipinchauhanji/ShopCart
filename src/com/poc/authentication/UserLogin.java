package com.poc.authentication;

import java.util.ArrayList;
import java.util.Scanner;

import com.poc.services.UI;



public class UserLogin {
	/*
	 * mainly this module is used to get costumer validation .
	 * Which is directly interacting to main class.
	 * i use array list collection for storing costumer detail like name ,username,and password. 
	 * i  encapsulated crudencial detail like username and password.
	 * after validation cursor directly navigate to UI class.
	 */
	Scanner scn =new Scanner(System.in);
	public String rname;
	private String rusername;
	private String rpassword;
	String option ="Y";
	ArrayList<String> alname=new ArrayList<String>();
	ArrayList<String> alusername=new ArrayList<String>();
	ArrayList<String> alpassword=new ArrayList<String>();
	public  void getRegister() 
	{
		System.out.println("welcome to registration tool");
		System.out.println("enter your name");
		rname=scn.nextLine();
		System.out.println("enter your username");
		rusername=scn.nextLine();
		System.out.println("enter your password");
		rpassword=scn.nextLine();
		alname.add(rname);
		alusername.add(rusername);
		alpassword.add(rpassword);
		
		System.out.println("register successfully");
		System.out.println(" would you like do smart shopping  choose Y/N");
		option=scn.nextLine();
		if(option.equalsIgnoreCase("y")) 
		{
			getLogin();
		}
		else
		{
			System.exit(0);
		}
		
		
		
	}
	
	
	
	
	public  void getLogin() 
	{
		String uname;
		String upass;
		boolean flag1=false;
		boolean flag2=false;
		System.out.println(" first login yourself");
		//System.out.println(rname);
		System.out.println("enter your username:");
		uname=scn.nextLine();
		
		System.out.println("enter your password:");
		upass=scn.nextLine();
		
			if(uname.equals(rusername)) 
			{
				flag1=true;
			}
				
		
			if(upass.equals(rpassword)) 
			{
				flag2=true;
			}
				
		
		if(flag1==true&&flag2==true) 
		{
			System.out.println("welcome !  " );
			System.out.println( rname);
			new UI();
		}
		else
		{
			System.out.println("enter valid information");
			
			//getLogin();
			System.exit(0);
		}
		
	}
}
