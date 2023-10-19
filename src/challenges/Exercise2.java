package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise2 {

	public int[][] mergeOverlap(int[][] input) {
		
		Arrays.sort(input, (a, b) -> Integer.compare(a[0], b[0]));
		
		List<int[]> output = new ArrayList<>();
		int[] mergeInterval = input[0];
		
		for(int i = 1; i < input.length; i++) {
			
			if(input[i][0] >= mergeInterval[0] && input[i][0] <= mergeInterval[1]) {
				mergeInterval[1] = Math.max(mergeInterval[1], input[i][1]);
			}
			else {
				output.add(mergeInterval);
				mergeInterval = input[i];
			}
			
		}
		
		output.add(mergeInterval);

		return output.toArray(new int[output.size()][]);
	}

	public void printIntervals(int[][] intervals) {

		System.out.print("[");
		for (int[] inter : intervals) {
			System.out.print(Arrays.toString(inter));
		}
		System.out.println("]");
		
	}

}
