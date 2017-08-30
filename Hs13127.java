package com.vaadin.data;

import java.util.Scanner;

public class Hs13127 {
public static void main(String[] args) {
	int n=0,sum=0;
	Scanner in= new Scanner (System.in);
	n=in.nextInt();
	for(int i=3;i<n;i+=10){
		sum+=i;
	}
	System.out.println(sum);
}
}
