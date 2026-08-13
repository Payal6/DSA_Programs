/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.util.*;

class Solution {
    public int Pairs(int []arr,int k){
           //your code here

           int count = 0;

           for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length ; j++ ){
                int diff = arr[i] - arr[j];

                if(diff == k){
                    count++;
                }
            }
        }
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
                arr[i]=sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.Pairs(arr,k)); 
    }
}

/*
Your current approach checks all pairs (i, j), including when i == j, and counts pairs where arr[i] - arr[j] == k. This counts pairs twice (both (i,j) and (j,i)) and also pairs where i == j, which should not be counted.

Let’s think step by step how to fix this:

Should we count pairs where i == j? No, because difference with the same element is zero.
Should we count both (i,j) and (j,i)? No, pairs should be counted once only.
The difference can be positive or negative depending on order, but we want pairs with difference exactly k.
So, we can iterate with i from 0 to n-1 and j from i+1 to n-1 to avoid double counting and self pairs.
Then check if absolute difference between arr[i] and arr[j] equals k.
Try updating your nested loops accordingly and see if that fixes the counting. Would you like me to help you with the loop structure?
*/