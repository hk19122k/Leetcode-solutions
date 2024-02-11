
public class Minimum_number {

	public static void main(String[]args) {
	
		int[] arr = {11,4,23,1,21};
		System.out.println(min(arr));
	}
	
	static int min(int[] a)
	{
	
		int one = a[0];
		for(int i =1;i<a.length;i++)
		{
			if(a[i]<a[0])
			{
				one = a[i];
			}
		}
		return one;
	}

	
}
