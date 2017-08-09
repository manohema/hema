package com.vaadin.data;

import java.util.Scanner;

public class HSet11 {
public static void main(String[] args) {
	int m=0;
	Scanner in=new Scanner(System.in);
	m=in.nextInt();
	int n=(int) Math.log10(m);
	int sum=0;
	for(int i=1;i<=n+1;i++){
		int k=m%10;
		m=m/10;
		sum+=k*i;
	}
	System.out.println(sum);
}
}
