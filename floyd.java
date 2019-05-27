import java.util.*;
import java.lang.Math;

public class floyd {
  public void flyd(int matrix[][], int n) {
    for(int k = 0; k < n; k++)
      for(int i = 0; i < n; i++)
        for(int j = 0; j < n; j++)
          matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
  }
  
  public static void main(String args[]) {
    //take input, create instance of this class, and call method
  }
}
