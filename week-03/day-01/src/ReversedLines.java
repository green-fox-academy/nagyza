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
    readLines(readFile());
  }

  public static List<StringBuilder> readLines(List<String> linesFromFile) {
    List<StringBuilder> lines = new ArrayList<>();
    StringBuilder linesReverse = new StringBuilder();
    for (String line : linesFromFile) {
      linesReverse.append(line).reverse();
      lines.add(linesReverse);
      System.out.println(lines);
    }
    return lines;
  }

  public static List<String> readFile() {
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
