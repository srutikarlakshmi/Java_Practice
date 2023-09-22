package Strings;

import java.util.*;

public class strings2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of strings: ");
    int n = sc.nextInt();
    String array[] = new String[n];
    int length = 0;

    for (int i = 0; i < n; i++) {
      array[i] = sc.next();
      length = length + array[i].length();
    }

    System.out.println("The length of the combinination of all the strings given is: " + length);

    sc.close();
  }
}
