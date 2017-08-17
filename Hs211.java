package com.vaadin.data;

import java.util.Scanner;

public class Hs211 {
public static void main(String[] args) {
	String word="";
	Scanner in=new Scanner(System.in);
	word=in.nextLine();
	String[] reverse=word.split(" ");
	for(int i=reverse.length-1;i>=0;--i){
	System.out.print(reverse[i]+" ");
	}

}
}
