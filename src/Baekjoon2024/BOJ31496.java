package Baekjoon2024;
import java.io.*;
import java.util.*;

public class BOJ31496 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		String s = in.next();
		int cnt = 0;
		for(int i=0;i<n;i++) {
			String s2 = in.next();
			int t = in.nextInt();
			String[] sarr = s2.split("_");
			
			for(int j=0;j<sarr.length;j++) {
				if(sarr[j].equals(s)) {
					cnt+=t;
				}
				
			}
		}
		System.out.println(cnt);
	}
}