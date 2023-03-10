package programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class staticclass {

	public static void main(String[] args) {

		List a = new ArrayList();

		a.add("abc");
		a.add(9);
		Iterator i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());


		}
	}
}
