package org.access.modifier1;

public class ClassA {

	public static void main(String[] args) {

		System.out.println("This is class A");
		
		ClassB b = new ClassB();
		
		System.out.println("Age: " +b.getAge() +"\n\nHobbies:");
		
		for(String s: b.hobbies) System.out.println(s);
	}

}
