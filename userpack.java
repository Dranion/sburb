import java.util.Scanner;
class userpack {
	//*~*~*~*~*~*~*~*~*~*~*
	//| SET UP VARIABLES  |
	//*~*~*~*~*~*~*~*~*~*~*
	String fname = "John";
	String lname = "Egbert";
	int age = 13;
	//gender stuff
	String man;
	String they;
	String them;
	String their;
	String theirs;
	String themself;
	//physical stuff
	String eyecolor;
	String haircolor;
	String skincolor;
	int height;
	int weight;
	//clothing stuff
	String top;
	String topcolor;
	String topsymbol;
	String bottom;
	String bottomcolor;
	String shoes;
	String shoecolor;
	
	//*~*~*~*~*~*~*~*~*~*~*~*
	//| GAME PLAY VARIABLES |
	//*~*~*~*~*~*~*~*~*~*~*~*
	int hp = 0;
	int str = 15;
	int dex = 14;
	int con = 13;
	int intel = 12;
	int wis = 10;
	int cha = 8;
	int will = 0;
	int reflex = 0;
	int fortitude = 0;
	int ac = 0;
	int lvl = 1;
	int speed = 0;
	int atk = 0;
	int xp = 0;
	
	//'joke' variables
	int pulchritude = 0;
	int pranksters_gambit = 0;
	int imagination = 0;
	int vim = 0;
	int blood_sugar = 0;
	int etiquette = 0;
	int hysteria = 0;
	int nerves = 0;
	int sick_burn = 0;

	
	
	public userpack() {
				//SETUP SETUP 
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		//NAME
		System.out.println("Beginning 'Fun' Customization!");
		System.out.println("What is your first name? ");
		this.fname = scanner.nextLine();
		System.out.println("What is your last name? ");
		this.lname = scanner.nextLine();
		System.out.println("Welcome " + this.fname.toUpperCase() + " " + this.lname.toUpperCase());
		//PRONOUNS
		System.out.println("Now determing your pronouns!");
		System.out.println("You are a young (woman, man, girl, enby, cat, ?): ");
		this.man = scanner.nextLine();
		System.out.println("She, he, they....: ");
		this.they = scanner.nextLine();
		System.out.println("Her, him, them...: ");
		this.them = scanner.nextLine();
		System.out.println("Her, His, Their...: ");
		this.their = scanner.nextLine();
		System.out.println("Hers, His, Theirs...:");
		this.theirs = scanner.nextLine();
		System.out.println("Herself, Himself, Themself...: ");
		this.themself = scanner.nextLine();
		System.out.println("Your pronouns are " + this.they + "/" + this.them + "/" + this.their + "/" + this.theirs + "/" + this.themself + " and you are a " + this.man + "!");
		//APPERANCE
		System.out.println("You have what color eyes? ");
		this.eyecolor = scanner.nextLine();
		System.out.println("you have what color hair? ");
		this.haircolor = scanner.nextLine();
		System.out.println("You have what color skin? ");
		this.skincolor = scanner.nextLine();
		System.out.println("How tall are you in cm? ");
		this.height = scanner.nextInt();
		System.out.println("How many kilograms do you weigh? ");
		this.weight = scanner.nextInt();
		System.out.println("You have " + eyecolor + " eyes and " + haircolor + " hair. You have " + skincolor + " skin, and are " + height + " cm tall and weigh " + weight + " kg!");
		System.out.println("Would you like to go more in-depth into appearance? (True/False)");
		Boolean moreapp = scanner.nextBoolean();
		this.top = "shirt";
		this.topcolor = "white";
		this.topsymbol ="generic symbol";
		this.bottom = "pants";
		this.bottomcolor = "gray";
		this.shoes = "shoes";
		this.shoecolor = "gray";
		if(moreapp) {
			System.out.println("Okay! What top are you wearing? ");
			this.top = scanner.nextLine();
			this.top = scanner.nextLine();
			System.out.println("What color is the top? ");
			this.topcolor = scanner.nextLine();
			System.out.println("What symbol does your top have? ");
			this.topsymbol = scanner.nextLine();
			System.out.println("What bottom are you wearing? ");
			this.bottom = scanner.nextLine();
			System.out.println("What color are your " + this.bottom + "?");
			this.bottomcolor = scanner.nextLine();
			System.out.println("What shoes are you wearing? ");
			this.shoes = scanner.nextLine();
			System.out.println("What color are they?");
			this.shoecolor = scanner.nextLine();
		}
		System.out.println("You are wearing a " + this.topcolor + " " + this.top + " with a " + this.topsymbol + " on it. You are also wearing " + this.bottomcolor + " " + this.bottom + " with " + this.shoecolor + " " + this.shoes + ".");
		System.out.println("Congratulations! The 'Fun' Customization is over.");
		
		
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
		this.str = VarSet("STRENGTH: ", a, b, c, d, e, f,g);
		this.dex = VarSet("DEXTERITY:  ", a, b, c, d, e, f,g);
		this.con = VarSet("CONSTITUTION: ", a, b, c, d, e, f,g);
		this.intel = VarSet("INTELLEGENCE: ", a, b, c, d, e, f,g);
		this.wis = VarSet("WIDSOM: ",a,b,c,d,e,f,g);
		this.cha = VarSet("CHARISMA: ", a, b, c, d, e, f,g);
		System.out.println("Congrats! Here is your character sheet.");
		CharSheet();
		
	}
public static void main(String args[]){
}
	private static int VarSet(String prompt, int a ,int b, int c, int d, int e, int f,int g) {
		@SuppressWarnings("resource")
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
		
	public void CharSheet() {
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
	private void Hp() {
		hp += GameMechanics.DiceRoll(1,10);
	}
}
