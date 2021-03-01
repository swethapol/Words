import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {

		Dictionary dictionary = new Dictionary();

		String word = "working";
		int j = 1;

		Set<String> results = new HashSet<String>();

		for (int i = 0; i < word.length(); j++) {
			String subWord = word.substring(i, j);

			if (dictionary.isEnglishWord(subWord)) {
				results.add(subWord);
			}
			if (subWord.length() > 1) {
				String reverse = StringUtils.reverse(subWord);
				if (dictionary.isEnglishWord(reverse)) {
					results.add(reverse);
				}
			}

			if (j == word.length()) {
				i++;
				j = i;
			}
		}
		System.out.println(results);
	}

}
