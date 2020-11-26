

import java.util.StringTokenizer;

public class StringToken_or_Split {

	public static void main(String[] args) {

		int i = 0;

		String string = "java : Is the Best programming : Language : Right";

		StringTokenizer tokenizer = new StringTokenizer(string, ":", false);

		while (tokenizer.hasMoreTokens()) {

			System.out.println("NextToken = " + tokenizer.nextToken());

			i += 1;
		}

		System.out.println("Total Token : " + i + "\n");

		i = 0;
		String[] strings = string.split(":");

		for (String split : strings) {

			System.out.println("Split :" + split);

			i += 1;

		}

		System.out.println("Split token : " + i);

	}

}
