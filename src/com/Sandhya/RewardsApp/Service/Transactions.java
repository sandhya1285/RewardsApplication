package com.Sandhya.RewardsApp.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Transactions {
	static long pointsEarned=0;
	static int amt;
	static boolean flag=false;
	synchronized public void create() {
		try{
			if(flag==false) {
				Random rand=new Random();
				amt=(rand.nextInt(1,200))*1000;
				//System.out.println("amt created "+amt);
				flag=true;
				notify();
			}
			else {
				wait();
			}
			
		}
		catch(Exception e) {
			
		}
		
	}
	synchronized public void get() {
		try{
			if(flag==true) {
				//System.out.println("amt added "+amt);
				int points=amt/100;
				pointsEarned+=points;
				Main.points=pointsEarned;
				System.out.println("The updated points are : "+Main.points);
				flag=false;
				notify();
			}
			else {
				wait();
			}
			
		}
		catch(Exception e) {
			
		}
		
	}
	public static long getPoints() {
		return Main.points;
	}
}	
	
class Debit extends Thread{
	Transactions t;
	public Debit(Transactions y) {
		t=y;
	}
	public void run() {
		while(true) {
			try {
				t.create();
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class GetPoints extends Thread{
	Transactions t;
	public GetPoints(Transactions y) {
		t=y;
	}
	public void run() {
		while(true) {
			try {
				t.get();
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Processing{
	public void process() {
		System.out.println("Inside processing");
		Transactions t=new Transactions();
		Debit db=new Debit(t);
		db.start();
		GetPoints get=new GetPoints(t);
		get.start();
	}
}




