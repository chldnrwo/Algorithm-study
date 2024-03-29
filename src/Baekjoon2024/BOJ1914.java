package Baekjoon2024;
import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class BOJ1914 {
	static StringBuilder sb;
	static int n;
	static BigInteger[] arr;
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        sb = new StringBuilder();
        arr = new BigInteger[101];
        arr[1] = new BigInteger("1");
        
        System.out.println(dp(n));
        
        if(n<=20) {
        	hanoi(1,2,3,n);
        }
        
    }
    public static void hanoi(int start, int mid, int end, int n) {
    	if(n==1) {
    		System.out.println(start+" "+end);
    	}else {
    		hanoi(start, end, mid, n-1);
    		System.out.println(start+" "+end);
    		hanoi(mid, start, end, n-1);
    	}
    }
    public static BigInteger dp(int num) {
    	if(arr[num] == null) {
    		arr[num] = dp(num-1).multiply(new BigInteger("2")).add(new BigInteger("1"));
    	}

    	return arr[num];
    } 
    /*
2    3
1 2
1 3
2 1 


3    7
1 3
1 2
3 2
1 3
2 1
2 3
1 3

4    15
1 2
1 3
2 1
1 2
3 1
3 2
1 2
1 3
2 3
2 1
3 1
2 3
1 2
1 3
2 3

     */
    
    
    
    
    
}