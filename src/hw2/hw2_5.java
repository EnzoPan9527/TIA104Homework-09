package hw2;

public class hw2_5 {
	public static void main(String[] args) {
    	System.out.println("阿文可以選擇的數字有");
    	    int i = 1; int count = 0;
    	for(i = 1; i <= 39; i++) {
    		if(i == 4) {
    		   continue;
    		}
    		if(i == 14) {
     		   continue;
     		}
    		if(i == 24) {
     		   continue;
     		}
    		if(i == 34) {
      		   continue;
      		}
    		count ++;
    		System.out.println(i);
    	}
    	    System.out.println("共"+count+"個");
    }
}
