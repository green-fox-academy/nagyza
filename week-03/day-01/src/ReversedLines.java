import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nagyz on 2017.03.27..
 */
public class ReversedLines {
  public static void main(String[] args) {
    readLines();
  }

  public static List<String> readLines() {
    List<String> lines = new ArrayList<>();
    try {
      Path filePath = Paths.get("reversed-lines.txt");
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Something wrong with read file.");
    }
    System.out.println("ok");
    System.out.println(lines);
    return lines;
  }
}
