package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {

		String[] input = { "HCL", "Wipro", "Aspire Systems", "CTS" };

		List<String> strArray = new ArrayList<String>();

		for (String eachItem : input) {

			strArray.add(eachItem);

		}

		int length = strArray.size();

		Collections.sort(strArray);

		for (int i = length - 1; i >= 0; i--) {
			System.out.println(strArray.get(i));
		}

	}

}
