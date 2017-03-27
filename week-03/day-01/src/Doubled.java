import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by nagyza on 2017.03.27..
 */
public class Doubled {
  public static void main(String[] args) {
    // Create a method that decrypts the assets/duplicated_chars.txt
    Path filePath = Paths.get("duplicated-chars.txt");
    Path filePathNorm = Paths.get("simlified-chars.txt");
    ArrayList<StringBuilder> normalLineBuilder = new ArrayList<StringBuilder>();
    try {
      ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(filePath);
      for (String line : lines) {
        normalLineBuilder.add(normLines(line));
      }
      Files.write(filePathNorm, normalLineBuilder);
    } catch (IOException ex) {
      ex.getMessage();
    }
  }

  public static StringBuilder normLines(String line) {
    ArrayList<Character> characters = new ArrayList<Character>();
    StringBuilder normLine = new StringBuilder();
    for (int i = 0; i < line.length(); i++) {
      characters.add(i, line.charAt(i));
    }
    for (int i = 0; i < characters.size(); i++) {
      if (characters.get(i) == characters.get(i + 1)) {
        characters.remove(i + 1);
      }
    }
    for (int i = 0; i < characters.size(); i++) {
      normLine.append(characters.get(i));
    }
    normLine = normLine.append("\n");
    return normLine;
  }
}
