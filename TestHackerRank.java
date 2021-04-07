package hackerRank;

import static org.junit.jupiter.api.Assertions.*;
import hackerRank.SimpleDemo;

import org.junit.jupiter.api.Test;
class TestHackerRank {

	@Test
	void addition() {
	SimpleDemo sum = new SimpleDemo();
		int result = sum.add(3, 2);
		assertEquals(result, 5);
		
		
	}
	
}
