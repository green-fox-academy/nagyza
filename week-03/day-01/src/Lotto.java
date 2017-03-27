import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by nagyza on 2017.03.27..
 */
public class Lotto {
  public static void main(String[] args) {
    // Create a method that find the 5 most common lotto numbers assets/lotto.csv
    Path filePath = Paths.get("otos.csv");
    try {
      ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(filePath);
      for (String line : lines) {
        System.out.println(line);
      }
    } catch (IOException ex) {
      ex.getMessage();
    }
  }
}
