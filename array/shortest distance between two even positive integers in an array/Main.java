/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int ans=ArrayProblem6(n,arr);
        System.out.println(ans);
    }
    public static int ArrayProblem6(int n, int[] arr){
        // Write code here

        int min_dist = Integer.MAX_VALUE;
        int countEven  =  0;
        int prevEven = -1;

        for(int i = 0 ; i < n ; i ++){
            if(arr[i] > 0 && arr[i] % 2 == 0){
                if(prevEven == -1){
                    prevEven = i ;
                }else if(i - prevEven < min_dist){
                    min_dist = i - prevEven;
                }
                countEven++;
                prevEven = i;
            }
        }
        if(countEven < 2 || min_dist == Integer.MAX_VALUE){
            return -1;
        }else{
        return min_dist;
        }
    }      
}

/*
import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int ans=ArrayProblem6(n,arr);
        System.out.println(ans);
    }
    public static int ArrayProblem6(int n, int[] arr){
        // Write code here

        int min_dist = Integer.MAX_VALUE;
        int countEven  =  0;

        for(int i = 0 ; i < n ; i++){
            
            if(arr[i] % 2 == 0 && arr[i] > 0){
                countEven++;
                for(int j = i + 1 ; j < n ; j++){
                    if(arr[j] > 0 && arr[j] % 2 == 0 ){
                        if(min_dist > j-i){
                            min_dist = j - i;
                        }
                    }
                }
            }
        }
        if(countEven < 2 || min_dist == Integer.MAX_VALUE){
            return -1;
        }else{
        return min_dist;
        }
    }      
}
*/
