package Arrays;
import java.util.*;

public class arrays2 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of people: ");
    int size = sc.nextInt();
    String people[] = new String[size];

    System.out.println("Enter the name of "+size+" people.");
    for(int i=0; i<size; i++){
      people[i] = sc.next();
    }

    System.out.println("The names of the people entered are: ");
    for(int i=0; i<size; i++){
      System.out.println(people[i]);
    }
    sc.close();
  }
}
