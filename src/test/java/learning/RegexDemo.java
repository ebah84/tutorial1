package learning;

import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean matchingStatus = Pattern.matches(".*Arun.*","My name is Arun");
		//boolean matchingStatus = Pattern.matches("[Jj]ava","Java");
		//boolean matchingStatus = Pattern.matches("Java[ksp]","Javas");
		//boolean matchingStatus = Pattern.matches(".ava","Java"); //match
		//boolean matchingStatus = Pattern.matches(".ava","99ava");  //no match
		//boolean matchingStatus = Pattern.matches("[0-9]am","5am");   //match
		//boolean matchingStatus = Pattern.matches("Java[ksp]","Javas"); //match
		//boolean matchingStatus = Pattern.matches("[a-z]et","set"); //match
		//boolean matchingStatus = Pattern.matches("[a-zA-Z0-9]et","Set");
		//boolean matchingStatus = Pattern.matches("[^0-9]et","Set"); // match first char can't be numeric value
		//boolean matchingStatus = Pattern.matches("Se[a-z]","Set"); //match last letter is any lower case char 
		boolean matchingStatus = Pattern.matches("s[^aeiouw]t","sat"); //no match middle char can't be from the list 
		if (matchingStatus) {
			
			System.out.println("Matched");
			
		} else {
			
			System.out.println("Not matched");
		}
	}

}
