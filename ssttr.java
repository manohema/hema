package hhhh;

import java.util.Scanner;

public class ssttr {
public static void main(String[] args){
	String name;
	//String nam;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the name");
	name=in.nextLine();
	int h=name.indexOf(" ");	
	System.out.println(name.substring(h+1,name.length())+" "+name.substring(0,h+1));
	in.close();
}
}
