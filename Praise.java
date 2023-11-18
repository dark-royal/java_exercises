import java.util.*;

public class Praise {

	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] bigHead) {
		System.out.println("Enter your name");
		String name = input.nextLine();

		System.out.println("Enter your age");
		int age = input.nextInt();

		System.out.printf("Your name is %s and you are %d years old", name, age);
	}
}