package Baekjoon.Main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ2851 {

    public static void main(String[] args) throws IOException {

    	Scanner in = new Scanner(System.in);
    	
    	int[] arr = new int[10];
    	for(int i=0;i<10;i++) {
    		arr[i] = in.nextInt();
    	}
    	
    	int sum1 = 0;
    	int sum2 = 0;
    	for(int i=0;i<10;i++) {
    		if(sum1+arr[i]<=100) {
				sum1 += arr[i];
			}else {
				sum2 = sum1 + arr[i];
				break;
			}
    	}
    	
    	if(Math.abs(100 - sum2) <= Math.abs(100 - sum1)) {
    		System.out.println(sum2);
    	}else {
    		System.out.println(sum1);
    	}
    
    }
}