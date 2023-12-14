package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class DirectoryScanRunner2 {

	public static void main(String[] args) throws IOException {

		Path currentDirectory = (Paths.get("."));
		
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");

		Files.walk(currentDirectory, 4).filter(predicate).forEach(System.out::println);

	}

}
