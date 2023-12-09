package com.Sandhya.RewardsApp.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.Sandhya.RewardsApp.User.CreateUser;
import com.Sandhya.RewardsApp.User.PasswordManagement;

public class Main {
	static int amount=200000;
	static boolean flag=false;
	static boolean limitedAmount=false;
	static long points=0;
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_RESET = "\u001B[0m"; 
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
		     Service();
		}
		else {
			System.out.println("Please check your password");
		}
		
	}
	public static void Service() {
		Processing p=new Processing();
		p.process();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Do you want to redeem some points and earn the rewards? Y/ N");
			String choice=sc.next();
			if(choice.equals("Y")) {
				points=Transactions.getPoints();
				System.out.println("You have earned "+points+" points");
				System.out.println("Do you want to redeem the earned points? Y / N");
				String redeem=sc.next();
				if(redeem.equals("Y")) {
					System.out.println("Please Select the category in which you want to use the points\n"+
				                        "1. Textiles\n"+
							            "2. Furniture\n"+
				                        "3. Travel\n"+
							            "4. Electronics\n");
					int category=sc.nextInt();
					Rewards rw=new Rewards();
					rw.Categories(category);
					System.out.println("Select any of the rewards on which you want to spend points");
					int reward=sc.nextInt();
					int redeemedPoints=rw.Redeemed(category,reward);
					if(points<redeemedPoints) {
						System.out.println("You do not have enough points to redeem, you have only "+points);
					}
					else{
						points=points-redeemedPoints;
						System.out.println("You have redeemed the points and earned the reward. Reminaing points are "+points);
						System.out.println("Please use the below coupon to shop online");
						String coupon=rw.generateCoupon();
						System.out.println(ANSI_YELLOW 
		                           + coupon
		                           + ANSI_RESET);
						System.out.println("=======================================================================================");
					}
				}
				else {
					System.out.println("Thank you for visiting the rewards app.");
					System.exit(0);
				}
			}
			else {
				System.out.println("Thank you for visiting the rewards app. Login back if you want to use the earned points.");
				System.exit(0);
			}
		}
	}


}