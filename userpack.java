import java.util.Scanner;
class userpack {
	//*~*~*~*~*~*~*~*~*~*~*
	//| SET UP VARIABLES  |
	//*~*~*~*~*~*~*~*~*~*~*
	public static String fname;
	public static String lname;
	public static int age =13;
	//gender stuff
	public static String man;
	public static String they;
	public static String them;
	public static String their;
	public static String theirs;
	public static String themself;
	//physical stuff
	public static String eyecolor;
	public static  String haircolor;
	public static String skincolor;
	public static int height;
	public static int weight;
	//clothing stuff
	public static String top;
	public static String topcolor;
	public static String topsymbol;
	public static String bottom;
	public static String bottomcolor;
	public static String shoes;
	public static String shoecolor;
	
	//*~*~*~*~*~*~*~*~*~*~*~*
	//| GAME PLAY VARIABLES |
	//*~*~*~*~*~*~*~*~*~*~*~*
	public static int hp = 0;
	public static int str = 15;
	public static int dex = 14;
	public static int con = 13;
	public static int intel = 12;
	public static int wis = 10;
	public static int cha = 8;
	public static int will = 0;
	public static int reflex = 0;
	public static int fortitude = 0;
	public static int ac = 0;
	public static int lvl = 1;
	public static int speed = 0;
	public static int atk = 0;
	public static int xp = 0;
	//15,14,13,12,10,8
	
	//'joke' variables
	public static int pulchritude = 0;
	public static int pranksters_gambit = 0;
	public static int imagination = 0;
	public static int vim = 0;
	public static int blood_sugar = 0;
	public static int etiquette = 0;
	public static int hysteria = 0;
	public static int nerves = 0;
	public static int sick_burn = 0;

	
	
	
	public static void SetUp() {
		//SETUP SETUP 
		Scanner scanner = new Scanner(System.in);
		//NAME
		System.out.println("Beginning 'Fun' Customization!");
		System.out.println("What is your first name? ");
		fname = scanner.nextLine();
		System.out.println("What is your last name? ");
		lname = scanner.nextLine();
		System.out.println("Welcome " + fname.toUpperCase() + " " + lname.toUpperCase());
		//PRONOUNS
		System.out.println("Now determing your pronouns!");
		System.out.println("You are a young (woman, man, girl, enby, cat, ?): ");
		man = scanner.nextLine();
		System.out.println("She, he, they....: ");
		they = scanner.nextLine();
		System.out.println("Her, him, them...: ");
		them = scanner.nextLine();
		System.out.println("Her, His, Their...: ");
		their = scanner.nextLine();
		System.out.println("Hers, His, Theirs...:");
		theirs = scanner.nextLine();
		System.out.println("Herself, Himself, Themself...: ");
		themself = scanner.nextLine();
		System.out.println("Your pronouns are " + they + "/" + them + "/" + their + "/" + theirs + "/" + themself + " and you are a " + man + "!");
		//APPERANCE
		System.out.println("You have what color eyes? ");
		eyecolor = scanner.nextLine();
		System.out.println("you have what color hair? ");
		haircolor = scanner.nextLine();
		System.out.println("You have what color skin? ");
		skincolor = scanner.nextLine();
		System.out.println("How tall are you in cm? ");
		height = scanner.nextInt();
		System.out.println("How many kilograms do you weigh? ");
		weight = scanner.nextInt();
		System.out.println("You have " + eyecolor + " eyes and " + haircolor + " hair. You have " + skincolor + " skin, and are " + height + " cm tall and weigh " + weight + " kg!");
		System.out.println("Would you like to go more in-depth into appearance? (True/False)");
		Boolean moreapp = scanner.nextBoolean();
		top = "shirt";
		topcolor = "white";
		topsymbol ="generic symbol";
		bottom = "pants";
		bottomcolor = "gray";
		shoes = "shoes";
		shoecolor = "gray";
		if(moreapp) {
			System.out.println("Okay! What top are you wearing? ");
			top = scanner.nextLine();
			top = scanner.nextLine();
			System.out.println("What color is the top? ");
			topcolor = scanner.nextLine();
			System.out.println("What symbol does your top have? ");
			topsymbol = scanner.nextLine();
			System.out.println("What bottom are you wearing? ");
			bottom = scanner.nextLine();
			System.out.println("What color are your " + bottom + "?");
			bottomcolor = scanner.nextLine();
			System.out.println("What shoes are you wearing? ");
			shoes = scanner.nextLine();
			System.out.println("What color are they?");
			shoecolor = scanner.nextLine();
		}
		System.out.println("You are wearing a " + topcolor + " " + top + " with a " + topsymbol + " on it. You are also wearing " + bottomcolor + " " + bottom + " with " + shoecolor + " " + shoes + ".");
		System.out.println("Congratulations! The 'Fun' Customization is over.");
			
		}
	public static void PlaySetUp() {
		System.out.println("Welcome to your actual character setup!");
		System.out.println("Generating values...");
		int a = GameMechanics.DiceRollNum(1,6,3);
		int b = GameMechanics.DiceRollNum(1,6,3);
		int c = GameMechanics.DiceRollNum(1,6,3);
		int d = GameMechanics.DiceRollNum(1,6,3);
		int e = GameMechanics.DiceRollNum(1,6,3);
		int f = GameMechanics.DiceRollNum(1,6,3);
		int g = GameMechanics.DiceRollNum(1,6,3);
		System.out.println("Your possible scores are: \na: " + a + "\nb: " + b + "\nc: " + c  + "\nd: " + d + "\ne: " + e + "\nf: " + f + "\ng: " + g);
		System.out.println("You are setting your strenght, dextery, constitution, intellegence, wisdom , and charisma.");
		str = VarSet("STRENGTH: ", a, b, c, d, e, f,g);
		dex = VarSet("DEXTERITY:  ", a, b, c, d, e, f,g);
		con = VarSet("CONSTITUTION: ", a, b, c, d, e, f,g);
		intel = VarSet("INTELLEGENCE: ", a, b, c, d, e, f,g);
		wis = VarSet("WIDSOM: ",a,b,c,d,e,f,g);
		cha = VarSet("CHARISMA: ", a, b, c, d, e, f,g);
		System.out.println("Congrats! Here is your character sheet.");
		CharSheet();
		
	}

	private static int VarSet(String prompt, int a ,int b, int c, int d, int e, int f,int g) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(prompt);
		char ans = scanner.next().charAt(0);
		boolean run = true;
		while(run == true) { 
			if(ans == 'a') {
				return a;
			}
			else if(ans == 'b') {
				return b;
			}
			else if(ans == 'c') {
				return c;
			}
			else if(ans == 'd') {
				return d; 
			}
			else if(ans == 'e') {
				return e;
			}
			else if(ans =='f'){
				return f;
			}
			else if(ans == 'g'){
				return g;
			}
			else {
				System.out.println("You didn't input a valid value.");
				System.out.println("Please try again.");
			}
		}
		return a;
		
	}
		
	public static void CharSheet() {
		System.out.println("----------------------------------");
		System.out.println(fname + " " + lname + "\tLVL" + lvl);
		System.out.println("----------------------------------");
		System.out.println("XP - " + xp + "\tATK - " + atk);
		System.out.println("AC - " + ac + "\tSPEED - " + speed);
		System.out.println("STRENGTH - " + str);
		System.out.println("DEXTERITY - " + dex);
		System.out.println("CONSTITUTION - " + con);
		System.out.println("INTELLEGENCE - " + intel);
		System.out.println("WIDSOM - " + wis);
		System.out.println("CHARISMA - " + cha);
		System.out.println("WILL - " + will + "\tREFLEX - " + reflex);
		System.out.println("FORTITUDE - " + fortitude);
		System.out.println("----------------------------------");
		System.out.println("DESCRIPTION");
		System.out.println("----------------------------------");
		System.out.println(fname + " is a " + age + "year old " + man +". " + they + " have " + eyecolor + " eyes and " + haircolor + " hair. " + they +" weigh about " + weight + " and are about " + height +"cm tall. \n"
				+ they + " is wearing a  " + topcolor + " " + top + " and " + bottomcolor + " " + bottom + ". ");
		System.out.println("BONUS VARIABLES!");
		System.out.println("----------------------------------");
		if(pulchritude != 0){
			System.out.println("PULCHRITUDE - " + pulchritude);
		}
		if(pranksters_gambit != 0){
			System.out.println("PRANKSTERS GAMBIT - " + pranksters_gambit);
		}
		if(imagination != 0){
			System.out.println("IMAGINATION - " + imagination);
		}
		if(vim != 0){
			System.out.println("VIM - " + vim);
		}
		if(blood_sugar != 0){
			System.out.println("BLOOD SUGAR - " + blood_sugar);
		}
		if(etiquette != 0){
			System.out.println("ETIQUETTE - " + etiquette);
		}
		if(hysteria != 0){
			System.out.println("HYSTERIA - " + hysteria);
		}
		if(nerves != 0){
			System.out.println("NERVES - " + nerves);
		}
		if(sick_burn != 0){
			System.out.println("SICK BURN - " + sick_burn);
		}
		System.out.println("----------------------------------");

	}
	private static void Hp() {
		hp += GameMechanics.DiceRoll(1,10);
	}
}
