import java.util.Scanner;


public class Index {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
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
					userpack p1 = new userpack();
					/*boolean correct = false;
					do {
						System.out.println("How many people are participating in your game? (up to 12");
						int pnum = scanner.nextInt();
						if(pnum >= 2) {
							correct = true;
							userpack p2 = new userpack();
							if(pnum >= 3){
							userpack p3 = new userpack();
							}
							if(pnum >= 4){
							userpack p4 = new userpack();
							}
							if(pnum >=5){
							userpack p5 = new userpack();
							}
							if(pnum >=6){
							userpack p6 = new userpack();
							}
							if(pnum >=7){
							userpack p7 = new userpack();
							}
							if(pnum >=8){
							userpack p8 = new userpack();
							}
							if(pnum >=9){
							userpack p9 = new userpack();
							}
							if(pnum >=10){
							userpack p10 = new userpack();
							}
							if(pnum >=11){
							userpack p11 = new userpack();
							}
							if(pnum >=12){
							userpack p12 = new userpack();
							}
							if(pnum >12){
								correct = false;
							}
						}
					} while (correct != true);*/

					
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
