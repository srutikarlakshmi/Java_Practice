package Strings;

import java.util.Scanner;

public class strings4 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your E-mail: ");
    String email = sc.next();
    String uname = "";

    for (int i = 0; i < email.length(); i++) {
      if (email.charAt(i) == '@') {
        break;
      } else {
        uname = uname + email.charAt(i);
      }
    }
    sc.close();
    System.out.println("Your username is: "+uname);
  }
}
