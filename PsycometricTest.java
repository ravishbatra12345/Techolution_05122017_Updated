package com.mindtree.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Psychometric Testing
 * 
 * @author M1029444
 *
 */
public class PsycometricTest {

	public static void main(String[] args) {
		// INPUT GOES HERE
		int[] scores = { 4, 8, 7 };
		int[] lowerLimit = { 2, 4 };
		int[] upperLimit = { 8, 4 };
		List<Integer> result = null;
		try {
			result = testPsycometric(scores, lowerLimit, upperLimit);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param scores
	 * @param lowerLimit
	 * @param upperLimit
	 * @return
	 * @throws Exception
	 */
	private static List<Integer> testPsycometric(int[] scores, int[] lowerLimit, int[] upperLimit) throws Exception {
		if (lowerLimit.length != upperLimit.length)
			throw new IllegalArgumentException("Invalid set of data provided !");
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < lowerLimit.length; i++) {
			int flag = 0;
			for (int score : scores) {
				if (score >= lowerLimit[i] && score <= upperLimit[i]) {
					flag++;
				}
			}
			result.add(flag);
		}
		return result;
	}
}
