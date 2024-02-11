
//Problem link;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class findeven {

	public static void main(String[]args) 
	{
		int[] arr = {12,453,456,78,7};
		System.out.println(even_count(arr));
		System.out.println(count_shortcut(123456));
		
	}
	
	static int even_count(int[]a)
	{
		int c = 0;
		for(int b:a)
		{
		   if(even(b))
		   {
			   c++;
		   }
		}
		return c;
		
	}

	static boolean even(int b) {
		// TODO Auto-generated method stub
		int digi_count = digits(b);
				
		if( (digi_count%2) == 0)
		{
			return true;
		}
		return false;
	}

	 static int digits(int b) {
		// TODO Auto-generated method stub

		 int count =0 ;
		 while(b > 0)
		 {
			 count++;
			 b = b/10;
		 }
		 return count;
	}	
	 static int count_shortcut(int n)    ///shortcut to find count of digits
	 {
		return (int)(Math.log10(n)) +1;
	 }
	
}
