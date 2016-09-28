package helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandLineRunner {	

	public void commandRunner(String[] commands) throws IOException{	
		// we assume that the software installed, in case it doesnt we will handle that
		String stdOutput = null;
		Runtime rt = Runtime.getRuntime();
		Process proc = rt.exec(commands);
	
		BufferedReader stdInput = new BufferedReader(new 
				InputStreamReader(proc.getInputStream()));
	
		BufferedReader stdError = new BufferedReader(new 
				InputStreamReader(proc.getErrorStream()));
	
		// read the output from the command
		System.out.println("Here is the standard output of the command:");

		while ((stdOutput = stdInput.readLine()) != null) {
			if (stdOutput.contains("version"))
				System.out.println(stdOutput);
		}
	
		// read any errors from the attempted command
		System.out.println("\nHere is the standard error of the command (if any):");
		while ((stdOutput = stdError.readLine()) != null) {
		    System.out.println(stdOutput);
		}

	}

}
