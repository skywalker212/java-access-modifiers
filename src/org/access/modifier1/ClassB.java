package org.access.modifier1;

public class ClassB {
	//private variable, visible only to this class
	private int age = 18;
	
	//public variable, visible to all the classes inside package org.access.modifier1
	public String name = "Akash";
	
	//protected variable, visible to all the classes inside package org.access.modifier1 and all the sub-classes in other packages
	protected String[] hobbies = {"Web Dev","Photography"};
	
	//getter to get private variable age
	public int getAge() {
		return age;
	}

}
