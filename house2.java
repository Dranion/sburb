import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class house2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("How long (y) would you like your house to be?");
		int yhouse = scanner.nextInt();
		String [] housey = new String[yhouse];
		System.out.print("How wide (x) would you like your house to be?");
		int xhouse = scanner.nextInt();
		String tempstr = "";
		
		for(int i = 1; i <= xhouse; i++){//GENERATES INDIVIDUAL LINES
			tempstr = tempstr + "-";
		}
		for(int i = 1; i<= yhouse; i++){//GENERATES EMPTY HOUSE! 
			housey[i-1] = tempstr;
		}
		printHouse(housey);
		
		//Generating Front Door! 
		int tempran = rand.nextInt(housey[housey.length-1].length()-1);
	    char[] templine = housey[housey.length-1].toCharArray();
	    templine[tempran] = '+';
	    
	    //Generating first side wall! 
	    housey[housey.length-1] =  String.valueOf(templine);
	    printHouse(housey);
	    String[] tempaddX =  addX(xhouse, tempran, templine, rand);
	    housey[housey.length-1] =  tempaddX[0];
	    printHouse(housey);
	    
		//Recording end of first wall vars 
	    int starty = housey.length -1;
		int startx =  Integer.parseInt(tempaddX[1]);
		System.out.println("("+ startx + ", " + starty + ")");
		//Generating first y wall!
		starty = addY(yhouse, starty, startx, housey, rand);
		tempaddX =  addX(xhouse, startx, housey[starty].toCharArray(), rand);
	    housey[housey.length-1] =  tempaddX[0];
		startx =  Integer.parseInt(tempaddX[1]);
		printHouse(housey);

	}
	public static void printHouse(String[] housey){
	    System.out.println("Printing house...");
		for(int i = 0; i < housey.length; i++){
	    	System.out.println(housey[i]);
	    }
	}
	
	
	public static String[] addX(int xhouse, int startx, char[] templine, Random rand){
		System.out.println("STARTING TEMPRAN: " + startx);
	    while(rand.nextInt(xhouse - startx) + 1 > 1){
	    	System.out.println(startx);
	    	templine[startx + 1] = '=';
	    	System.out.println(startx);
	    	startx++;
	    }
	    System.out.println("ENDING TEMPRAN: " + startx);
        String ret[] = new String[2];
        ret[0]= String.valueOf(templine);
        ret[1] =  "" + (startx+1);
        System.out.println(ret[1]);
        return ret; //returning two values at once
	}
	
	
	
	public static int addY(int yhouse, int starty, int startx, String[] housey, Random rand){
		int i = 0;
		System.out.println(starty - i);
		int tempran = rand.nextInt(yhouse /2 + i );
		while(tempran > 0 && starty - i > 0){
			i++;
			tempran--;
			char[] templine = housey[starty - i].toCharArray();
			templine[startx-1] = '=';
			housey[starty - i] =  String.valueOf(templine);
			System.out.println(tempran);
		}
	    return starty - 1;
	}

}
