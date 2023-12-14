package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryScanRunner1 {

	public static void main(String[] args) throws IOException {

		Path currentDirectory = (Paths.get("."));
		
		Files.walk(currentDirectory, 4).forEach(System.out::println);

	}

}
