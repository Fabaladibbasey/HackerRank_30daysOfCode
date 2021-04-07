package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenAndOddString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> printWord = solution();
		for (int i = 0; i < printWord.size(); i++) {
			System.out.println(printWord.get(i));
		}

	}

	static List<String> solution() {
		List<String> words = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);
		String number = scan.next();
		words.add(number);
		int N = Integer.parseInt(number);
		int n = 0;
		while (n < N) {
			String even = "";
			String odd = "";
			String input = scan.next();
			for (int i = 0; i < input.length(); i++) {
				if (i % 2 == 0) {
					even += input.charAt(i);
				} else {
					odd += input.charAt(i);
				}
			}

			String word = even + " " + odd;
			words.add(word);
			n++;
		}

		return words;
	}
}
