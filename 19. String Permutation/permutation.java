import java.util.Scanner;

public class permutation {

	static void printPermutation(String str, String ans)
	{

		// If string is empty
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			String r = str.substring(0, i) +
						str.substring(i + 1);

			printPermutation(r, ans + ch);
		}
	}

	public static void main(String[] args)
	{
	    Scanner sc= new Scanner(System.in);
	    System.out.println("enter the String");
		String s=sc.nextLine();
			    System.out.println("permutation of String is ");

		printPermutation(s, "");
	}
}
