import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Dictionary {

	private ArrayList<String> list;

	public Dictionary() {
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(classLoader.getResource("dictionary.txt").getFile());
			Scanner s = new Scanner(file);
			list = new ArrayList<String>();
			while (s.hasNext()) {
				String word = s.next();
				list.add(StringUtils.lowerCase(word));
			}
			s.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isEnglishWord(String word) {
		if (word == null) {
			return false;
		}
		return list.contains(StringUtils.lowerCase(word));
	}

}
