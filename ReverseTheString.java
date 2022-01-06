/*
 * This program uses a recursive function to reverse a string.
 *
 * By Zefeng Wang
 * Created on January 6, 2022
 *
*/

// import classes
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// class ReverseTheString
class ReverseTheString {
  public static void main(String[] args) throws IOException {
     
    // Reads each line of the file and stores it into an array
    List<String> lines = Files.readAllLines(Paths.get("input.txt"),
                               StandardCharsets.UTF_8);
    Iterator<String> itr = lines.iterator();
    List<String> list = new ArrayList<String>();
    for (int i = 0; itr.hasNext(); i++) {
      list.add(reverse(itr.next()));
    }

    // Write the corresponding reversed strings to output.txt
    FileWriter writer = new FileWriter("output.txt");

    for (String input : list) { 
      writer.write(input + "\n");
    }
    writer.close();

    System.out.println("Done");

  }

  // Recursive function to reverse and return a string
  private static String reverse(String str) {
    if (str.length() == 0) {
      return str;
    } else {
      return reverse(str.substring(1))  + str.charAt(0);
    }
  }
}
