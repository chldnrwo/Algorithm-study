import java.util.*;
import java.io.*;
import java.math.BigInteger;
 

 
class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        String s = "SciComLove";
        
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        int n = in.nextInt();
        if(n%2==0) {
        	System.out.println(s);
        }else {
        	System.out.println(sb);
        }
        
    }
    
  
  
} 
 