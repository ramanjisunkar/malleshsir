package com.teamsankya.duplicatestring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;
public class DuplicateChar {
	
public static void main(String[] args) {

	
	System.out.println("hi this ram... how are you mehaboob");
	System.out.println("hi mehaboob...");
	System.out.println("hi ramanji....");
	char carr[]= {'k','a','r','n','a','t','a','k','a'};
	System.out.println("fghjkcvbnm fafjap fapjfappj teamsankya IT consulting software company..");
	System.out.println("program to print duplicate character in string");
	System.out.print("original stirng=");
	for (char c : carr) {
		
		System.out.print(c);
	}
	 int count=0;
	Map<Character,Integer> h=new HashMap<Character,Integer>();
	Map<Character,Integer> hh=new HashMap<Character,Integer>();
	for(int i=0;i<carr.length;i++) {
		
		
		
		if(h.containsKey(carr[i]))
		{
			
			hh.put(carr[i],count);
			count++;
			}
		h.put(carr[i],count);
		
		count++;
		
}
	System.out.println("");
	System.out.print("duplicate charater=");
	
	for (char c :hh.keySet() ) {
		System.out.print(c);
	}
	System.out.println("");
	System.out.print("stored data in map is==");
	for (char c : h.keySet()) {
		
		System.out.print(c);
	}
	//System.out.println("");
	//System.out.print("duplicate character=");
	
	
	
	
}
}
