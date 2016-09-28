package helpers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;

public class FileHelper {

	public void AppendStringArrayToFile(ArrayList<String> stringArr, File destinationFile) throws AccessDeniedException, FileNotFoundException, IOException{

		FileWriter fileWriter;

		// What can go wrong : File not found/permission
		try{ 
			fileWriter = new FileWriter(destinationFile.getAbsolutePath());

			for (String str: stringArr){
				fileWriter.write(str);
			}
			fileWriter.close();
		}

		catch(AccessDeniedException | FileNotFoundException ex){
			ex.printStackTrace();
		}
	}

}
