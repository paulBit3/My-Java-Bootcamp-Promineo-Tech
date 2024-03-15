package oopMenuApp;

import java.io.*;
import java.util.*;

public class App {
	static Scanner sc = new Scanner(System.in);
	static List<Team> teams = new ArrayList<Team>();
	
	

	public static void main(String[] args) {
		
		//decision variable
		int decision = 0;
		
		//using a while loop
		while(true) {
			//printing option
			printOptions();
			
			//getting user decision
			decision = sc.nextInt();
			if(decision == 1) {
				teams.add(createNewTeam());
			} else if (decision == 2) {
				addPlayerToTeam();
			} else if (decision == 3) {
				removePlayerFromteam();
			} else if (decision == 4) {
				getTeamInfo();
			} else {
				System.out.println("Please Pick a valid Option");
			}
		}
		
		// Testing
		
		
		/*
		 * will print
		 * 
		 * 
		 * 1
			Enter a Team name to createRangers
			1: Create New Team 
			2: Add New player To Team
			3: Remove Player From Team
			4: View Team Info
			
			2
			Rangers
			Enter the name of the team you want to add player to:Rangers
			Enter player name: 
			Ricky
			Enter Player position: 
			Smasher
			Enter Player specialty: 
			Runfast
			
			1: Create New Team 
			2: Add New player To Team
			3: Remove Player From Team
			4: View Team Info
			
			4
			Rangers
			Select a Team to see ist info Rangers
			Team Name: Rangers
			Player: Ricky
			Position: Smasher
			Speciality: Runfast
			
			
			1: Create New Team 
			2: Add New player To Team
			3: Remove Player From Team
			4: View Team Info
		 * 
		 */
		
		
		//instantiate player
		//Player p1 = new Player("Angela", "Striker", " Run fast");
		//p1.getInfo();
		
		//Player p2 = new Player("Mario", "Runner", " Throw ball");
		
		
		//team instance
		//Team team = new Team("CowBows");
		
		//adding player to team
		//team.addPlayer(p1);
		//team.addPlayer(p2);
		
		//team.getInfo();
		
	
		/*this will print
		 * 
		 * Team Name: CowBows
		   Player: Angela
		   Position: Striker
		   Speciality:  Run fast
		   
		   Player: Mario
		   Position: Runner
		   Speciality:  Throw ball
		 */
		
		
		//removing player
		//team.removePlayer("Angela");
		//team.getInfo();
		
		/*
		 * this will print
		 * Team Name: CowBows
		   Player: Mario
		   Position: Runner
		   Speciality:  Throw ball
		 */

	}
	
	//methods
	
	//printing option method
	private static void printOptions() {
		System.out.println("1: Create New Team ");
		System.out.println("2: Add New player To Team");
		System.out.println("3: Remove Player From Team");
		System.out.println("4: View Team Info");
	}
	
	
	//Team info method
	private static void getTeamInfo() {
		printTeamNames();
		
		System.out.print("Select a Team to see ist info ");
		String teamName = sc.next();
		
		try {
			
			Team name = findTeamByName(teamName);
			
			//team info
			name.getInfo();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		
	}
	
	
	
	//creating a team method
	private static Team createNewTeam() {
		printTeamNames();
		
		System.out.print("Enter a Team name to create");
		
		//getting user input
		String name = sc.next();
		
		return new Team(name);
	}
	
	
	
	//adding player to team method
	private static void addPlayerToTeam() {
		printTeamNames();
		
		System.out.print("Enter the name of the team you want to add player to:");
		
		String teamName = sc.next();
		try {
			
			Team name = findTeamByName(teamName);
			
			//creating the player
			name.addPlayer(createNewPlayer());
			
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	
	//removing a player method
	private static void removePlayerFromteam() {
		printTeamNames();
		System.out.print("Enter the name of the team you want to remove a player from:");
		
		String teamName = sc.next();
		try {
			Team name = findTeamByName(teamName);
			name.getInfo();
			
			System.out.print("Select the player you want to remove: ");
			
			String playerName = sc.next();
			
			
			//removing the player
			name.removePlayer(playerName);
			
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	
	//create a new player method
	private static Player createNewPlayer() {
		System.out.println("Enter player name: ");
		
		//getting player name
		String name = sc.next();
		
		System.out.println("Enter Player position: ");
		
		//getting player position
		String position = sc.next();
		
		System.out.println("Enter Player specialty: ");
		
		//getting user specialty
		String specialty = sc.next();
		
		return new Player(name, position, specialty);

	}
	
	
	
	//method to print team names
	private static void printTeamNames() {
		for(Team team: teams) {
			System.out.println(team.getName());
		}
	}
	
	
	//find Team method
	private static Team findTeamByName(String name) throws Exception {
		for(Team t : teams) {
			if(t.getName().equals(name)) {
				return t;
			}
		}
		//throwing exceptions
		throw new Exception("Team Not Found: " + name);
	}



}
