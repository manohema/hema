package xbx;

import java.util.Arrays;
import java.util.Scanner;

public class AlternateSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		Scanner in =new Scanner(System.in);
		System.out.println("enter the number of elements to be entered");
		n=in.nextInt();
		int t=n;
		int[] array=new int[n];
		int[] array1=new int[n];
		for(int i=0;i<n;i++){
			array[i]=in.nextInt();
		}
		Arrays.sort(array);
		int m=0;
		for(int i=0;i<n;i++){
			if(i%2==0){
				array1[i]=array[t-1];
				t--;
			}
			
			 if(i%2!=0){
				array1[i]=array[m];
				m++;
			}	
		}
		for(int i=0;i<n;i++){
			System.out.println(array1[i]);
		}
	}

}
