import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PalindromicPrimePowers {

	public static void main(String[] args) throws FileNotFoundException {
	
		Scanner list = new Scanner(new File("list.txt"));
		
		while(list.hasNext()) {
			int index = Integer.parseInt(list.nextLine());
			long number = (long) Math.pow(index, 2);
			if(isPalindrome(number)) {
				System.out.println(index);
				int exponent = 2;
				while(isPalindrome(number)) {
					System.out.println(number);
					exponent++;
					number = (long) Math.pow(index, exponent);
				}
			}
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