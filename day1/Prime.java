package week1.day1;

public class Prime {
	public static void main(String[] args) {
		int num=10;
		boolean flag=false;
		for (int i = 2; i <=num/2; i++) {
			
			if(num%i==0) {
				flag=true;
				break;
			}
		}
			if(flag!=true)
			{
				System.out.println("It is a prime number");
			}
			else
			{
				System.out.println("It is not a prime number");
			}

}
}
