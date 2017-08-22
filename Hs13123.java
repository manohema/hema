package com.vaadin.data;

import java.util.Scanner;

public class Hs13123 {
public static void main(String[] args) {
	String s="";
	Scanner in=new Scanner(System.in);
	s=in.next();
	int c=0;
	char[] ci=s.toCharArray();
	for(int i=0;i<ci.length;i++){
		c=0;
		for(int j=0;j<ci.length;j++){
			if(ci[i]==ci[j]){
				c++;
			}
		}
		if(c>1){
			continue;
		}
		else{
			System.out.print(ci[i]);
		}
	}
}
}
