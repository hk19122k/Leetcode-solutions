import java.util.Arrays;

public class twoD_search {

	public static void main(String[]args)
	{
		int[][]arr = {
				{1,2,3},
				{11,12,13},
				{21,22,23}
		};
		int t = 22;
		int[] res = search(arr,t);
		System.out.println(Arrays.toString(res));
	}
	
	static int[] search(int[][] a,int t)
	{
		for(int r = 0;r < a.length;r++)
		{
			for(int c = 0;c< a[r].length;c++)
			{
				if(a[r][c] == t)
				{
					return new int[]{r,c};
				}
			}
		}
		return new int[] {-1,-1};
	}
}

