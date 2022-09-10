package week1.day1;

public class Intesection {

	public static void main(String[]args) {
		int[]n1= {1,2,3,4,7};
		int[]n2= {2,3,4,8,10};
		for(int i =0;i<n1.length;i++) {
			for(int j=0;j<n2.length;j++) {
				if(n1[i]==n2[j])  {
					System.out.println(n1[i]);
				}
			}
		}
	}
}
