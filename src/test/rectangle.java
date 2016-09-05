package test;

import java.util.Scanner;

public class rectangle {
	public static void main(String a[]) throws Exception {
		
	int l,b;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the length: ");
    l=scan.nextInt();
    System.out.println("Enter the width:");
    b=scan.nextInt();
    int i,j;
         for (i=0; i<l; i++) {
        	 String s = "";
        	 for (j =0; j<b; j++) {
        		 if(j==0 || i==0 || (j == b -1) || (i == l-1)) {
        			 s+= "*";
        		 }
        		 else {
        			 s+= " ";
        		 }
        		
        	 }
        	 System.out.println(s);
         }
      

}
}