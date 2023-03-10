package programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		String abc = "hello";
		String bcd = abc;
		String rever = "";
		int leng = abc.length();
		for (int i = leng - 1; i >= 0; i--) {
			rever = rever + abc.charAt(i);
		}

		int num = 456789;
		int dup_num = num;
		int rev = 0;

		while (num > 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println(rev);

		if (dup_num == rev) {

			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}

	}

}
