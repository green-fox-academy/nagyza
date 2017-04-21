import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
  private static final Path fileKeepTodos = Paths.get("todos.csv");

  private void writeFile(ArrayList todoLines) {
    try {
      Files.write(fileKeepTodos, todoLines);
    } catch (IOException f) {
      System.out.println("Something wrong with reading the " + fileKeepTodos + " file!");
    }
  }

  public List<String> readFileTodo() {
    List<String> fileLines = new ArrayList<>();
    try {
      fileLines = Files.readAllLines(fileKeepTodos);
    } catch (IOException e) {
      writeFile((ArrayList) fileLines);
    }
    return fileLines;
  }
}
