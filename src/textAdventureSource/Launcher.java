package textAdventureSource;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * This is the Launcher class - it contains the main method that gets
 * executed when the program is run. Its function is just to present
 * the user with a menu of options and then pass control over to the
 * other classes that do the work.
 *
 */

public class Launcher {
	
	static Profile myProfile = new Profile();
	static MainGameLoop gameLoop = new MainGameLoop();
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int selection = 0;
		
		String optionList = "Select an option below:\n\t1. Start game\n\t2. Edit Profile\n\t3. Exit";
		
		System.out.println("\nWelcome to TextAdventure 0.1.");
		
		do{
			
			System.out.println(optionList);
		
			// read in the option selected
			selection = in.nextInt();
			
			processSelection(selection);
			
		}while(selection != 3);

		System.out.println("Progam ending. Bye!");
		
	}
	
	private static void processSelection(int choice) throws IOException{

		switch(choice){
		case 1:
			System.out.println("Game starting...");
			gameLoop.start(myProfile);
			break;
		case 2:
			System.out.println("Editing profile:");
			myProfile.editProfile();
			break;
		case 3:
			System.out.println("Exit program");
			System.exit(0);
			break;
		default:
			System.out.println("Input not recognized");
			break;
		}
		System.out.println("(press enter to continue)");
		System.in.read();
	}

}
