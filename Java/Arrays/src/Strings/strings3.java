package Strings;

import java.util.Scanner;

public class strings3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String result = "";

    System.out.println("Enter the string: ");
    String input = sc.next();

    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) == 'e') {
        result = result + 'i';
      } else {
        result = result + input.charAt(i);
      }
    }
    sc.close();
    System.out.println("After replacing all the 'e' with 'i', the word will be: " + result);
  }
}
