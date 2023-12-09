package com.Sandhya.RewardsApp.User;

import java.util.ArrayList;
import java.util.List;

public class CreateUser {
	public static List<User> users=new ArrayList<>();
	static{
		PasswordManagement pw=new PasswordManagement();
		User user1=new User(1,"Sandhya",PasswordManagement.Encrypt(PasswordManagement.credentials.get("Sandhya")));
		User user2=new User(2,"Amrutha",PasswordManagement.Encrypt(PasswordManagement.credentials.get("Amrutha")));
		User user3=new User(3,"Madhumitha",PasswordManagement.Encrypt(PasswordManagement.credentials.get("Madhumitha")));
		User user4=new User(4,"Harshitha",PasswordManagement.Encrypt(PasswordManagement.credentials.get("Harshitha")));
		User user5=new User(5,"Sirisha",PasswordManagement.Encrypt(PasswordManagement.credentials.get("Sirisha")));
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
	}
}
