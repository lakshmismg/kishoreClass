package kishoreClass1;

public class Secondclass {

	public static void main(String[] args) {
		// Arrays exercise
		String x[][] = new String [2][3];
		{
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		
		x[1][0] = "A1";
		x[1][1] = "B1";
		x[1][2] = "C1";
		x[1][3] = "D1";
		
		x[2][0] = "A2";
		x[2][1] = "B2";
		x[2][2] = "C2";
		x[2][3] = "D2";
		
		for ( int rownum = 0; rownum < x.length;rownum = rownum++) {
		
		System.out.println("Rows are"+x.length);
		//System.out.println("colms are"+x[0].length);
	}
		}

}
}