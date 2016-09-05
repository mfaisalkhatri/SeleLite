package test;

import java.util.Arrays;
import java.util.Scanner;
public class Arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int res = A.length() + B.length();
        System.out.println(res);
        String output = A.substring(0,1).toUpperCase()+A.substring(1);
        String outputt = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.print(output+" "+ outputt);
        System.out.println();
        int i = A.compareTo(B);
        if (i<0) {
        	
        System.out.println(A+" "+B);	
        }
        else {
        	System.out.println(B +" "+A);
        }    
	}
	}
