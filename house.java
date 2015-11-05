import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class house {
  List<String> line = new ArrayList<String>();
  List<List<String>> scematics = new ArrayList<List<String>>();
  int housey;
  int housex;
  public house() {
	  Scanner scanner = new Scanner(System.in);
	  Random random = new Random();
	  
	  System.out.println("How long (y) would you like your house to be? ");
	  housey = GameMechanics.CheckInt(scanner, "Please enter a number: ");
	  System.out.println("How wide (x) would you like your house to be? ");
	  housex = GameMechanics.CheckInt(scanner, "Please enter a number: ");
	  for(int i = 1; i <= housey; i++){
		  for(int j = 1; j <= housex; j++){
			  
		  }
	  }
	 
  }
}


/*
@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	  	System.out.println("Please structure the first floor of your house!");
		  System.out.println("- is empty space \n + is furniture \n = is a wall \n @ is you \n # is an electronic \n % is a misc object");
 		System.out.println("Please do not exceed 100 characters per line.");
 		System.out.println("If you want to stop adding lines, type / instead of adding a line");
 		int i = 0;
 		String ln = "";
	  	do{
	  		i++;
		  	System.out.print("Line " + i + ": ");
		  	ln = scanner.next();
		  	scematics.add(ln);
		  }while(!(ln.equals("/")));*/
