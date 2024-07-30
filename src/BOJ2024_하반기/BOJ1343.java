package BOJ2024_하반기;
import java.util.*;

public class BOJ1343 {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		
		char[] arr = s.toCharArray();
		char[] arr2 = s.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			//System.out.print(i+" ");
			if(i+3<arr.length) {
				if(arr[i] == 'X' &&
						arr[i+1] == 'X' &&
						arr[i+2] == 'X' &&
						arr[i+3] == 'X' ) {
				arr2[i] = 'A';
				arr2[i+1] = 'A';
				arr2[i+2] = 'A';
				arr2[i+3] = 'A';
				i+=3;
				}else if(i+1<arr.length) {
					if(arr[i] == 'X' &&
							arr[i+1] == 'X') {
						arr2[i] = 'B';
						arr2[i+1] = 'B';
						i+=1;
					}
				} 
			}else if(i+1<arr.length) {
				if(arr[i] == 'X' &&
						arr[i+1] == 'X') {
					arr2[i] = 'B';
					arr2[i+1] = 'B';
					i+=1;
				}
			} 
			
			//System.out.println(new String(arr2));
		}
		for(int i=0;i<arr.length;i++) {
			if(arr2[i] == 'X') {
				System.out.println(-1);
				System.exit(0);
			}
		}
		
		
		System.out.println(new String(arr2));
	}

}
/*
 AAAA BB
 XXXXXX AAAABB
  XXXX....XXX.....XX  -1
  XX.XXXXXXXXXX..XXXXXXXX...XXXXXX BB.AAAAAAAABB..AAAAAAAA...AAAABB
 */