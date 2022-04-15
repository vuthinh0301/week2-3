package week2and3;

import java.util.Random;

public class RandomInt {
	public static void main(String[] args) {
		Random ran = new Random(1000);
		for(int i = 1; i <= 50; i++) {
			System.out.println("#" + i +": " + ran.nextInt(100));
		}
	}
}
