import java.util.Scanner;

class prims {
  int weight[][], sol[], source, n, u, v, sum = 0, min = 99, flag = 0;
  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    //get number of vertices
    System.out.println("Enter number of vertices: ");
    n = sc.nextInt();
    
    //initialie sol and weight arrays
    sol = new int[10];
    weight = new int[n][n];
    
    //get source vertex
    System.out.println("Enter source vertex: ");
    source = sc.nextInt();
    
    //init sol to 0
    for (int i = 1; i <= n; i++) {
      sol[i] = 0;
    }
    
    //set source vertex to be included
    sol[source] = 1;
    
    //start Prim's algorithm loop
    for (int k = 1; k <= n-1; k++) {
      min = 99;
      for (int i = 1; i <= n; i++)
        for (int j = 1; j <= n; j++)
          if (sol[i] == 1 && sol[j] == 0)
            if (i != j && min > weight[i][j])
            {
              min = weight[i][j];
              u = i;
              v = j;
            }
    }
    
    //display this loop's calculation
    sol[v] = 1;
    sum += min;
    System.out.println(u + "->" + v + "=" + min);
  }
  
  for (int i = 1; i <= n; i++)
    if (sol[i] == 0)
      flag = 1;
  if (flag == 1)
    System.out.println("No Solutions Exist");
  else System.out.println("Minimum Cost Spanning Tree is: " + sum);
}
