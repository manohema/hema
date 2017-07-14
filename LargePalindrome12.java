import java.util.*;
public class LargePalindrome12 {

	public static void main(String[] args) {
		{
System.out.println("enter the String:");
                      Scanner sc=new Scanner(System.in);
 	String s=sc.nextLine();
         String b="",c="",d="",e=" ";
	for(int i=0;i<=s.length()-2;i++)
	{
	for(int k=s.length();k>i;k--){
	b=s.substring(i,k);
	c=new StringBuffer(b).reverse().toString();
	if(b.equals(c))
		{
		d=b;
		if(d.length()>e.length())
		{System.out.println("Output:"+e);
		e=d;}
		}
                }
               }
		System.out.println("output:"+e);
		}
		}

	}


