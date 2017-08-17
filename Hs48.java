package com.vaadin.data;

import java.util.Scanner;

public class Hs48 {
public static void main(String[] args) {
	String s1="";
	String s2="";
	Scanner in=new Scanner(System.in);
	s1=in.next();
	s2=in.next();
	if(s1.length()>s2.length()){
		if(s1.contains(s2)){
			System.out.println(s1.indexOf(s2));
		}
	}
	if(s1.length()<s2.length()){
		if(s2.contains(s1)){
			System.out.println(s2.indexOf(s1));
		}
	}
}
}
