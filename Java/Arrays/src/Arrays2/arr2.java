package Arrays2;

import java.util.*;

public class arr2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows: ");
    int rows = sc.nextInt();

    System.out.println("Enter the number of columns: ");
    int cols = sc.nextInt();

    int numbers[][] = new int[rows][cols];

    //Input
    System.out.println("Enter a matrix with "+rows+" rows and "+cols+" columns.");
    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        numbers[i][j] = sc.nextInt();
      }
    }

    //key
    System.out.println("Enter the key to be found:  ");
    int key = sc.nextInt();

    //Output
    System.out.println("The key is present in: ");
    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        if(numbers[i][j]==key){
          System.out.println(i+" "+j);
        }
      }
    }
    sc.close();
  }
}

