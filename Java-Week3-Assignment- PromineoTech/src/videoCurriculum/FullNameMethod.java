package videoCurriculum;

public class FullNameMethod {
	
	/*
	 * methods
	 */
	
	//a string method that takes two string and return them
	public static String createFullName(String x, String y) {
		String fullName = x + " " + y;
		return fullName;
		
		//or
		//return x + " " + y;
	}

	public static void main(String[] args) {
		
		// variables
		String firstName = "Paul";
		String lastName = "Brou";
		
		//calling our method
		String fullName = createFullName(firstName, lastName);
		
		
		
		//printing full name
		System.out.println(fullName);

	}

}
