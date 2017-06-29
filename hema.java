package xbx;

import java.util.Scanner;

public class hema {
	 public static void main(String[] args)
	  {
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int m=1;
	    for(int i=0;i<2*num;i++)
	    {
	    for(int j=m;j<2*num;j++)
	    {
	      if(i==j)
	        continue;
	      else
	      {
	    		 System.out.println(i+""+j);	
	    	}
	    }
	    m+=1;
	    }
	  sc.close(); 
	  }
	}

