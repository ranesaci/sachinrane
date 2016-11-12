import java.util.ArrayList;
import java.util.List;


public class OutOfMemoryTest {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("SACCAS"));
		}
	
	public static boolean isPalindrome(final String s) {
		final String toCheck = s.toLowerCase();
		int left = 0;
		int right = toCheck.length() - 1;
		while (left <= right) {
		while(left < toCheck.length() &&
		!Character.isLetter(toCheck.charAt(left))) {
		left++;
		}
		while(right > 0 && !Character.isLetter(toCheck.charAt(right))) {
		right--;
		}
		if (left > toCheck.length() || right < 0) {
		return false;
		}
		if (toCheck.charAt(left) != toCheck.charAt(right)) {
		return false;
		}
		left++;
		right--;
		}
		return true;
		}

	}

