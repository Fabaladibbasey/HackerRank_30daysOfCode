package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		decimalToBinary(125);
	}
	 static void decimalToBinary(int n){
	        List<Integer> consecutive = new ArrayList<Integer>();
	        List<Integer> maxConsecutive = new ArrayList<Integer>();
	        int count = 0;
	        while (n > 0) {
	            int remainder = n % 2;
	            consecutive.add(0, remainder);
	            n = n / 2;
	        }
	        System.out.println(consecutive);
	        for (int i = 0; i < consecutive.size(); i++) {
	            if (consecutive.get(i) == 1) {
	                count++;
	            }
	            else {
	            	maxConsecutive.add(count);
	            	count = 0;
	            }
	        }
	      maxConsecutive.add(count);
	      int maxCount = maxConsecutive.get(0);
	      for (int j = 0; j < maxConsecutive.size(); j++) {
	    	  if (maxCount < maxConsecutive.get(j)) {
	    		  maxCount = maxConsecutive.get(j);
	    	  }
	      }
	     System.out.println(maxConsecutive);
	    System.out.println(maxCount);
	    }
}
