package week1.day1;

public class MissingElement {
	
	public static void main(String[]args) {
		int[]arr= {0,1,2,4,5,7,6,8};
		int missN;
		int n=8;
		int sumN=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		missN=sumN-sum;
		System.out.println(missN);
		
		}
	}


