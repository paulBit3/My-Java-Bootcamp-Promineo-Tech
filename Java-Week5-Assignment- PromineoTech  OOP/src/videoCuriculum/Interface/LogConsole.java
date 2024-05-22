package videoCuriculum.Interface;
import java.io.*;
import java.util.*;

/*
 * this class will implement our logging interface
 */

public class LogConsole implements LogInterface{

	@Override
	public void info(String info) {
		// creating instance
		Date date = new Date();
		
		//testing
		System.out.println(date.toString() + ": " + info);
		
	}

	@Override
	public void warning(String warning) {
		// creating instance
		Date date = new Date();
		
		//testing
		System.out.println("Warning - " + date.toString() + ": " + warning);
		
	}

	@Override
	public void error(String error) {
		// creating an instance
		Date date = new Date();
		
		//testing
		System.out.println("Error - " + date.toString() + ": " + error);
		
	}

	@Override
	public void fatal(String fatal) {
		// creating instance
		Date date = new Date();
		
		//testing
		System.out.println("FATAL!!!! " + date.toString() + ": " + fatal.toUpperCase());
		
	}
	

	//closing an open file
	@Override
	public void close() {
		
	}
	

}
