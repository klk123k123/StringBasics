package com.practise.GitDemo.StringBasic;

public class Basicmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declaring and intializing using string literal
		String s1="Hello";
		//declaring and intilizing using new keyword
		String s2="World";
		//concreting
		System.out.println(s1+" "+s2);
		//length
		System.out.println("length = "+(s1.length()+s2.length()));//10
		System.out.println("length = "+s1.length()+s2.length());//55
		//substring -- give the some part and 1st index is mandatory and lastindex is mandatory
		System.out.println(s1.substring(1, 3));
		//charAt : taking index of value and will get that characher
		System.out.println(s1.charAt(1));
	}

}
