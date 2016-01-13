import java.io.*;
import java.util.*;

public class DiagonalDifference {
/*Given an N x N integer matrix A, find the difference between
 * the Primary and Secondary diagonals and return as a
 * positive integer. Sample:
 * 3
 * 11 2 4
 * 4  5 6
 * 10 8 -12
 which produces 15
 */
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();	//dimension of the matrix
		s.nextLine();		//ignores the enter after n is given
		int index = 0;		//used for selecting the correct elements from row[]
		int sum = 0;		//The diagonal difference, before the absolute value
		String[] row;		//the ith row of a matrix
		
		while(n-- > 0) {
			row = s.nextLine().split(" ");		//grabs the String input and converts into String[]
			sum += (Integer.parseInt(row[index]) - Integer.parseInt(row[n]));	//we don't need n-1 because of n-- in while loop
			index++;
		}
		
		System.out.println(Math.abs(sum));		//prints the absolute value of the sum, our desired answer
	}
}
