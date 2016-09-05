package test;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.Scanner;
public class Hackerrank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i = 4;
double d = 4.0;
String s = "Hackerrank ";

	Scanner scan = new Scanner(System.in);
	int z;
	double f;
	
	System.out.println("Enter String: ");
	String t = scan.nextLine();
	System.out.println("Enter int: ");
	int k = scan.nextInt();
	System.out.println("Enter double: ");
	double e = scan.nextDouble();
	
	
	z = i+k;
	f = d+e;
	System.out.println(z);
	System.out.println(f);
	System.out.println(s+t);
	
	scan.close();
	
	}

}
