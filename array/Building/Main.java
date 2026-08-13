/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// 7
// 9 3 7 6 2 0 4

// *
// *
// *               *
// *               *       *
// *               *       *
// *               *       *                       *
// *       *       *       *                       *
// *       *       *       *       *               *
// *       *       *       *       *               *


import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    buildings(arr, n);
  }

  public static void buildings(int[] arr, int n) {
    // your code here

    int max  = Integer.MIN_VALUE;

    for(int val : arr){
      if(val > max){
        max = val;
      }
    }
    
    for(int floor = max ; floor >= 1 ; floor--){
      for(int idx = 0 ; idx < n ; idx++){
        if(arr[idx] >= floor){
          System.out.print("*\t");
        }else{
          System.out.print("\t");
        }
      }
      System.out.println();
    }
    
  }
}