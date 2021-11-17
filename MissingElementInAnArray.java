package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		Integer[] arr = {1,2,3,7,4,6,8};
		
		List<Integer> number = new ArrayList<Integer>();
		number.addAll(Arrays.asList(arr));
		Collections.sort(number);
		
		for (int i=0; i<= number.size()-1; i++)
		{
			if (number.get(i)!=i+1)
			{
				System.out.println("Missing number " +(i+1));
				break;
			}
				
		}
			
	
 		
	}
	}