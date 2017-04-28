import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class FileHandler {
  private static final Path fileKeepTodos = Paths.get("todos.csv");

  void writeFile(ArrayList todoLines) {
    try {
      Files.write(fileKeepTodos, todoLines);
    } catch (IOException f) {
      System.out.println("Something wrong with reading the " + fileKeepTodos + " file!");
    }
  }

  List<String> readFileTodo() {
    List<String> fileLines = new ArrayList<>();
    try {
      fileLines = Files.readAllLines(fileKeepTodos);
    } catch (IOException e) {
      writeFile((ArrayList) fileLines);
    }
    return fileLines;
  }

  List<Tasks> getTasklist() {
    List<Tasks> taskList = new ArrayList<>();
    for (String line : readFileTodo()) {
      String[] taskFields = line.split(";");
      String done = taskFields[0];
      boolean isDone = done.equals("x");
      String text = taskFields[1];
      String dateStart = taskFields[2];
      String dateEnd = taskFields[3];
      int priority = Integer.parseInt(taskFields[4]);
      taskList.add(new Tasks(isDone, text, dateStart, dateEnd, priority));
    }
    return taskList;
  }
}
