package hackerRank;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
	
		solve(20.75, 10, 3);
	}
	static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = (meal_cost / (double)100) * tip_percent;        
        double tax = (tax_percent / (double)100) * tip_percent;
        System.out.println(tip + " "+ tax);
        double total_cost = meal_cost + tip + tax;
        System.out.println(total_cost);
        int result = (int) Math.round(total_cost);
        System.out.println(result);
    }

}
