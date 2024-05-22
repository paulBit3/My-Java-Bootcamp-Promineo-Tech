package week3_projects.projects2;

import java.io.*;
import java.util.*;

public class ReadyForTheBeach {
	/*
	 * 
	 */
	
	//mwthod
	static String readyForTheBeach(int age){
	    if (age < 30){
	        return "Only if you built Facebook or Google";
	    }
	    if (age < 50){
	        return "Perhaps if you lived a frugal life and worked a couple of jobs at a time.";
	    }
	    if (age < 65){
	        return "You are getting closer...";
	    } else {
	        return "You can call it quits!";
	    }
	}

	public static void main(String[] args) {
		// Testing
		String iCanRetire = readyForTheBeach(64);
	    System.out.println(iCanRetire);

	}

}
