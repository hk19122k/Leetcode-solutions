


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
