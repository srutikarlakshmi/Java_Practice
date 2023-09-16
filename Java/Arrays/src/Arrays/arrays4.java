package Arrays;
import java.util.*;

public class arrays4 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size = sc.nextInt();
    int numbers[] = new int[size];

    System.out.println("Enter "+size+ " numbers.");
    for(int i=0; i<size; i++){
      numbers[i] = sc.nextInt();
    }

    boolean isAscending = true;

    for(int i=0; i<numbers.length-1; i++){
      if(numbers[i] > numbers[i+1]){
        isAscending = false;
      }
    }
    if(isAscending == true){
      System.out.println("Ascending order.");
    }
    else{
      System.out.println("Not in ascending order.");
    }
    sc.close();
  }
}
