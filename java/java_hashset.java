import java.util.*;

public class java_hashset {

	public static void main(String[] ars) {

		// create a HashSet
		Set<Integer> hs = new HashSet<Integer>();

		// add elements to HashSet
		hs.add(1);
		hs.add(2);
		hs.add(3);

		System.out.println(hs);

		hs.add(3);
		System.out.println(hs);
	}
}