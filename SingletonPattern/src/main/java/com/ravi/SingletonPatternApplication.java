package com.ravi;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ravi.model.Laptop;
import com.sun.org.apache.regexp.internal.recompile;

/*@SpringBootApplication
public class SingletonPatternApplication {

	public static void main(String[] args) {
		 checking whether returning single object or not
		
		Laptop l1 = Laptop.getInstance();
		Laptop l2 = Laptop.getInstance();
		
		if (l1.equals(l2)) {
			System.out.println("Same object is referenced by both reference variables l1 and l2");
		}
		else {
			System.out.println("Different object is referenced");
		}
	}
*/

/*public class SingletonPatternApplication{
	static final String sample ="simple";
	String output = sample+"sample";
	
	void a() {
		if("simplesample"==output) {
			System.out.println("sample==output");
		}
		else {
			System.out.println("sample!=output");
		}
	}
	
	public static void main(String[] s) {
		SingletonPatternApplication a = new SingletonPatternApplication();
		a.a();
	}*/

/*public class SingletonPatternApplication{
	public static void main(String[] args) {
		SingletonPatternApplication tc =new SingletonPatternApplication();
		tc.display(5);
	}
	public void display(Integer i) {
		System.out.println("Inside Integer");
	}
	public void display (long i) {
		System.out.println("insde long");
	}*/

public class SingletonPatternApplication{
	
	private String display(String t) {
		return "Hi "+t;
	}
	public static void main(String[] args) {
		SingletonPatternApplication sc = new SingletonPatternApplicationChild();
		System.out.println(sc.display("priya"));
	}
} 	class SingletonPatternApplicationChild extends SingletonPatternApplication{
	public String display(String t) {
		return "Hello "+t;
	} 
}
