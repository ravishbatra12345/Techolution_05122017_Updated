package com.mindtree.test;


/**
 * Given a long integer, num, find the number of ways to represent it as a sum of two or 
 * more consecutive positive integers.
 * 
 * @author M1029444
 *
 */
public class ConsecutiveSum {

	public static void main(String[] args) {
		// Provide your input here;
		Integer input = 15;
		Integer output = 0 ;
		output = findConsecutive(input);
		
		System.out.println("Sum is : "  +output);
	}

	/**
	 * Find out the consecutive sum
	 * @param N
	 */
	private static Integer findConsecutive(int N) {
		Integer start = 1;
		Integer end = (N + 1) / 2;
		Integer numOfWays = 0;
		while (start < end) {
			int sum = 0;
			for (int i = start; i <= end; i++) {
				sum = sum + i;
				if (sum == N) {
					numOfWays++;
				}
				if (sum > N)
					break;
			}
			start++;
		}
		return numOfWays;
	}
}
