//spiral order matrix

package Arrays2;
import java.util.*;

public class arr3 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int numbers[][] = new int[rows][cols];

    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        numbers[i][j] = sc.nextInt();
      }
    }

    System.out.println("The Spiral Order of the Matrix is: ");

    int rowStart = 0;
    int rowEnd = rows-1;
    int colsStart = 0;
    int colsEnd = cols-1;

    while(rowStart <= rowEnd && colsStart <= colsEnd){

      for(int col=colsStart; col<=colsEnd; col++){
        System.out.print(numbers[rowStart][col]+" ");
      }
      rowStart++;

      for(int row=rowStart; row<=rowEnd; row++){
        System.out.print(numbers[row][colsEnd]+" ");
      }
      colsEnd--;

      for(int col=colsEnd; col>=colsStart; col--){
        System.out.print(numbers[rowEnd][col]+" ");
      }
      rowEnd--;

      for(int row=rowEnd; row>=rowStart; row--){
        System.out.print(numbers[row][colsStart]+" ");
      }
      colsStart--;

      System.out.println();
    }
    sc.close();
  }
}
