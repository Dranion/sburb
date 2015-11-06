import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class house {
  String line = "";
  List<String> scematics = new ArrayList<String>();
  int housey;
  int housex;
  public house() {
	  Scanner scanner = new Scanner(System.in);
	  Random random = new Random();
	  
	  System.out.println("How long (y) would you like your house to be? ");
	  housey = GameMechanics.CheckInt(scanner, "Please enter a number: ");
	  System.out.println("How wide (x) would you like your house to be? ");
	  housex = GameMechanics.CheckInt(scanner, "Please enter a number: ");
	  String tempstring = "";
	  for(int i = 1; i <= housex; i++){
		  tempstring += "=";
	  }
	  scematics.add(tempstring);
	  for(int i = 1; i <= housey-2; i++){
		  line = "=";
		  for(int j = 1; j <= housex-2; j++){
			  int x = random.nextInt(housex);
			  int y = random.nextInt(housey);
			  //did you mean: i am crying
			  //im too lazy to design my own house..... death cometh....
		}
		line += "=";
		scematics.add(line);
		System.out.println("\n\n\n\n\nPRINTING IN PROGRESS HOUSE...");
		System.out.println(scematics);
	      for(int j = 0; j < scematics.size(); j++) {
	          System.out.println(scematics.get(j));
	      }

	  }
	  scematics.add(tempstring);
	  System.out.println("\n\n\n\n -----------------\n  PRINTING ENTIRE HOUSE");
      for(int i = 0; i < scematics.size(); i++) {
          System.out.println(scematics.get(i));
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



/*int temp = random.nextInt(50);
			  if(temp == 1 || temp == 2 || temp == 4){
				  line += "+";
			  }
			  else if(temp == 7){
				  line += "%";
			  }
			  else if(temp == 8){
				  line += "#";
			  }
			  else{
				  if(temp <= 35) {
					  //(line.charAt(line.length()-1) == '=' || scematics.get(i-1).charAt(line.length()-1) == '=') && 
					  if(line.charAt(line.length() -1) == '=' || scematics.get(i-1).charAt(line.length()-1)== '='){
						  boolean isConnect = false;
						  for(int a = 1; line.length() - a >= 0; a++){
							  isConnect = (line.charAt(line.length() - a) == '=' || scematics.get(i-1).charAt(line.length() -a) == '=') && !(line.charAt(line.length() - a) == '=' && scematics.get(i-1).charAt(line.length() -a) == '=');
						  }
						  if(isConnect){
							  line += "=";
						  }
						  else {
							  line += "-";
						  }
					  }
					  else {
						  line += "-"; 
					  }

				  }
				  else {
					  line += "-";
				  }
			  }
			  System.out.println("PRINTING LINE...");
			  System.out.println(line);*/
