import java.util.Arrays;

//Eg of linear search 
public class Stringcheck {

	public static void main(String[]args) {
		String s = "haris";
		char target = 'i';
		System.out.println(charsearch(s,target));
		System.out.println(Arrays.toString(s.toCharArray())); // convert array to string 
		
	}
	
	//using for each loop
	static boolean charsearch(String s,char t)
	{
		if(s.length() == 0)
		{
			return false;
		}
		
		for(int a: s.toCharArray())  ///string to character array conversion
		{
			if(a == t)
			{
				return true;
			}
		}
		return false;
		
	}
	
	
	//using usual for loop 
	static boolean charsearch1(String s,char t)
	{
		if(s.length() == 0)
		{
			return false;
		}
		
		for(int i=0;i<s.length();i++)
		{
			if(t == s.charAt(i))
			{
				return true;
			}
		}
		return false;
	}
}
