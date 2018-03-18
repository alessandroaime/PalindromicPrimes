import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PalindromicPrimes {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner list = new Scanner(new File("primes.txt"));

		while(list.hasNext()) {
			long number = Long.parseLong(list.nextLine());
			if(isPalindrome(number))
				System.out.println(number);
		}

	}

	public static boolean isPalindrome(long n) {
		String original = ((Long) n).toString();
		for(int l = 0; l <= original.length()/2; l++)
			if(original.charAt(l) != original.charAt(original.length() - 1 - l))
				return false;
		return true;
	}

}
