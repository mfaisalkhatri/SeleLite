package test;
import java. util.*;
import java.io.*;
public class Person {
	
	private int age;
	public Person (int initialage) {
		age = initialage;
		if (age <0) {
			age = 0;
			System.out.println("Age is not Valid, Setting age to 0.");
		}
	}
	public void amIOld () {
		if (age<13) {
			System.out.println("You are young.");	
		}
		else if (age >=13 && age <18) {
			System.out.println("You are teenager.");
		}
		else {
			System.out.println("You are old.");
		}
	
	}
	public void yearPasses() {
		age++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int T = scan.nextInt();
		for (int i = 0; i<T; i++) {
			int age = scan.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for ( int j = 0; j <3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		scan.close();
	}

}
