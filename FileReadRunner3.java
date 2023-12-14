package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadRunner3 {

	public static void main(String[] args) throws IOException {

		Path pathFileToRead = (Paths.get("./resources/data.txt"));// reading a file or resource
		// List<String> lines = Files.readAllLines(pathFileToRead);
		// System.out.println(lines);

		Files.lines(pathFileToRead).map(String::toLowerCase).filter(str -> str.contains("a"))
				.forEach(System.out::println);

	}

}
