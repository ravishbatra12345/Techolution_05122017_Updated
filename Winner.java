package com.mindtree.test;

/**
 * Find the Winner!
 * 
 * @author M1029444
 *
 */
public class Winner {

	public static void main(String[] args) {
		// INPUT GOES HERE
		int[] andrea = {1,2,3}; 	 // ANDREA
		int[] maria = {2,3,1};  	//MARIA
		String type = "ODD";		// ODD / EVEN
		String winner = "";
		try {
			winner = findWinner(andrea, maria, type);
			System.out.println("Winner is : " + winner);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param andrea
	 * @param maria
	 * @param type
	 * @return
	 * @throws Exception
	 */
	private static String findWinner(int[] andrea, int[] maria, String type)throws Exception {
		if(andrea.length != maria.length){
			throw new IllegalArgumentException("Invalid input provided !!");
		}
		Integer resultAndrea = 0;
		Integer resultMaria = 0;
		for (int i = 0; i < maria.length; i++) {
			if("ODD".equalsIgnoreCase(type) ? i%2 != 0 : i%2 == 0){
				resultAndrea += andrea[i] - maria[i];
				resultMaria += maria[i] - andrea[i];
			}
		}
		System.out.println("Score of Andrea : " + resultAndrea);
		System.out.println("Score of Maria : " + resultMaria);
		
		if(resultAndrea > resultMaria)
			return "ANDREA";
		else if(resultMaria > resultAndrea)
			return "MARIA";
		else
			return "TIE";
	}

}
