//transpose of an N X M array

package Arrays2;
import java.util.*;
public class arr4 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
     int numbers[][] = new int[n][m]; 

     for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        numbers[i][j] = sc.nextInt();
      }
     }

     System.out.println("THe transpose id: ");

     for(int j=0; j<m; j++){
      for(int i=0; i<n; i++){
        System.out.print(numbers[i][j]+" ");
      }
      System.out.println();
     }
     sc.close();
  }
}
