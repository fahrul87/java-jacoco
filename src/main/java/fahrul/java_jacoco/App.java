package fahrul.java_jacoco;


public class App {
	
	public boolean isPalindrome(String input) {
		if(input == null) {
			throw new IllegalArgumentException("Input Not Null");
		}
		
		if(input.equals(reserve(input))) {
			return true;
		}else {
			return false;
		}
	}
	
	private String reserve(String input) {
		String rev = "";
		for(int i = input.length()-1;i>=0;i--) {
			rev = rev + input.charAt(i);
		}
		return rev;
	}
   
}
