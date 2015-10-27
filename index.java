import java.util.Scanner;


public class Index {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean menu = true;
		while(menu) {
			System.out.println("\n*~*~*~*~*~*~*~*~*~*~*~*~*~");
			System.out.println("Welcome, Hero, to SKAIA.");
			System.out.println("Would you like to: ");
			System.out.println("s - start a new game");
			System.out.println("l - load a previous game");
			System.out.println("o - customize options");
			System.out.println("c - see the games credits");
			char ans = scanner.next().charAt(0);
			if(ans == 's') {
				System.out.println("This will erase any old save files.");
				System.out.println("Are you sure? (True/False)");
				if(scanner.nextBoolean()) {
					menu = false;
					userpack.SetUp();
					userpack.PlaySetUp();
				}
			}
			else if(ans == 'l') {
				System.out.println("Loading old game...");
				//LOAD OLD GAME
			}
			else if(ans == 'o') {
				//CHANGE OPTIONS
			}
			else if(ans == 'c') {
				System.out.println("HOMESTUCK, SKAIA and SBURB all belong to Andrew Hussie.");
				System.out.println("This is a fan-made project and does not make me any money.");
				System.out.println("(Though you can donate if you want to!)");
				System.out.println("At the moment, credit for programming goes to: ");
				System.out.println("DREW THOMPSON \n adoringcatfish.tumblr.com");
				System.out.println("Credit for XXX goes to: ");
				System.out.println("nodbody.");
			}
			else {
				System.out.println("Not a valid input!");
			}
		}
	}
}
