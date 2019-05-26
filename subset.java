import java.util.*;
import static java.lang.Math.pow;

class SubSet {
  public void subSet(int num, int n, int x[]) {
    for (int i = 1; i <= n; i++)
      x[i] = 0;
    for (int i = n; num != 0; i--) {
      x[i] = num % 2;
      num = num/2;
    }
  }
}

public class subset {
  int sum = 0, present = 0, x[], n, d, set[];
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    x = new int[10];
    set = new int[10];
    
    //get number of set elements
    System.out.println("Enter number of elements of set: ");
    n = sc.nextInt();
    
    //get set elements
    System.out.println("Enter set elements: ");
    for (int i = 1; i <= n; i++) {
      set[i] = sc.nextInt();
    }
    
    //get desired sum
    System.out.println("Enter desired sum: ");
    d = sc.nextInt();
    
    if (d > 0) {
      for(int i = 1; i <= Math.pow(2,n) - 1; i++) {
        SubSet s = new SubSet();
        s.subSet(i, n, x);
        
        //add up this sum
        sum = 0;
        for (int j = 1; j <= n; j++) {
          if (x[j] == 1)
            sum += set[j];
        }
        
        //check if sum is desired number
        if (d == sum) {
          //set present to 1
          present = 1;
          
          //show subset output
        }
      }
    }
    
    //if present not set to 1, no solution found
    if (present == 0) {
      System.out.println("No solution found");
    }
  }
}
