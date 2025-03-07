import util.MyConsole;

public class MakeChocolateApp {

	public static void main(String[] args) {
		MyConsole.printLine("Welcome to the make chocolate app");
			System.out.println(makeChocolate(4,1,9));
			System.out.println(makeChocolate(4,1,10));
			System.out.println(makeChocolate(4,1,7));
			
	}
	private static int makeChocolate(int small, int big, int goal) {
		int tracker = 0;
		tracker = goal - (big*5);
		if (small>tracker) 
			return small-tracker;
		else if(small == tracker) return small;
		 else {return -1;}
	}
}
