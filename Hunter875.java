package xbx;

import java.util.Scanner;

public class Hunter875 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt(); //no of elements of an array
	int array[]=new int[n];
	int i=0;
	boolean flag=true;
	for(i=0;i<n;i++){
		array[i]=in.nextInt();
	}
	for(i=0;i<n;i++){
		if(n-1==i){
			array[n-1]=-1;
			flag=false;				
		}
	if(flag){
		 if(array[i+1]<array[i]){
			array[i]=array[i+1];
		 }
		 else{
			array[i]=-1;
		 }			
		}
		System.out.print(array[i]+" ");
	}
}


}
