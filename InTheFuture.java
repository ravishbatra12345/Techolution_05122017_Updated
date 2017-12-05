package com.mindtree.test;

/**
 * Find out number days required by Kelly to do more program then Asha.
 * 
 * @author M1029444
 *
 */
public class InTheFuture {

	public static void main(String[] args) {
		//Input goes here
		final Integer ashaTask = 4;     // A
		final Integer kellyTask = 5; 	// K
		final Integer aheadValue = 1;	// P
		try {
			calculateChallenge(ashaTask, kellyTask, aheadValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Finding the challenge taken by Kelly.
	 * @throws Exception
	 */
	private static void calculateChallenge(final Integer ashaTask, final Integer kellyTask, final Integer aheadValue)throws Exception {
		Integer ashaCurrentTask = ashaTask + aheadValue;
		Integer kellyCurrentTask = kellyTask;
		Integer counter = 0;
		
		// Continue process until Kelly have more problem then Asha.
		while(kellyCurrentTask >= ashaCurrentTask){
			if(kellyCurrentTask > ashaCurrentTask){
				counter ++;
				break;
			}
			ashaCurrentTask += ashaTask;
			kellyCurrentTask += kellyTask;
			counter ++;
		}
		System.out.println("It'll take " + counter + " day(s) for Kelly to solve more problem then Asha.");
	}
}
