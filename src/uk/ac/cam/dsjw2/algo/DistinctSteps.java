package uk.ac.cam.dsjw2.algo;

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
	
	public static void main(String[] args) {
		System.out.println(distinctWays(4));
	}
}
