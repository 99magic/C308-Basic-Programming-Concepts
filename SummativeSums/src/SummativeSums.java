
public class SummativeSums {
	
	static int count = 1;
	
	public static void SumsArray(int[] array) {
		int n = array.length;
		int sum = 0;
		for(int i = 0; i < n; ++i) {
			sum += array[i];
		}
		System.out.println("#" + SummativeSums.count + " Array Sum: " + sum);
		SummativeSums.count++;
	}

	public static void main(String[] args) {
		int[] array1 = new int[] { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
		int[] array2 = new int[] { 999, -60, -77, 14, 160, 301 };
		int[] array3 = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
				140, 150, 160, 170, 180, 190, 200, -99 };
		
		SummativeSums.SumsArray(array1);
		SummativeSums.SumsArray(array2);
		SummativeSums.SumsArray(array3);
	}

}
