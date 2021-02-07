package com.test04;

public class StarPrn {
	/*
	 * ★
	 * ★★
	 * ★★★
	 * ★★★★
	 * ★★★★★
	 * 
	 */

	public void prn01() {
		for(int i = 5; i > 0; i--) {
			for(int j = i; j <=5; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}
	/*
	 * ★★★★★
	 * ★★★★
	 * ★★★
	 * ★★
	 * ★
	 */
	public void prn02() {
		/*
		 *  //i는 줄
		 *  for (int i = 0; i < 5; i++){
		 *  	// j는 5-i (5-0, 5-1, 5-2, 5-3, 5-4)
		 * 		for (int j = 0; j < 5-i; j++){
		 * 			System.out.print("*")
		 *		}
		 *		System.out.println();
		 *}
		 */
		
		for(int i = 5; i > 0; i--)
		{
			for(int j = i; j > 0; j--)
			{
				System.out.print("★");
			
			}
		    System.out.println();
		}
		
	}
	/*
	 *     ★
	 *    ★★
	 *   ★★★
	 *  ★★★★
	 * ★★★★★
	 */
	public void prn03() {
		/*
		 *      //i는 줄 (0,1,2,3,4)
		 * for (int i = 0; i < 5; i++) {
		 * 		// j는 빈칸 (4-0, 4-1, 4-,2 4-3, 4-4)	
		 * 		for (int j = 0; j < 4 - i; j++) {
		 * 			system.out.print(" ");
		 * 			}
		 * 		for (int k = 0; k < i+1; k++){
		 * 			system.out.print("*");
		 * 			}
		 * 		System.out.println();
		 * 		}
		 */
		 
		 
		
		for(int i = 0; i <= 5; i++)
		{
			for(int k = 0; k < 5 - i; k++ ) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
	}
	
	
	
	
	/*
	 * ★★★★★
	 *  ★★★★
	 *   ★★★
	 *    ★★
	 *     ★
	 */
	public void prn04() {
		/*    // i 는 줄
		 * for (int = 0; i < 5; i++){
		 * 		// j 는 공백
		 * 		for(int j = 0; j < i; j++){
		 * 			System.out.print(" ")
		 * 		// k 는 별 
		 * 		for(int k = 0; k < 5- i; k++){
		 * 			System.out.print("*")
		 * 		}
		 * 		System.out.println():
		 * }
		 */
		for(int i = 5; i > 0; i--)
		{
			for(int j = 0; j < 5 - i; j++ ) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("★");
			}
			System.out.println();
			
		}
	}
	
	/*
	 *     ★
	 *    ★★★
	 *   ★★★★★
	 *  ★★★★★★★
	 * ★★★★★★★★★
	 */
	public void prn05() {
		/*
		 * for (int i = 0; i < 5; i++){
		 * 		for (int j = 4 - i; j > 0; j--){
		 * 			System.out.print(" ");
		 * 		}
		 * 		for (int k = 0; k < 2 * i + 1; k++){
		 * 			System.out.print("*")
		 * 		}
		 * 		System.out.println();
		 *    }
		 * 
		 */
		
		
		for(int i = 0; i <= 5; i++){
			for(int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < (i * 2) - 1; k++) {
				System.out.print("★");
			}
			System.out.println();
			
		}
	}
	

}
