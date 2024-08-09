package learning;

import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean matchingStatus = Pattern.matches(".*Arun.*","My name is Arun");
		
		if (matchingStatus) {
			
			System.out.println("Matched");
			
		} else {
			
			System.out.println("Not matched");
		}
	}

}
