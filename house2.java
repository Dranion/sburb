import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class housee {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		List<String> housey = new ArrayList<String>();
		
		System.out.print("How long (y) would you like your house to be?");
		int yhouse = scanner.nextInt();
		System.out.print("How wide (x) would you like your house to be?");
		int xhouse = scanner.nextInt();
		String tempstr = "";
		
		for(int i = 1; i <= xhouse; i++){//GENERATES INDIVIDUAL LINES
			tempstr = tempstr + "-";
		}
		for(int i = 1; i<= yhouse; i++){//GENERATES EMPTY HOUSE! 
			housey.add(tempstr);
		}
		printHouse(housey);
		
		//Generating Front Door! 
		int tempran = rand.nextInt(housey.get(housey.size()-1).length()-1);
	    char[] templine = housey.get(housey.size()-1).toCharArray();
	    templine[tempran] = '+';
	    
	    //Generating first side wall! 
	    housey.set(housey.size()-1, String.valueOf(templine));
	    printHouse(housey);
	    String[] tempaddX =  addX(xhouse, tempran, templine, rand);
	    housey.set(housey.size()-1, tempaddX[0]);
	    printHouse(housey);
	    
		//Recording end of first wall vars 
	    int starty = housey.size() -1;
		int startx =  Integer.parseInt(tempaddX[1]);
		System.out.println("("+ startx + ", " + starty + ")");
		//Generating first y wall!
		int i = 1;
		System.out.println(starty - i);
		tempran = rand.nextInt(24) - i;
		while(tempran < yhouse && starty - i > 0){
			templine = housey.get(starty - i).toCharArray();
			templine[startx-1] = '=';
			housey.set(starty - i, String.valueOf(templine));
			i++;
			tempran--;
			System.out.println(tempran);
			
		}
		printHouse(housey);

	}
	public static void printHouse(List<String> housey){
	    System.out.println("Printing house...");
		for(int i = 0; i < housey.size(); i++){
	    	System.out.println(housey.get(i));
	    }
	}
	
	
	public static String[] addX(int xhouse, int tempran, char[] templine, Random rand){
		System.out.println("STARTING TEMPRAN: " + tempran);
	    while(rand.nextInt(xhouse - tempran) + 1 > 1){
	    	System.out.println(tempran);
	    	templine[tempran + 1] = '=';
	    	System.out.println(tempran);
	    	tempran++;
	    }
	    System.out.println("ENDING TEMPRAN: " + tempran);
        String ret[] = new String[2];
        ret[0]= String.valueOf(templine);
        ret[1] =  "" + (tempran+1);
        System.out.println(ret[1]);
        return ret; //returning two values at once
	}
	
	
	public static List<String> addY(int yhouse, int starty, int startx, List<String> housey, Random rand){
	    for(int i = rand.nextInt(yhouse - starty) + starty; i < yhouse-1; i++){
		    char[] templine = housey.get(i).toCharArray();
		    templine[startx] = '=';
		    housey.set(i, String.valueOf(templine));
	    }
	    return housey;
	}

}
