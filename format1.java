package hhhh;

import java.util.Arrays;
import java.util.Scanner;

public class format1 {
	public static void main(String[] args) 
	{
		System.out.println("enter array length");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("enter the values");
		for(int i=0;i<n;i++)
		{		
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("sorted array is: ");
		for(int i=0;i<n;i++){
			System.out.println(+arr[i]);
			
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]==i)
			{
				System.out.println("the num "+arr[i]+"is equal to the index "+i);
			}
		}
	}

}
