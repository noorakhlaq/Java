package programs;

public class ReverseNumber {
	public static void main(String[] args) {

		int num = 12345678;
		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println(rev);

	}
}

class Stringbuild {

	public static void main(String[] args) {
		int a = 95632451;
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		StringBuilder reverse = sb.reverse();
		System.out.println(reverse);

	}
}

class StringBuff {

	public static void main(String[] args) {

		int num = 1694364;

		StringBuffer abc = new StringBuffer(String.valueOf(num));

		StringBuffer reverse = abc.reverse();

		System.out.println(reverse);

	}
}
