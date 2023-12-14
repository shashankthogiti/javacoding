package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadRunner2 {

	public static void main(String[] args) throws IOException {

		Path pathFileToRead = (Paths.get("./resources/data.txt"));
		// List<String> lines = Files.readAllLines(pathFileToRead);
		// System.out.println(lines);

		Files.lines(pathFileToRead).map(String::toLowerCase).forEach(System.out::println);

	}

}
