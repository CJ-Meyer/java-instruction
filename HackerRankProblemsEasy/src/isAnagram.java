import java.util.Arrays;
import java.util.Scanner;

import util.MyConsole;

public class isAnagram {

	    static boolean isAnagram(String a, String b) {
	        String lowerPleaseA = a.toLowerCase();
	        String lowerPleaseB = b.toLowerCase();
	        
	        MyConsole.printLine(lowerPleaseA);
	        MyConsole.printLine(lowerPleaseB);
	        
	        char[] charArrayA = lowerPleaseA.toCharArray();
	        char[] charArrayB = lowerPleaseB.toCharArray();
	        
	        Arrays.sort(charArrayA);
	        Arrays.sort(charArrayB);
	        
	        return Arrays.equals(charArrayA, charArrayB);
	    }

	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
}


