package revision;

import java.util.Scanner;

public class EditString {
	static String word = "All Dogs Go To Heaven";
	static String letter;
	static String reversedword = "";

	void Reverse() {

		for (int i = word.length() - 1; i >= 0; i--) {
			char c = word.charAt(i);
			reversedword += c;
		}
		System.out.println(reversedword);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a letter: ");
			letter = sc.nextLine();
			if (letter.equalsIgnoreCase("U"))
				System.out.println(word.toUpperCase());
			else if (letter.equalsIgnoreCase("L"))
				System.out.println(word.toLowerCase());
			else if (letter.equalsIgnoreCase("R")) {
				EditString es = new EditString();
				es.Reverse(reversedword);
			} else if (letter.equalsIgnoreCase("C")) {

			}

		}
	}

}
