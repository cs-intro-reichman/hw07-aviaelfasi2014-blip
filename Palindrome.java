/** Checks if a given string is a palindrome. */

public class Palindrome {

	public static void main(String[]args) {
    	System.out.println(isPalindrome(args[0]));
    }
	
	public static boolean isPalindrome(String s) {
		if(s.length() <=1){
			return true;
		}
		return s.charAt(0) == s.charAt(s.length()-1) &&
				isPalindrome(s.substring(1,s.length()-1));

    }
}
