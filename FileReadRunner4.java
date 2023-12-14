package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner4 {

	public static void main(String[] args) throws IOException {

		Path pathFileToRead = (Paths.get("./resources/file-write.txt"));// writing a file
		
		List<String> list = List.of("Apple", "Boy", "Cat", "Dog", "Elephant");
		Files.write(pathFileToRead, list);

	}

}
