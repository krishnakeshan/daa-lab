import java.util.*;

//public class to start execution
public class hamiltonian {
}

//actual class that will do all the hard work
public class Hamil {
    int adj[][], x[], n;
    
    //take values for n, x, and adj in constructor
    
    //method to get next path value
    public void nextValue(int k) {
        int i = 0;
        while (true) {
            x[k] += 1;
            if (x[k] == n)
                x[k] = -1;
            if (x[k] == -1)
                return;
            if (adj[x[k-1]][x[k]] == 1) {
                for (i = 0; i < k; i++)
                    if (x[i] == x[k])
                        break;
            }
            
            if (i == k)
                if (k < n-1 || k == n-1 && adj[x[n-1]][0] == 1)
                    return;
        }
    }
    
    //method to consider k values from 1 to n-1
    public void getHCycle(int k) {
        while(true) {
            nextValue(k); //generate a path for this k, loaded into x[]
            
            if (x[k] == -1)
                return;
            if (k == n-1) {
                //display solution
                System.out.println("\nSolution: ");
                for (int i = 0; i < n; i++) {
                    System.out.print((x[k] + 1) + " ");
                }
                System.out.println(1); //print starting point
            }
            
            else getHCycle(k+1); //call same method for next value of k
        }
    }
}
