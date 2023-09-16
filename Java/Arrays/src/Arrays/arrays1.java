package Arrays;

import java.util.*;

public class arrays1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //size of array
    System.out.println("Enter the size of the array: ");
    int size = sc.nextInt();
    int numbers[] = new int[size];

    //take input
    for(int i=0; i<size; i++){
      System.out.println("Enter the number in array "+i);
      numbers[i] = sc.nextInt();
    }

    //input of the key
    System.out.println("Enter the key to be found.");
    int x = sc.nextInt();

    for(int i=0; i<size; i++){
      if(numbers[i]==x){
        System.out.println("The number your looking for is in the position: "+(i+1));
      }
    }
    sc.close();
  }
}
