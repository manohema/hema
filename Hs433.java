package com.vaadin.data;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hs433 {
	public static void main(String[] args) {
		 int input=123;
	       int rem=0;
	       int[] a=new int[3];
	       String[] output1=new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	       String output[]=new String[3];
	       int i=0;
	       while(input!=0){
	    	  rem=input%10;
	    	  input=input/10;
	    	  if(rem==1){
	    		  output[i]="";
	    		  a[i]=rem;
	    		  i++;
	    	  }
	    	  else{
	    	  output[i]=output1[rem-2];
	    	  a[i]=rem;
	    	  i++;
	    	  }
	       } 
	     char[] a1=output[0].toCharArray();
	     char[] a2=output[1].toCharArray();
	     char[] a3=output[2].toCharArray();
	for(int i1=0;i1<a1.length;i1++){
		for(int i2=0;i2<a2.length;i2++){
			for(int i3=0;i3<a3.length;i3++){
			System.out.println(a1[i1]+""+a2[i2]+a3[i3]);
			}		
		}	
	}	
	}
}






