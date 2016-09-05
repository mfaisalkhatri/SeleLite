package test;
import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String: ");
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
			
//		char ch[] = s.toCharArray();
//		for(char c: ch){
//			if(Character.isUpperCase(c)) {
//				System.out.println(c);
//				
//				System.out.println(i);
//				break;
//			}
//		}
		int count = 1;
		for(int i = 1; i<=s.length();i++) {
		char ch = s.charAt(i);
		if(Character.isUpperCase(ch))  { 
		System.out.println(ch);
			count = count + i;
		 System.out.println(count);		
		}
		else {
			System.out.println(count);
		}
		
		}
	sc.close();
	
	}	


}
