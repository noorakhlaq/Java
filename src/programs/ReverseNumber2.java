package programs;

public class ReverseNumber2 {
	public static void main(String[] args) {

		String abc = "Hello";
		String rev = "";
		int len = abc.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + abc.charAt(i);

			char a[] = abc.toCharArray();

			int abm = a.length;
			
		}
		System.out.println(rev);
	}
}
