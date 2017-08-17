package com.vaadin.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Hs543 {
	public static void main(String[] args)throws IOException {
	try{
		Scanner in=new Scanner(System.in);
	
	String s="";
	s=in.nextLine();
	String[] a=s.split("[a-z]");
	ArrayList<Integer> l=new ArrayList();
	ArrayList<String> l1=new ArrayList();
	String[] b=s.split("[0-9]");
	for(String s1:a){
		try{
		int m=Integer.valueOf(s1);
		l.add(m);}
		catch(NumberFormatException e){}
			}
	for(String s2:b){
		if(!s2.isEmpty()){
			l1.add(s2); 
		}
	}
	for(int i=0;i<l1.size();i++){
		int m=l.get(i);
		//System.out.println(m);
		for(int j=0;j<m;j++){
			System.out.print(l1.get(i));
		}
	}
	}
	catch(Exception e){
		
	}
	
	
	
	
	
	
	}
}