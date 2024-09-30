package hw1;

public class hw1_3 {
	public static void main(String[] args) {
		int s = 256559; int d = 24; int m = 60;
		int a = s/(m*m*d); int b = (s-(a*24*60*60))/(m*m); int c = (s-(a*24*60*60)-(b*60*60))/m;
		int e = s-(a*24*60*60)-(b*60*60)-(c*60);
		System.out.println(a+"天"+b+"小時"+c+"分鐘"+e+"秒");
	}

}
