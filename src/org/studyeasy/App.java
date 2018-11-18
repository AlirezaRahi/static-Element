	package org.studyeasy;

import org.studyeasy.testrun.TestStatic;

public class App {

	public static void main(String[] args) {
		
		//TestStatic obj1=new TestStatic(); dar halate static instant nmigirim
		System.out.println("Current variable value: "+TestStatic.getStaticVariable());
		TestStatic.setStaticVariable(1);
		System.out.println("Current variable value: "+TestStatic.getStaticVariable());
		TestStatic.setStaticVariable(24);
		System.out.println("Current variable value: "+TestStatic.getStaticVariable());

		

	}

}
