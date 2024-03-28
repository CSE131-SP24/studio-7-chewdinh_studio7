package studio7;

public class Die {
	private int n; // instance variable 
	
	private Die(int sides) { // constructor 
		n = sides; 
	}
	private int rollDie() { // actual method -- no parameters??
		int result = (int)(Math.random() * n + 1); 
		return result; 
	}
	
	public static void main(String[] args) {
		Die die1 = new Die(5);
		System.out.println(die1.rollDie()); 

	}

}
