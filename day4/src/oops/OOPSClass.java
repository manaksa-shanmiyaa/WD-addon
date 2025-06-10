package oops;

import java.util.Date;
import java.util.Scanner;

public class OOPSClass {
public static void main(String[] args) {
	
//	AbstractInterface  ai = new AbstractInterface() {
//		 public void buyDress() {
//			 }
	EncapsulationClass user = new EncapsulationClass();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your name: ");
	System.out.println(user.getUsername());
	System.out.println("enter your DOB");
	Date dob = new Date ();
	user.setAge(dob);
	System.out.println("enter your mobile no:");
	
	System.out.println(user.getMobile());
	System.out.println("enter your age:");
	System.out.println(user.getAge());
	user.setEmail(sc.next().toLowerCase());
	user.setUsername(sc.next());
	
	
	
	
	
	System.out.println(user.getEmail());
	System.out.println(user.getAge());
	System.out.println(user.getMobile());
	
	
	
}
}

