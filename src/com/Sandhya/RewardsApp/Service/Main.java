package com.Sandhya.RewardsApp.Service;

import java.util.Scanner;

import com.Sandhya.RewardsApp.User.CreateUser;
import com.Sandhya.RewardsApp.User.PasswordManagement;

public class Main {
	public static void main(String args[]) {
		CreateUser create=new CreateUser();
		String password;
		System.out.println("Welcome to banking and rewards app");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=sc.next();
		System.out.println("Please enter the password");
		password=sc.next();
		if(PasswordManagement.compare(name,password)==true) {
			//System.out.println("")
		}
		else {
			System.out.println("Please check your password");
		}
		
	}

}
