import java.util.Scanner;
public class Box
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = kb.nextLine();

		for(int i = 0; i < word.length(); i++)
		{
			System.out.println(word);
		}
	}
}