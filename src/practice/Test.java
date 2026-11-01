package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

class Test
{ 
public static void main(String[] args) {
	//8.Remove duplicate element from string
//	String s="Programming";
//	Set<Character> set=new LinkedHashSet<Character>();
//	for(int i=0;i<s.length();i++)
//	{
//		set.add(s.charAt(i));
//	}
//	System.out.println(set);
//ghgvhgbhj
	//occurence of an character
	String s="Programming";
	HashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
	for(int i=0;i<s.length();i++)
	{
		map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
	System.out.println(map);
	System.out.println("Hi");
	System.out.println("hello");
	System.out.println("world");
	System.out.println("world");
	System.out.println("Push and pull for git");
	System.out.println("world");
}}
	


	


