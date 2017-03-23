package textAdventureSource;

/**
 * 
 * This is the base class for the game maps.
 * The basic idea is to store int values in
 * a 2-dimensional array (an array of arrays)
 * and use those values to describe the rooms
 * and the array index values to track the 
 * player movement.
 *
 */

public class GameMap {

	private int[][] mapMatrix;
	
	// indexes of where in the mapMatrix
	// to start the player position
	private int startX, startY;
	
	// used to track the player's current position
	private int currentY, currentX;
	
	public GameMap(int startY, int startX){
		this.startY = startY;
		this.startX = startX;
		this.currentX = startX;
		this.currentY = startY;
	}
	
	public int getCurrentRoom(){
		return mapMatrix[currentY][currentX];
	}
	
	// the canGo methods check the values of the matrix
	// in adjacent rooms to see if they are accessible 
	// they also check the boundaries of the array 
	
	public boolean canGoNorth(){
		if(currentY > 0 && mapMatrix[currentY - 1][currentX] != 0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean canGoSouth(){
		if(currentY < mapMatrix.length -1 && mapMatrix[currentY + 1][currentX] != 0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean canGoWest(){
		if(currentX > 0 && mapMatrix[currentY][currentX - 1] != 0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean canGoEast(){
		if(currentX < mapMatrix[0].length - 1 && mapMatrix[currentY][currentX + 1] != 0){
			return true;
		}else{
			return false;
		}
	}
	
	// the go methods alter the current index values to 
	// move player through the map
	
	public void goNorth(){
		currentY--;
	}
	
	public void goSouth(){
		currentY++;
	}
	
	public void goEast(){
		currentX++;
	}
	
	public void goWest(){
		currentX--;
	}
	
	public int getStartingRoom(){
		currentX = startX;
		currentY = startY;
		return mapMatrix[startY][startX];
	}
	
	public void setMap(int[][] mapMatrix){
		this.mapMatrix = mapMatrix;
	}

}
