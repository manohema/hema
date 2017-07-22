package xbx;

public class ReverseTheWord {
public static void main(String[] args) {
	String word="hai print the word";
	String[] reverse=word.split(" ");
	for(int i=reverse.length-1;i>=0;--i){
	System.out.print(reverse[i]+" ");
	}
}
}
