package textAdventureSource;

/**
 * 
 * This is the base class for objects in the game that
 * the player can pick up and include in their inventory
 *
 */

public class InventoryObject {
	
	private String objectName;
	private int objectWeight;
	
	
	public void useObject(){
		
	}


	/**
	 * @return the objectName
	 */
	public String getObjectName() {
		return objectName;
	}


	/**
	 * @param objectName the objectName to set
	 */
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}


	/**
	 * @return the objectWeight
	 */
	public int getObjectWeight() {
		return objectWeight;
	}


	/**
	 * @param objectWeight the objectWeight to set
	 */
	public void setObjectWeight(int objectWeight) {
		this.objectWeight = objectWeight;
	}

}
