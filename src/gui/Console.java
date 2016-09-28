package gui;
import java.io.IOException;

import helpers.*;

public class Console {

	private static CommandLineRunner commandLine;
	private String[] commands = {"C:\\Program Files\\Test\\test.bat"};;
	// reference : http://superuser.com/questions/217504/is-there-a-list-of-windows-special-directories-shortcuts-like-temp#217506

	public Console() throws IOException {

		commandLine = new CommandLineRunner();
		commandLine.commandRunner(commands);

	}

}
