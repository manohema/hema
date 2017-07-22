package xbx;

public class Coprime {
public static void main(String[] args) {
	int FirstNumber=44;
	int SecondNumber=403;
	int[] count=new int[15];
	int[] count1=new int[15];
	
	int c=0;
	int d=0;
	boolean flag=false;
	for(int i=1;i<=FirstNumber;i++){
		if(FirstNumber%i==0){
			count[c]=i;
			c++;	
		}
		if(SecondNumber%i==0){
			count1[d]=i;
			d++;
		}
	}
	int e=0;
	int[] count2=new int[c];
	for(int i=0;i<c;i++){
		for(int j=0;j<d;j++){
			if(count[i]==count1[j]){
			e++;
			}
		}
	}
	if(e==1){
		System.out.println("Coprime");
	}
	else{
		System.out.println("not a co prime");
	}
}
}
