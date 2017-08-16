package xbx;

import java.util.Scanner;

public class Player12 {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	int n=0,m=1;
	n=in.nextInt();
	for(int i=1;i<=n;i++){
		 m*=i;
	}
	System.out.println(m);
}
}
