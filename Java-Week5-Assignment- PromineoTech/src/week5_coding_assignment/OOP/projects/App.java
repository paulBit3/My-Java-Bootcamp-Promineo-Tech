package week5_coding_assignment.OOP.projects;

public class App {

	public static void main(String[] args) {
		
		/*
		 * T  E  S  T  I  N  G
		 */
		
		//creating an asterisk logger instance
		Logger alog = new AsteriskLogger();
		alog.log("Hello");
		
		//printing out
		System.out.println(alog);
		
		//creating an asterisk error instance
		Logger error = new AsteriskLogger();
		error.error("Hello");
		
		System.out.println(error);
		
		// creating a spaced logger instance
		
		Logger slog = new SpacedLogger();
		slog.log("Hello");
		
		//printing out
		System.out.println(slog);
		
		//creating an space logger error instance
		Logger serror = new SpacedLogger();
		serror.error("Hello");
		
		//printing out
		System.out.println(serror);
		

	}

}
