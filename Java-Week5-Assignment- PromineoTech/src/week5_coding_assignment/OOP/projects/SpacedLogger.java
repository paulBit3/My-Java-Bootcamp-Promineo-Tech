package week5_coding_assignment.OOP.projects;


/*
 * this class will implement our logger interface
 */

public class SpacedLogger implements Logger{
	
	/*
	 * The SpacedLogger should add a space or " " between each 
	 * character of the String argument passed into its methods.
	 */
	
	
	/*
	 * The log method
	 * 
	 * This method should add a space or " " between each character 
	 * of the String argument passed into it
	 * 
	 * If the log method received “Hello” as an argument, 
	 * it should print H e l l o
	 */

	@Override
	public void log(String log) {
		//calling addSpace method	
		System.out.print(addSpace(log));
		
	}
	
	
	/*
	 * The error method
	 * 
	 * This method should print with “ERROR:” preceding the spaced out 
	 * input (i.e. ERROR: H e l l o)
	 */

	@Override
	public void error(String error) {
		//calling addSpace method
		System.out.print("ERROR: " + addSpace(error));
		
	}
	
	
	//a function that add spaces between each character
	private String addSpace(String word) {
		// a string separator
		String sep = " ";
		
		//string variable to hold characters
		String s;
		
		//string builder variable to manipulate our string
		StringBuilder sb = new StringBuilder();

		//looping
		for(int i = 0; i < word.length(); i++) {
			//holding the string characters and adding space between them
			s = word.charAt(i) + sep;
			sb.append(s);
			//System.out.print(s);
		}
		
		
		return sb.toString();
	
	}
	
	
	
	
	
	//I was getting something print like this print in console
	// week5_coding_assignment.OOP.projects.AsteriskLogger@20ad9418
	
    //so I add a string Override method
	
	@Override
	public String toString() {
		return "";
	}

}
