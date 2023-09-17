//Tak input and display matrix
package Arrays2;
import java.util.*;

public class arr1{
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

    //Output
    System.out.println("The matrix you entered is: ");
    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        System.out.print(numbers[i][j]+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}