package com.Sandhya.RewardsApp.Service;

import java.util.ArrayList;
import java.util.List;

public class Rewards {
	  static List<List<Pair>> categories=new ArrayList<>();
	  static {
		  List<Pair> textiles=new ArrayList<>();
		  List<Pair> furniture=new ArrayList<>();
		  List<Pair> electronics=new ArrayList<>();
		  List<Pair> travel=new ArrayList<>();
		  textiles.add(new Pair(1,"Jeans",500));
		  textiles.add(new Pair(2,"Shirts", 400));
		  textiles.add(new Pair(3,"Trousers", 600));
		  textiles.add(new Pair(4,"Hoodies", 800));
		  furniture.add(new Pair(1,"StudyTable", 300));
		  furniture.add(new Pair(2,"StorageOrganizer", 1200));
		  furniture.add(new Pair(3,"Chairs", 2000));
		  furniture.add(new Pair(4,"Book shelf", 560));
		  electronics.add(new Pair(1,"Fridge", 8000));
		  electronics.add(new Pair(2,"TV", 9000));
		  electronics.add(new Pair(3,"airpods", 1200));
		  electronics.add(new Pair(4,"mobile", 5000));
		  travel.add(new Pair(1,"lugguage bag", 2000));
		  travel.add(new Pair(2,"travel kit", 300));
		  travel.add(new Pair(3,"Travel Organizer", 3400));
		  travel.add(new Pair(4,"Backpack", 1600));
		  categories.add(textiles);
		  categories.add(furniture);
		  categories.add(travel);
		  categories.add(electronics);  
	  }
      public void Categories(int category) {
    	 List<Pair> list=categories.get(category-1);
    	 for(Pair p : list) {
    		 System.out.println(p.id+" "+p.reward+" "+p.points);
    	 }
      }
      public int Redeemed(int category, int reward) {
    	  int p=categories.get(category-1).get(reward-1).points;
    	  return p;
      }
	public String generateCoupon() {
		// TODO Auto-generated method stub
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		         + "0123456789"
		         + "abcdefghijklmnopqrstuvxyz"; 
		  StringBuilder sb = new StringBuilder(16); 		 
		  for (int i = 0; i < 16; i++) { 
		   int index = (int)(AlphaNumericString.length() * Math.random()); 
		   sb.append(AlphaNumericString .charAt(index)); 
		  } 
		  return sb.toString(); 
	}
}
class Pair{
	int id;
	String reward;
	int points;
	Pair(int id, String reward, int points){
		this.id=id;
		this.reward=reward;
		this.points=points;
	}
}
