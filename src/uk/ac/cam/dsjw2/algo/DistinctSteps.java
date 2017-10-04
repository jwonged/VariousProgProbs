package uk.ac.cam.dsjw2.algo;

import java.util.ArrayList;
import java.util.List;

public class DistinctSteps {
	public static int distinctWays(final int n) {
		if (n == 0 || n == 1 || n == 2) return n;
		int[] distinctWays = new int[n+1];
		
		distinctWays[0] = 0;
		distinctWays[1] = 1;
		distinctWays[2] = 2;
		
		for (int i=3; i<n+1; i++) distinctWays[i] = distinctWays[i-1] + distinctWays[i-2];
		return distinctWays[n];
	}
	public static List<String> generateParenthesis(final int n) {
        ArrayList<String> result = new ArrayList<String>();
        helper(0,n,"", result);
        return result;
    }
    public static void helper(int open, int remaining, String s, ArrayList<String> result) {
        if (remaining == 0 && open == 0) result.add(s);
        if (remaining > 0) {
            helper(open+1, remaining-1, s + "(", result);
        }
        if (open > 0) {
            helper(open-1, remaining, s + ")", result);
        }
    }
	public static void main(String[] args) {
		//System.out.println(distinctWays(4));
		for (String s : generateParenthesis(4)) {
			System.out.println(s);
		}
	}
}
