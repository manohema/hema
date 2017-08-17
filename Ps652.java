package com.vaadin.data;

import java.util.Scanner;

public class Ps652 {
public static void main(String[] args) {
	int [][] a=new int[4][2];
	Scanner in=new Scanner(System.in);
	for(int i=0;i<4;i++){
		for(int j=0;j<2;j++){
			a[i][j]=in.nextInt();	
		}
	}
	for(int i=0;i<4;i++){
		for(int j=0;j<2;j++){
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	int dif1=a[0][1]-a[1][1];
	int dif2=a[1][0]-a[2][0];
	int dif3=a[2][1]-a[3][1];
	dif1=Math.abs(dif1);
	dif2=Math.abs(dif2);
	dif3=Math.abs(dif3);
	if(dif1==dif2&&dif1==dif3){
		System.out.println("Square");
	}
	else{
		System.out.println("not a square");
	}
}

}
