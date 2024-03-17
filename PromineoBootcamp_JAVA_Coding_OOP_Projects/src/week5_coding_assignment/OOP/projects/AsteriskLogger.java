package week5_coding_assignment.OOP.projects;


/*
 * this class will implement our logger interface
 */

public class AsteriskLogger implements Logger{
	
	/*the log method
	 * 
	 * String receives 3 asterisks on either side of the String
	 * it should print something like this example ***Hello***
	 * */

	@Override
	public void log(String log) {
		
		//System.out.println("***" + log + "***");
		
		//the string log length
		int l = log.length();
				
		//we can use a for loop to do so
				
		/* this print asterisk(Stars) from the length of the word*/
		//outer loop for the left
//		for(int i = l-1; i > 0 ; i--) {
//			//inner loop for the right
//			for(int j = l; j <= l; j++) { 
//				System.out.println("*".repeat(i)); ;
//			}
//			System.out.println();
//		}
		/* end for loop for stars*/
				
		/* I will use my code above to implement printing 3 asterisks 
		* either side of the word */
		
		//number of asterisks
		int a = 3;
		
		//string builder to manipulate our string
		//and we assign it at once so we sue final keyword
		//so sb will always store the same value
		final StringBuilder sb = new StringBuilder(l * a);

		//loop while * is less or equal a
		for(int i = a; i <= a; i++) {
			sb.append(log);
			System.out.println("*".repeat(i) + sb.toString() + "*".repeat(i)); ;
		
		}
		
	}
	
	
	/*The error method
	 * This method print a String error preceded by the word “ERROR:”
	 * like this example below:
	 * 
		****************
		
		***Error: Hello***
		
		****************
	 */

	@Override
	public void error(String error) {
		// a string border
		
		String border = "****************";
		
		//printing the border
		System.out.println(border + "\n");
		
		//the string length
		int l = error.length();
		
		//number of asterisks
		int a = 3;
		
		//string builder to manipulate our string
		final StringBuilder sb = new StringBuilder(l * a);
		
		//loop while * is less or equal a
		for(int i = a; i <= a; i++) {
			sb.append(error);
			System.out.println("*".repeat(i) + "Error: " + sb.toString() + "*".repeat(i)+ "\n"); ;
		
		}
		
		//re-printing the border and add enter
		System.out.println(border);
		
		System.out.println();

	}
	
	//I was getting something print like this print in console
	// week5_coding_assignment.OOP.projects.AsteriskLogger@20ad9418
	
	//so I add a string Override method
	
	@Override
	public String toString() {
		return "";
	}
	

}
