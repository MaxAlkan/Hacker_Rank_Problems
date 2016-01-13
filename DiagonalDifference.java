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
 */
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		int index = 0;
		int sum = 0;
		String[] row;
		
		while(n-- > 0) {
			row = s.nextLine().split(" ");
			sum += (Integer.parseInt(row[index]) - Integer.parseInt(row[n]));
			index++;
		}
		
		System.out.println(Math.abs(sum));
	}
}
