import java.util.*;
public class Main
{
	public static void main(String[] args) {
		palindrome(12321);
	}
	public static void palindrome(int num){
	    if(num / 10 == 0 || num == 0){
	        System.out.println("The number is palindrome");
	        return;
	    }
	    int last = num%10;
	    int power = (int) Math.log10(num);
	    int first = (int) (num / Math.pow(10 , power));
	    if(first == last){
	        int nextnum =(int) (num - (first * Math.pow(10, power)))/10;
	        palindrome(nextnum);
	    }
	    else{
	        System.out.println("The number is not palindrome");
	        return;
	    }
	}
}
