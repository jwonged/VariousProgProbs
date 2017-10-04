package uk.ac.cam.dsjw2.algo;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
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
		for (String s : generateParenthesis(4)) {
			System.out.println(s);
		}
    }
}
