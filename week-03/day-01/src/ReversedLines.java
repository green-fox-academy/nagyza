import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nagyza on 2017.03.27..
 */
public class ReversedLines {
  final public static String READ_PATH = "reversed-lines.txt";
  final public static String WRITE_PATH = "re-reversed-lines.txt";

  public static void main(String[] args) {
    try {
      Path pathToWrite = Paths.get(WRITE_PATH);
      Files.write(pathToWrite, readLines(readFile()));
    } catch (IOException ex) {
      System.out.println("Something wrong with writing file.");
    }
  }

  public static ArrayList<StringBuilder> readLines(List<String> linesFromFile) {
    ArrayList<StringBuilder> lines = new ArrayList<>();
    for (String line : linesFromFile) {
      StringBuilder lineReverse = new StringBuilder();
      lineReverse.append(line);
      lineReverse.reverse();
      lines.add(lineReverse);
      System.out.println(lineReverse);
    }
    return lines;
  }

  public static List<String> readFile() {
    List<String> lines = new ArrayList<>();
    try {
      Path filePath = Paths.get(READ_PATH);
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Something wrong with reading file.");
    }
    return lines;
  }
}