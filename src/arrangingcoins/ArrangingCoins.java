package arrangingcoins;

import java.util.Scanner;

public class ArrangingCoins {

	public static int arrangingCoins(int n) {
		int row = 1;
		int count = 0;
		while(n > row) {
			n -= row;
			row++;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int results = arrangingCoins(n);
		System.out.println(results);
	}

}
