package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

		Integer[] data = { 3, 2, 11, 4, 6, 7 };
		List<Integer> dataList = new ArrayList<Integer>();
		dataList = Arrays.asList(data);
		Collections.sort(dataList);
		System.out.println("The Second Largest Number is " + dataList.get(dataList.size() - 2));

	}

}
