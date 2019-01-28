package com.teamsankya.duplicatestring;

import java.util.HashSet;
import java.util.List;

public class Demo {
	private int a=3;
	private double b=9.9;
	
	
	public Demo(int a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public int hashCode() {
		
		return a;
	}
	@Override
	public boolean equals(Object obj) {
		
		return this.a == a;
		
	}

	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + "]";
	}


	public static void main(String[] args) {
		
		Demo d=new Demo(5, 5.5);
		Demo d2=new Demo(6, 5.5);
		
		HashSet<Demo> s=new HashSet<Demo>();
		s.add(d);
		s.add(d2);
		System.err.println(s);
		System.err.println(s.size());
		
	}

}
