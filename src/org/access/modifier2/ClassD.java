package org.access.modifier2;

//import ClassB from package modifier1
import org.access.modifier1.ClassB;

//inherit from Class
public class ClassD extends ClassB {
	
	public String[] getHobbies() {
		//hobbies will be visible since the protected variables are visible for classes(ClassD) that inherit that class(ClassB) from outside the package
		return hobbies;
	}

}
