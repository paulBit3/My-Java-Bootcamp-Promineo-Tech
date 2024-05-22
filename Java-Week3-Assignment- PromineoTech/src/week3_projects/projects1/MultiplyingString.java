package week3_projects.projects1;

public class MultiplyingString {
	/*
	 * Takes a String and an integer and returns the string
	 * concatenated with itself integer number of times
	 */
	
	//method
	public static String multiplyingString(String str, int x) {
		String result = "";
		
		//looping
		for (int i = 0; i < x; i++) {
			//result
			result += str;
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		// calling our method
		//this will multiply the string by the number we'll pass
		//Hello World Hello World Hello World 
		String mySytring = multiplyingString("Hello World ", 3);
		
		System.out.println(mySytring);

	}

}
