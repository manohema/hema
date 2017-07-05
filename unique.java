package hhhh;

import java.util.Scanner;

public class unique {
public static void main(String[] args){
	System.out.println("enter array length");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[]arr=new int[n];
	int [] c=new int[10];
	System.out.println("enter the values");
	for(int i=0;i<n;i++)
	{		
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++){
		int m=arr[i];
		//System.out.println(m);
		switch(m){
		case 1:{
			c[1]++;
			break;
		}
		case 2:{
			c[2]++;
			break;
		}
		case 3:{
			c[3]++;
			break;
		}
		case 4:{
			c[4]++;
			break;
		}
		case 5:{
			c[5]++;
			break;
		}
		case 6:{
			c[6]++;
			break;
		}
		case 7:{
			c[7]++;
			break;
		}
		case 8:{
			c[8]++;
			break;
		}
		case 9:{
			c[9]++;
			break;
		}
		}
			
	}
	for(int i=0;i<=9;i++){
		if(c[i]==1){
			System.out.println("unique is " +i);
		}
	}
}
}
