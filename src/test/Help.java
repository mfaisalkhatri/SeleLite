package test;
import java.io.*;
import java.util.Scanner;

public class Help {
void helpon (int what) {
	switch (what) {
	case 1:
		System.out.println("The if condition : \n");
		System.out.println("(condition) {");
		System.out.println("The Statement..}");
		System.out.println("Else Statement ");
		break;
		
	case 2:
		System.out.println("The Sitch Statement\n");
		System.out.println("Switch (expression)");
		System.out.println("Case constant:");
		System.out.println("statement sequence");
		System.out.println("break;");
}
}
void showmenu() {
	System.out.println("Help on:\n");
	System.out.println("1 : if");
	System.out.println("2: switch");
	System.out.println("Choose one:");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Throws java.io.IOException;
		Help helpobj = new Help();
		helpobj.showmenu();
		int choice;
		Scanner sc = new Scanner (System.in);
		choice = sc.nextInt();
			
		if (choice == 1) {
			helpobj.helpon(1);
		}
		else if (choice == 2) {
			helpobj.helpon(2);
		}
		else 
		System.out.println("This is not a valid number");	
		
		
		
	}

}
