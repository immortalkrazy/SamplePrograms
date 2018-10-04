import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class does nothing useful but to demonstrate array and ArrayList
 * conversion
 */
public class ArrayArrayList  {
  public static void main(String[] args) {
    arrayToArrayList();
    arrayListToArray();
  }

  public static void arrayToArrayList() {
    String[] colors = {"red", "green", "blue"};
    ArrayList<String> list = new ArrayList<String>(Arrays.asList(colors));
  }

  public static void arrayListToArray() {
    ArrayList<String> list = new ArrayList<String>();
    list.add("red");
    list.add("green");
    list.add("blue");
    String[] colors = new String[list.size()];
    list.toArray(colors);
  }
}
