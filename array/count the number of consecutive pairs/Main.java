/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

// 4 3
// 1 2 4 3
// The number of pairs is 1 (1,2).

import java.io.*;
import java.util.*;

public class Main {

    public static int ArrayProblem(int []arr,int k){
       // Write code here

       int count = 0;

       for(int i = 1 ; i < arr.length ; i++){
        if(arr[i-1]+arr[i]==k) count++;
       }
       return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
                arr[i]=sc.nextInt();
        }
        System.out.println(ArrayProblem(arr,k)); 
    }
}
