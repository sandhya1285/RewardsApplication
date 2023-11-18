package com.Sandhya.RewardsApp.User;

import java.util.List;

class User {
	private int id;
	private String name;
	private String password;
	private List<String> redeemedRewards;

	public User(int id, String name, String password, List<String> redeemedRewards) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.redeemedRewards=redeemedRewards;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getRedeemedRewards() {
		return redeemedRewards;
	}

	public void setRedeemedRewards(List<String> redeemedRewards) {
		this.redeemedRewards = redeemedRewards;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", password=" + password +", redeemedRewards=" + redeemedRewards
				+ "]";
	}


}
