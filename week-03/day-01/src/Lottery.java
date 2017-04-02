import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by nagyza on 2017.04.02..
 */
public class Lottery {
  final static public String READ_PATH = "otos.csv";

  public static void main(String[] args) {
    // Create a method that find the 5 most common lottery numbers otos.csv
//    storeAllNumbers();
    for (int i = 0; i <90; i++) {
      System.out.println((i + 1) +"-" + countInstances().get(String.valueOf(i + 1)));
    }
  }

  public static HashMap<String, Integer> countInstances() {
    String[] numbers = new String[90];
    HashMap<String, Integer> numsInstance = new HashMap<String, Integer>();
    for (int i = 0; i < 90; i++) {
      numbers[i] = String.valueOf(i + 1);
    }
    for (int i = 0; i < 90; i++) {
      numsInstance.put(String.valueOf(i + 1), 0);
    }
    for (String number : storeAllNumbers()) {
      numsInstance.put(number, numsInstance.get(number) + 1);
    }
    return numsInstance;
  }

  public static List<String> storeAllNumbers() {
    List<String> allNumbers = new ArrayList<>();
    List<String> lines = readFileLines();
    for (String line : lines) {
      String[] raffledInWeek = Arrays.copyOfRange(line.split(";"), 11, 16);
      for (String number : raffledInWeek) {
        allNumbers.add(number);
      }
    }
    return allNumbers;
  }

  public static List<String> readFileLines() {
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
