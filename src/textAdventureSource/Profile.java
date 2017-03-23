package textAdventureSource;

import java.util.Scanner;

/**
 * 
 * This class contains the player's information
 *
 */

public class Profile {

	private String playerName;
	private int hitPoints;
	private InventoryObject[] myInventory;
	
	static Scanner in = new Scanner(System.in);

	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * @return the hitPoints
	 */
	public int getHitPoints() {
		return hitPoints;
	}

	/**
	 * @param hitPoints the hitPoints to set
	 */
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	/**
	 * @return the myInventory
	 */
	public InventoryObject[] getMyInventory() {
		return myInventory;
	}

	/**
	 * @param myInventory the myInventory to set
	 */
	public void setMyInventory(InventoryObject[] myInventory) {
		this.myInventory = myInventory;
	}
	
	public void editProfile(){
		System.out.println(this.toString());
		System.out.println("Enter a new name: ");
		this.setPlayerName(in.nextLine());
		System.out.println("Enter your hit points: ");
		this.setHitPoints(in.nextInt());
		System.out.println("Profile updated.");
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Your current profile:");
		sb.append("\n\tYour name: " + getPlayerName());
		sb.append("\n\tYour health: " + getHitPoints());
		sb.append("\n\tYour inventory: " + getMyInventory());
		
		
		return sb.toString();
	}
	
}
