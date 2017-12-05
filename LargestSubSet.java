package com.mindtree.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Largest Subset Sum
 * @author M1029444
 *
 */
public class LargestSubSet {

	public static void main(String[] args) {
		// Input goes here. NO need to specify how many ELEMENTS
		int[] arr = { 2,4 };
		try {
			findLcm(arr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Find out sum of all elements in subset.
	 * @param arr
	 * @throws Exception
	 */
	private static void findLcm(int[] arr)throws Exception {
		List<Integer> result = new ArrayList<>();
		
		for (int element : arr) {
			int flag = 0;
			for(int i = 1; i <= element; i++){
				if(element % i == 0)
					flag += i;
			}
			result.add(flag);
		}
		System.out.println(result);
	}

}
