package xbx;

import java.util.Scanner;

public class DiffrentPyramid {
public static void main(String[] args) {
	// your code goes here
	int Rows=0;
	Scanner in=new Scanner(System.in);
	Rows=in.nextInt();
		for(int i=Rows;i>0;i--){
			for(int k=0;k<2;k++){
			for(int j=i;j>0;j--){
				System.out.print("*");
			
			}
		System.out.print(" ");
		}
		
			System.out.println();
		}
}
}
