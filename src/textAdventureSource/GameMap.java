package textAdventureSource;

public class GameMap {

	private int[][] mapMatrix;
	
	private int startX, startY;
	
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
