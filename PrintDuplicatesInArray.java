package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		Integer[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		List<Integer> dataList = new ArrayList<Integer>();

		Set<Integer> textSet = new LinkedHashSet<Integer>();
		dataList = Arrays.asList(arr);
		for (Integer eachValue : dataList) {

			if ((dataList.indexOf(eachValue)) != (dataList.lastIndexOf(eachValue)))

				textSet.add(eachValue);

		}
		System.out.println(textSet);

	}
}
