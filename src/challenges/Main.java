package challenges;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Exercise1 exercise1 = new Exercise1();

		System.out.println("------------------Exercise 1------------------\n");

		int[] nums1 = {-4, -1, 0, 3, 10};
		System.out.println("Input: " + Arrays.toString(nums1));
		int[] numsOutput1 = exercise1.squaresInOrder(nums1);
		System.out.println("Output: " + Arrays.toString(numsOutput1) + "\n"); 

		int[] nums2 = {-7, -3, 2, 3, 11};
		System.out.println("Input: " + Arrays.toString(nums2));
		int[] numsOutput2 = exercise1.squaresInOrder(nums2);
		System.out.println("Output: " + Arrays.toString(numsOutput2) + "\n");  

//		int[] nums3 = {-104, -7, -5, -4, -1};
//		System.out.println("Input: " + Arrays.toString(nums3));
//		int[] numsOutput3 = exercise1.squaresInOrder(nums3);
//		System.out.println("Output: " + Arrays.toString(numsOutput3) + "\n");  
//
//		int[] nums4 = {1, 4, 5, 7, 104};
//		System.out.println("Input: " + Arrays.toString(nums4));
//		int[] numsOutput4 = exercise1.squaresInOrder(nums4);
//		System.out.println("Output: " + Arrays.toString(numsOutput4) + "\n");  
//
//		int[] nums5 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104};
//		System.out.println("Input: " + Arrays.toString(nums5));
//		int[] numsOutput5 = exercise1.squaresInOrder(nums5);
//		System.out.println("Output: " + Arrays.toString(numsOutput5) + "\n");   

		/************************************************************************/

		Exercise2 exercise2 = new Exercise2();

		System.out.println("------------------Exercise 2------------------\n");

		int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
		System.out.print("Input: ");
		exercise2.printIntervals(intervals1);
		int[][] intervalsOutput1 = exercise2.mergeOverlap(intervals1);
		System.out.print("Output: ");
		exercise2.printIntervals(intervalsOutput1);

		int[][] intervals2 = {{1, 4}, {4, 5}};
		System.out.print("\nInput: ");
		exercise2.printIntervals(intervals2);
		int[][] intervalsOutput2 = exercise2.mergeOverlap(intervals2);
		System.out.print("Output: ");
		exercise2.printIntervals(intervalsOutput2);

//		int[][] intervals3 = {{7, 8}, {3, 4}, {1, 9}, {4, 5}, {12, 14}, {10, 12}};
//		System.out.print("\nInput: ");
//		exercise2.printIntervals(intervals3);
//		int[][] intervalsOutput3 = exercise2.mergeOverlap(intervals3);
//		System.out.print("Output: ");
//		exercise2.printIntervals(intervalsOutput3);
//
//		int[][] intervals4 = {{7, 8}};
//		System.out.print("\nInput: ");
//		exercise2.printIntervals(intervals4);
//		int[][] intervalsOutput4 = exercise2.mergeOverlap(intervals4);
//		System.out.print("Output: ");
//		exercise2.printIntervals(intervalsOutput4);
//
//		int[][] intervals5 = {{1, 20}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}, {7, 8}};
//		System.out.print("\nInput: ");
//		exercise2.printIntervals(intervals5);
//		int[][] intervalsOutput5 = exercise2.mergeOverlap(intervals5);
//		System.out.print("Output: ");
//		exercise2.printIntervals(intervalsOutput5);

	}

}
