package Arrays;
import java.util.*;

public class arrays3 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size = sc.nextInt();
    int numbers[] = new int[size];

    System.out.println("Enter the numbers: ");
    for(int i=0; i<size; i++){
      numbers[i] = sc.nextInt();
    }

    System.out.println("The numbers entered are: ");
    for(int i=0; i<size; i++){
      System.out.println(numbers[i]);
    }

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for(int i=0; i<numbers.length; i++){
      if(numbers[i] < min ){
        min = numbers[i];
      }
      else if(numbers[i] > max){
        max = numbers[i];
      }
    }

    System.out.println("The maximum number is: "+ max);
    System.out.println("The minimum number is: "+min);

    sc.close();
  }
}
