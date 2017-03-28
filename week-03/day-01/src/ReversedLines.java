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
  final public static String WRITE_PATH = "rereversed-lines.txt";

  public static void main(String[] args) {
    readLines(readFile());
  }



  public static ArrayList<StringBuilder> readLines(List<String> linesFromFile) {
    ArrayList<StringBuilder> lines = new ArrayList<>();
    StringBuilder linesReverse = new StringBuilder();
    for (int i =0; i < linesFromFile.size(); i++) {
      linesReverse.append(linesFromFile.get(i));
      linesReverse.reverse();
      lines.add(linesReverse);
      System.out.println(linesReverse);
      linesReverse.setLength(0);
    }
    return lines;
  }

  public static List<String> readFile() {
    List<String> lines = new ArrayList<>();
    try {
      Path filePath = Paths.get(READ_PATH);
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Something wrong with read file.");
    }
    System.out.println("ok");
    return lines;
  }
}
