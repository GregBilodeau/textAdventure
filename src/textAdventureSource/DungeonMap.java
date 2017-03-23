package textAdventureSource;

/**
 * 
 * This is a instance of a playable map
 *
 */

public class DungeonMap extends GameMap {
	
	public DungeonMap(){
		
		super(1,1);
		
		int[][] mapMatrix = new int[][]{
				{0,2,1,1,1,3},
				{1,1,3,0,1,1},
				{1,1,1,1,1,0}
		};
		
		this.setMap(mapMatrix);
	}
}
