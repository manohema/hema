package xbx;

import java.util.Scanner;

public class Player13 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=0;
		String m="";
		n=in.nextInt();
		while(n!=0){
			int k=n%10;
			n=n/10;
			m+=k;
		}
		
		System.out.println(m);
	}
	}


