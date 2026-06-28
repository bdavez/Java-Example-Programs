public class test5 {
	public static void main(String[] args) {

		int[][] m1 = { 	{ 14, 11, 13, 12 }, 
							{ 18, 15, 13, 13 },
							{ 19, 16, 15, 17 } };

		int[][] m2 = { 	{ 54, 53, 51, 52 }, 
							{ 51, 59, 52, 56 },
							{ 53, 54, 52, 58 } };

		System.out.println("First array:"); 
		displayArray(m1);
		System.out.println("Second array:"); 
		displayArray(m2);

		/* write simple code to test your method and use
		   displayArray to display the result if applicable  */

        // Personal Code for main method is below:

        if(equals(m1,m2)) {
            System.out.println("The arrays are exactly Identical");
        } else {
            System.out.println("The arrays are NOT identical");
        }

	}

	//write your methods code here.
	public static void displayArray(int[][] m) {

		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++)
				System.out.print(m[r][c] + " ");
			System.out.println();
		}
        
	}
    public static boolean equals(int[][] m1, int[][] m2)  {
       boolean test = false;

       for(int i = 0; i < m1.length; i++) {     
           for(int r = 0; r < m1[i].length; r++) {
               if(m1[i][r] != m2[i][r]) {
                   test = false;
               } else {
                   test = true;
               }
           }
       }
       return test;

   }
}

