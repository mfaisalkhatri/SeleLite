package test;
import java.util.*;

public class Camelcase2 {

		    public static void main(String[] args) {
		    	System.out.println("Enter String: ");
		        Scanner scan = new Scanner(System.in);
		        String s = scan.next();
		        scan.close();
		        
		        String[] words = s.split("[A-Z]");
		         System.out.println(words.length);
	}

}
