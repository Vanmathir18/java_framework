package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

class Test
{ 
public static void main(String[] args) {
	//8.	Java program to find the frequency of elements in an array
	String s="Apple";
	
	HashMap<Character, Integer> map=new HashMap<Character, Integer>();
	for(int i=0;i<s.length();i++)
	{
	map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
	}
	System.out.println(map);
	System.out.println("hi");
	System.out.println("hello");
	System.out.println("welcome");
	}}

	


