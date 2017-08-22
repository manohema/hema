package com.vaadin.data;

import java.util.Arrays;
import java.util.Scanner;

public class Hs13128 {
public static void main(String[] args) {
	int n=0;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	int [] a=new int[n];
	int [] a1=new int[n];
	int [] a2=new int[n];
	for(int i=0;i<n;i++){
		a[i]=in.nextInt();
	}
	Arrays.sort(a);
	int k=0;
	for(int i=n-1;i>=0;i--){
		a1[i]=a[k];
		k++;
	}
	int k1=0,k2=0;
	for(int i=0;i<n;i++){
		if(i==0||i%2==0){
		a2[i]=a1[k1];
		k1++;
	}
		if(i>=0&&i%2!=0){
			a2[i]=a[k2];
			k2++;
		}
	}
	for(int i=0;i<n;i++){
		System.out.print(a2[i]);
		if(i!=n-1){
			System.out.print(",");
		}
	}
}

}
