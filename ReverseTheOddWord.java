package xbx;

import java.util.Scanner;

public class ReverseTheOddWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String[] arr=str.split(" ");
		int m=arr.length;
	String str1 = "";
		for(int i=1;i<m+1;i=i+2){
		 arr[i]=new StringBuffer(arr[i]).reverse().toString();
		}
		for(int i=0;i<m;i++){
		System.out.print(arr[i]+" ");
	}
	}
}
