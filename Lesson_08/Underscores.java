import java.util.Scanner;

public class Underscores
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Input a sentence:");
		String sentence = kb.nextLine();

		System.out.println(replace(sentence));
	}
	public static String replace(String sentence)
	{
		if (sentence.indexOf(" ") <= 0)
		{
			return sentence;
		}
		else
		{
			sentence = sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ") + 1);
			return replace(sentence);
		}	
	}
}