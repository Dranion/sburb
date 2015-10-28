import java.util.Random;

public class GameMechanics {
	Random rand = new Random(); 
	public static void main(String[] args) {

	}
	
	public static int DiceRoll(int min, int max) {
		return min + (int)(Math.random() * ((max - min) + 1));
		
	}
	public static int DiceRollNum(int min, int max,int num){
		int sum = 0;
		for(int i = 1; i <= num; i++){
			sum += DiceRoll(min,max);
		}
		return sum;
	}
}
