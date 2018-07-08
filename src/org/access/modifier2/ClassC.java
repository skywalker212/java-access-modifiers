package org.access.modifier2;

//import the modifier1 package in which our ClassB resides
import org.access.modifier1.*;

public class ClassC {

	public static void main(String[] args) {
		
		System.out.println("This is class C");
		
		//make a new object of ClassB
		ClassB b = new ClassB();
		
		//this will be visible since the method is public
		System.out.println("Age: " +b.getAge());
		
		//this won't be visible since hobbies is declared protected and we are accessing it in a different package
		//System.out.println(b.hobbies.toString());
		
		ClassD d = new ClassD();
		
		//we will be able to access hobbies now;
		System.out.println("\nHobbies: ");
		String hobbies[] = d.getHobbies();
		for(String s: hobbies)System.out.println(s);
		
	}

}
