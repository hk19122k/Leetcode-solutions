
//https://leetcode.com/problems/sort-the-people/submissions/1175134182/

import java.util.Arrays;
import java.util.HashMap;

public class Sort_people {                          ///runtime 6 ms --> HashMap concept

	public static void main(String[]args)
	{
		String[] names = {"Mary","John","Emma"}; 
		int[] heights = {180,165,170};

		HashMap<Integer,String> map = new HashMap<>();
		for(int i=0;i<names.length;i++)
	{
			map.put(heights[i], names[i]);
		}
		Arrays.sort(heights);
	
		String[] r =  new String[heights.length];
		int j=0;
		for(int i = heights.length-1;i>=0;i--)
		{
			r[j] = map.get(heights[i]);
			System.out.println(r[j]);
			j++;
		}
		
	}	   
}


class Solution {                                                       ///runtime: 1 ms --> Quick Sort
    public String[] sortPeople(String[] names, int[] heights) {
       quicksort(names,heights,0,heights.length-1);
       return names;  
    }
    private void quicksort(String[]names,int[]heights,int low,int high){
        if(low>=high){
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
         int pivot=heights[mid];
         while(start<end){
            while( heights[start]>pivot){
                start++;
            }while(heights[end]<pivot){
                end--;
            }
            int temp=heights[start];
            heights[start]=heights[end];
            heights[end]=temp;
            String tempnames=names[start];
            names[start]=names[end];
            names[end]=tempnames;
            
         }
         quicksort(names,heights,low,end-1);
         quicksort(names,heights,start+1,high);
    }
}
