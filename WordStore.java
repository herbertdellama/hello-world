import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordStore {
	private Map<String, List<String>> mp;

	public WordStore() {
		this.mp = new HashMap<>();
	}

	public WordStore(String filename) throws IOException {
		this.mp = new HashMap<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filename));
			String line = br.readLine();
			for(char alphabet = 'A'; alphabet <= 'Z';alphabet++) {
				String letter = String.valueOf(alphabet);
				mp.put(letter, null);
				while (line.charAt(0) == alphabet) {					
					if (line.length() < 3){
					}
					else {
						List<String> wordList = mp.get(letter);
						if (wordList == null){
							wordList = new LinkedList<>();
							mp.put(letter, wordList);
						}
						wordList.add(line);
					}
					line = br.readLine();
				}
			}
		}
		catch (IOException e){
			System.out.println("Can't load: " + e.getMessage());
		}
		finally {
			br.close();
		}
	}

	public boolean containsKey(String key) {
		List<String> n = mp.get(key);
		if (n != null) {
			return true;
		} else {
			return false;
		}
	}

	public void put(String key, String word) {
		List<String> wordList = mp.get(key);
		if (wordList == null) {
			wordList = new LinkedList<>();
			mp.put(key, wordList);
		}
		wordList.add(word);
	}

	public String getRandomWord(String key) {
		if (this.containsKey(key) == false) {
			return null;
		} else {
			List<String> wordList = mp.get(key);
			String word = wordList.get((int) (wordList.size()*Math.random()));
			String finalWord = word.substring(0, 1).toUpperCase() + word.substring(1);
			return finalWord;
		}
	}
}
