package textAdventureSource;

import java.util.Scanner;

/**
 * 
 * This is the main game loop class - it handles all of the 
 * actual game play inputs and actions. 
 *
 */

public class MainGameLoop {
	
	static Scanner in = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	
	// I use the GameMap super class so any class that extends it
	// can be used
	static GameMap myMap;
	
	public void start(Profile myProfile){
		
		myMap = new DungeonMap();
		
		// room code is the value from the 2D array map file
		int roomCode = myMap.getStartingRoom();
		
		gameLoop: while(roomCode != 100){
			switch(roomCode){
			case 1:
				System.out.println("(1) You are now in a cold, barren room.");
				break;
			case 2:
				System.out.println("(2) You found the exit!");
				roomCode = 100;
				break gameLoop;
			case 3:
				System.out.println("(3) You found a shiny sword.");
				break;
			}
			
			// clear the string builder to remove all the text
			sb.setLength(0);
			
			sb.append("There are exits to the ");
			
			if(myMap.canGoNorth()){
				sb.append("North (N) ");
			}
			
			if(myMap.canGoSouth()){
				sb.append("South (S) ");
			}
			
			if(myMap.canGoEast()){
				sb.append("East (E) ");
			}
			
			if(myMap.canGoWest()){
				sb.append("West (W) ");
			}
			
			sb.append("\nChoose direction");
			System.out.println(sb.toString());
			String go = in.nextLine();
			
			roomCode = processInput(go);
			
		}
		
		System.out.println("Returning to the main menu...");
		
	}
	
	private int processInput(String choice){
		
		int roomValue = Integer.MAX_VALUE;
		
		if(choice.equalsIgnoreCase("N")){
			if(myMap.canGoNorth()){
				myMap.goNorth();
				roomValue = myMap.getCurrentRoom();
			}else{
				System.out.println("You cannot go North");
				System.out.println(sb.toString());
				roomValue = processInput(in.nextLine());
			}
		}
		
		if(choice.equalsIgnoreCase("S")){
			if(myMap.canGoSouth()){
				myMap.goSouth();
				roomValue = myMap.getCurrentRoom();
			}else{
				System.out.println("You cannot go South");
				System.out.println(sb.toString());
				roomValue = processInput(in.nextLine());
			}
		}
		
		if(choice.equalsIgnoreCase("E")){
			if(myMap.canGoEast()){
				myMap.goEast();
				roomValue = myMap.getCurrentRoom();
			}else{
				System.out.println("You cannot go East");
				System.out.println(sb.toString());
				roomValue = processInput(in.nextLine());
			}
		}
		
		if(choice.equalsIgnoreCase("W")){
			if(myMap.canGoWest()){
				myMap.goWest();
				roomValue = myMap.getCurrentRoom();
			}else{
				System.out.println("You cannot go West");
				System.out.println(sb.toString());
				roomValue = processInput(in.nextLine());
			}
		}
		
		return roomValue;
	}
}
