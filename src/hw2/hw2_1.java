package hw2;

public class hw2_1 {
	public static void main(String []args) {
		int sum = 0;
		for(int i= 1; i<=1000; i++) {
			if(i%2 == 0) {
				sum += i;
			}
		 }
		System.out.println("1到1000的偶數和為"+sum);
	  }
	}
