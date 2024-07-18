import java.util.*;

public class BOJ1342 {
	static int[] alpha = new int[26];
	static int cnt = 0;
	static String s;

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);

		s = in.next();
		for (int i = 0; i < s.length(); i++) {
			alpha[s.charAt(i) - 'a']++;
		}
		dfs(0, 0);
		System.out.println(cnt);
		in.close();
	}

	public static void dfs(int cost, int last) {
		if (cost == s.length()) {
			cnt++;
			return;
		}
		for (int i = 0; i < 26; i++) {
			if (alpha[i] > 0 && (cost == 0 || last != i)) {
				alpha[i]--;
				dfs(cost + 1, i);
				alpha[i]++;
			}
		}
	}
}
/*
 * aabbbaa 1
 * ab 2
 * aaab 0
 * abcdefghij 3628800
 * 
 */