package hw1;

public class hw1_5 {
	public static void main(String[] args) {
		int p = 1500000; double r = 0.02;
		double R = Math.pow(1+r,10);
	    double FV = p*R;
		System.out.printf("十年後的本利和為%.2f元%n",FV);
	}

}
