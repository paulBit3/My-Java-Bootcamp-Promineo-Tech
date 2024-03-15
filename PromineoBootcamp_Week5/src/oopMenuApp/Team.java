package oopMenuApp;

import java.util.*;

public class Team {
	
	private List<Player> players = new ArrayList<>();
	private String name;
	
	
	public Team(String name) {
		this.setName(name);
	}
	
	//getting player info
	public void getInfo() {
		//printing team name
		System.out.println("Team Name: " + name);
		
		//printing players
		for(Player p : players) {
			p.getInfo();
		}
	}
	
	
	//adding player to team
	public void addPlayer(Player p) {
		players.add(p);
	}
	
	//removing player
	public void removePlayer(String  name) {
		for(Player p : players) {
			if(p.getName().equals(name)) {
				players.remove(p);
			}
		}
	}
	
	
	
	
	/*
	 * getters and setters
	 */
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
