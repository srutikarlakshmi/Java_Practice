package Strings;
//import java.util.*;

public class strings1 {
  public static void main(String args[]){
    String firstName = "Tony";
    String lastName = "Stark";

    //concatenation
    String fullName = firstName +" "+ lastName;
    System.out.println(fullName.length());

    //extract letters from the String
    for(int i =0; i<fullName.length(); i++){
      System.out.println(fullName.charAt(i));
    }

    //comparing 2 Strings
    String name1 = "Lakshmi";
    String name2 = "Lakshmi";

    //s1 > s2 : +ve value
    //s1 == s2 : 0
    //s1 < s2 : -ve value

    if(name1.compareTo(name2)==0){
      System.out.println("Strings are equal.");
    }
    else{
      System.out.println("Strings are not equal");
    }

    if(name1 == name2){
      System.out.println("Strings are equal.");
    }
    else{
      System.out.println("Strings are not equal");
    }

    if(new String("Tony") == new String("Tony")){
      System.out.println("Strings are equal.");
    }
    else{
      System.out.println("Strings are not equal");    //hence we use compareTo
    }

    //substirng
    String sentence = " My name is Srutika";
    String name = sentence.substring(11, sentence.length());
    System.out.println(name);

    //Strings are immutable

  }
}
