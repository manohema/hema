package com.vaadin.data;

import java.util.Scanner;

public class Hs13121 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		 char[] a=new char[n];
	      char[] b=new char[n];
	      int k=97,n1=n/2+1,h1=n-(n/2+1),n2=n/2+1,n3=n/2,h=b.length;
	     for(int i=0;i<(n1);i++){
	    	 a[n3]=(char)k;
	    	 n3--;
	    	 k++;
	     }
	     int m=98;
	     for(int i=0;i<h1;i++){
	    	 a[n2]=(char)m;
	    	 n2++;
	    	 m++;
	     } 
	     for(int i=0;i<b.length;i++){
	    	System.out.print(a[i]+" ");
	     }
	System.out.println();
		for(int i=0;i<n/2;i++){
			for(int i1=0;i1<n;i1++){
				if(n/2+i>=i1&&n/2-i<=i1){
					System.out.print(" "+" ");
				}else{
					System.out.print(a[i1]+" ");
				}
			}System.out.println(" "+" ");
		}
		for(int i=n/2-1;i>0;i--){
			for(int i1=0;i1<n;i1++){
				if(n/2-i+1<=i1&&n/2+i-1>=i1){
					System.out.print(" "+" ");
				}else{
					System.out.print(a[i1]+" ");
				}
			}System.out.println(" "+" ");
    }for(int i=0;i<b.length;i++){
    	System.out.print(a[i]+" ");
     }
	}
}
