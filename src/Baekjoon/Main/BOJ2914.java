package Baekjoon.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class BOJ2914 {
    public static void main(String[] args) throws IOException {
        
    	Scanner in = new Scanner(System.in);
    	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	//StringTokenizer st = new StringTokenizer(br.readLine());
    	int a = in.nextInt();
    	int i = in.nextInt();
    	
    	i--;
    	
    	System.out.println(a*i+1);
    }
}

