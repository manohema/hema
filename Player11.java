package xbx;

import java.util.Scanner;

public class Player11 {
public static void main(String[] args) {
	String a="";
	Scanner in= new Scanner(System.in);
	a=in.nextLine();
	StringBuffer s=new StringBuffer(a);
	String h=s.reverse().toString();
	System.out.println(h);
}
}
