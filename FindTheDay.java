package xbx;

import java.util.Scanner;

public class FindTheDay {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	System.out.println("print the day");
	String Day=in.nextLine();
	Day=Day.toLowerCase();
	switch(Day){
	case "monday":
	case "mon":{
		System.out.println("true");
		break;
	}
	case "tuesday":
	case "tues":{
		System.out.println("true");
		break;
	}
	case "wednesday":
	case "wed":{
		System.out.println("true");
		break;
	}
	case "thursday":
	case "thurs":{
		System.out.println("true");
		break;
	}
	case "friday":
	case "fri":{
		System.out.println("true");
		break;
	}
	case "saturday":
	case "sat":{
		System.out.println("true");
		break;
	}
	case "sunday":
	case "sun":{
		System.out.println("false");
		break;
	}
	default:
		System.out.println("it is not a day.print the day");
		break;
	
	}
}
}
