//Problem Link
//https://leetcode.com/problems/richest-customer-wealth/description/

// Example 1:

// Input: accounts = [[1,2,3],[3,2,1]]
// Output: 6
// Explanation:
// 1st customer has wealth = 1 + 2 + 3 = 6
// 2nd customer has wealth = 3 + 2 + 1 = 6
// Both customers are considered the richest with a wealth of 6 each, so return 6.
// Example 2:

// Input: accounts = [[1,5],[7,3],[3,5]]
// Output: 10
// Explanation: 
// 1st customer has wealth = 6
// 2nd customer has wealth = 10 
// 3rd customer has wealth = 8
// The 2nd customer is the richest with a wealth of 10.
// Example 3:

// Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
// Output: 17

public class Richest_customer_wealth_leetocde {

	public static void main(String[]args) {
		
		int[][] arr  = {{1,5},{7,3},{3,5}};
		System.out.println(rich(arr));
	}

	static int rich(int[][] arr) {
		// TODO Auto-generated method stub
		int max = 0;
		for(int r = 0;r<arr.length;r++)
		{
			int sum = 0;
			for(int c=0;c<arr[r].length;c++)
			{
				sum = sum +arr[r][c]; 
			}
			
			if(sum > max)
			{
				max = sum;
			}
		}
		return max;
	}
}
