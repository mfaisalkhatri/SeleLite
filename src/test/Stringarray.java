package test;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
String s = scan.next();
for (int i=0; i<= t; i++ )
{
	if(i%2==0){
	char a = s.charAt(i);
	System.out.println(a);
	}
}

	}

}
