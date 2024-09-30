package hw2;

public class hw2_3 {
	public static void main(String[] args) {
    	int sum = 1; int i = 1;
    	while(i <= 10) {
    		sum *= i;
            i ++;
    	}
    	System.out.println("1~10的連乘積是"+sum);
    }
}
