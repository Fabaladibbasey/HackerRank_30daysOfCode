package hackerRank;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		 int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        if (N % 2 != 0) {
	        	System.out.println("I'm an odd");
	        	System.out.println(N / 2);
	            System.out.println("Weird");
	        }else {
	        	System.out.println("I'm in else block!");
	            if(N <=  5){
	            	System.out.println("N is less or equal to five!");
	                System.out.println("Not Weird");
	            } else if (N <= 20) {
	            	System.out.println("N is 6 to 20 inclusive!");
	                System.out.println("Weird");
	            }else{
	            	System.out.println("N is greater than 20");
	                System.out.println("Not Weird");
	            }
	        }
	        scanner.close();

	}

}
