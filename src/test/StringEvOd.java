package test;

import java.util.Scanner;

public class StringEvOd {

	public static void main(String[] args) {
	int i;
	String even = "", odd = "";
	Scanner scan = new Scanner(System.in);
	int t = scan.nextInt();
	
	
	
	for (int k = 0; k<t; k++ ) {
		String s = scan.next();
	for (i=0; i< s.length(); i++){
		if(i%2==0) {
			even+= s.charAt(i);		
		}
		else {
			odd+= s.charAt(i);
		}
	
	}
	}
	scan.close();
	System.out.println(even + " " +odd);
	
}
}