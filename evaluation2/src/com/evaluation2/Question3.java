package com.evaluation2;

public class Question3 {
	int roll = 101;
	String name = "Chakri";
	Question3(int roll, String name){
		this.roll = roll;
		this.name = name;
	}
	public String toString() {
		return roll+" "+name;
	}
	public static void main(String[] args) {
		System.out.println("String:");
		System.out.println("________");
		System.out.println("String is a sequence of characters. In java strings are objects. Java platfrom provides string class to create and manipulate strings.");
		System.out.println("Example of String:");
		System.out.println("String s = 'Chakri'");
		String s = "Chakri";
		System.out.println(s);
		System.out.println();
		System.out.println("StringBuffer:");
		System.out.println("_____________");
		System.out.println("String buffer class is used to create mutable string objects. It is same as String class. String Buffer can be changed");
		System.out.println();
		System.out.println("StringBuilder:");
		System.out.println("_______________");
		System.out.println("In java stringBuffer is a class used to create a mutuable or modifiable succession of characters. Like StringBuffer StringBuilder class is an alternative to the java Strings class as the provides an immutable succession of characters.");
		System.out.println();
		System.out.println("toString():");
		System.out.println("_____________");
		System.out.println("A toString() is an inbuilt method in java that returns the value given to it in string format.");
		
		Question3 s1 = new Question3(102, "Chakravarthi");
		System.out.println(s1);
		
	}
}
