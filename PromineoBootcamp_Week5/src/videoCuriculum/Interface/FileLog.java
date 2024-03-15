package videoCuriculum.Interface;

import java.io.*;
import java.util.*;

/*
 * this class will implement our logging interface
 */

public class FileLog implements LogInterface {
	
	//create a writing instance to write in a file
	private BufferedWriter writer;
	
	//method
	public FileLog() {
		//this method will create a txt file
		try {
			writer = new BufferedWriter(new FileWriter("logs.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void info(String info) {
		//creating instance
		Date date = new Date();
		try {
			writer.append("INFO: " + date.toString() + " - " + info);
			//go to next line
			writer.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void warning(String warning) {
		// creating instance
		Date date = new Date();
		try {
			writer.append("WARNING: " + date.toString() + " - " + warning);
			//go to next line
			writer.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void error(String error) {
		// creating instance
		Date date = new Date();
		try {
			writer.append("ERROR: " + date.toString() + " - " + error);
			//go to next line
			writer.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void fatal(String fatal) {
		// creating
		Date date = new Date();
		try {
			writer.write("FATAL!!!!: " + date.toString() + " - " + fatal); //this "\n" to go next line
			//or go to next line
			writer.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//closing an open file
	@Override
	public void close() {
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
