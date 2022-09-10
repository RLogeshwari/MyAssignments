package week1.day1;

public class Palindrome {
	public static void main(String[]args) {
		int num=34343,r;
		int temp=num;
		int check=0;
		while(num>0) {
			r=num%10;
			num=num/10;
			
		}
		if(check==temp) {
			System.out.println("given no is palindrome");
		}
		else {
		System.out.println("given no is not a palindrome");
		
		}
	}

}
