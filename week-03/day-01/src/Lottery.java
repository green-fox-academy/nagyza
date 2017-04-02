import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nagyza on 2017.04.02..
 */
public class Lottery {
  final static public String READ_PATH = "otos.csv";

  public static void main(String[] args) {
    // Create a method that find the 5 most common lottery numbers otos.csv

  }

  public static List<String> readFile() {
    List<String> lines = new ArrayList<>();
    try {
      Path filePath = Paths.get(READ_PATH);
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Something wrong with reading the " + READ_PATH + "file!");
    }
    return lines;
  }
}
