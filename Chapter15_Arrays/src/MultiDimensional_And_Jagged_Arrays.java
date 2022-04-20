
public class MultiDimensional_And_Jagged_Arrays {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * The declaration of multidimensional array can be done by adding [] for each
		 * dimension to a regular array declaration. For instance, to make a
		 * 2-dimensional int array, add another set of brackets to the declaration, such
		 * as int[][]. This continues for 3-dimensional arrays (int[][][]) and so forth.
		 */
		int rows = 3;
		int columns = 3;
		int[][] table = new int[rows][columns];

		table[0][0] = 0;
		table[0][1] = 1;
		table[0][2] = 2;

		System.out.println(table[0][1] + " " + table[0][2]);// 1 2

		/*
		 * It is also possible to instantiate a dimension at a time, and even make
		 * non-rectangular arrays. These are more commonly referred to as jagged arrays.
		 */
		int[][] nonRect = new int[4][];
		/*
		 * It is important to note that although it is possible to define any dimension
		 * of jagged array, it's preceding level must be defined.
		 */
		
		// valid
		String[][] employeeGraph = new String[30][];
		
		/*
		 * invalid
		 * 
		 * int[][] unshapenMatrix = new int[][10];
		 */
		
		/*
		 * also invalid
		 * 
		 * int[][][] misshapenGrid = new int[100][][10];
		 */
	}

}
