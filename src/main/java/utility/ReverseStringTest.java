package utility;

public class ReverseStringTest {

	public static String reverse(String str) {

		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}

	public static String reverse1(String str) {

		char ch[] = str.toCharArray();
		String rev = "";

		for (int i = ch.length - 1; i > 0; i--) {
			rev += ch[i];
		}

		return rev;

	}

	public static void main(String args[]) {
		System.out.println(ReverseStringTest.reverse("This is My World"));
		System.out.println(ReverseStringTest.reverse1("My name is rashmi"));
	}
}
