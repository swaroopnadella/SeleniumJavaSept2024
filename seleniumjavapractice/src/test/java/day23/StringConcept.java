package day23;

import java.util.Arrays;

public class StringConcept {

	public static void main(String[] args) {
		
		String str = "rgba(49, 122, 231, 1)";
		
		String numbers[] = str.replace("rgba(", "").replace(")", "").split(",");
		
		System.out.println(Arrays.toString(numbers));
	}

}
