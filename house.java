import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class house {
  List<String> scematics = new ArrayList<String>();
  int housey;
  int housex;
  public house() {
	  @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	  	System.out.println("Please structure the first floor of your house!");
		  System.out.println("- is empty space \n + is furniture \n = is a wall \n @ is you \n # is an electronic \n % is a misc object");
  		System.out.println("Please do not exceed 100 characters per line.");
	  	System.out.print("How many lines would you like to have? ");
	  	while (!scanner.hasNextInt()) {
		  	scanner.nextLine();   // throw away offending token
		  	System.out.print("How many lines would you like to have? ");
  		}
	  	int housey = scanner.nextInt();
	  	for(int i = 1; i <= housey; i++){
		  	System.out.print("Line " + i + ": ");
		  	String ln = scanner.next();
		  	scematics.add(ln);
		  }
  }
}
