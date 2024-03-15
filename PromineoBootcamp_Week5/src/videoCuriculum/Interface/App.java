package videoCuriculum.Interface;

public class App {
	
	//let have a field
	static LogInterface log;

	public static void main(String[] args) {
		// Testing
		
		//creating a use console instance
		LogInterface log = new LogConsole();
		
		LogInterface file = new FileLog();
		
		log.info("Hello! You are logged in!");
		log.warning("This is a warning");
		log.error("Oops, this is an error!");
		log.fatal("Fatal error");
		
		//writing in a file
		file.info("Hello! You are logged in!");
		file.warning("This is a warning");
		file.error("Oops, this is an error!");
		file.fatal("Fatal error");
		
		//closing file
		file.close();
		//this will be wrtitten in the logs file
		/*
		 * INFO:Wed Mar 13 18:41:39 CDT 2024 - Hello! You are logged in!
		 * WARNING:Wed Mar 13 18:41:39 CDT 2024 - This is a warning
		 * ERROR:Wed Mar 13 18:41:39 CDT 2024 - Oops, this is an error!
		 * FATAL!!!!:Wed Mar 13 18:41:39 CDT 2024 - Fatal error
		 */
		
		//passing a new file
		setLog(new FileLog());
		
		//passing a new log
		setLog(new LogConsole());

	}
	
	//setting setter

	private static void setLog(LogInterface c) {
		try {
			log = c;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
