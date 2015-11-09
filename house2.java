import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.97.4544&rep=rep1&type=pdf !!!!
public class housee {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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
		
		housey.get(housey.size()-1);
		

	}

}
