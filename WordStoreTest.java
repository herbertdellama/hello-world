import java.io.IOException;

public class WordStoreTest {

	public static void main(String[] args) throws IOException {
		WordStore store = new WordStore();
		store.put("a", "test1");
		store.put("ab", "test2");
		store.put("ab", "test3");
		store.put("a", "test4");

		System.out.println(store.getRandomWord("a"));
		System.out.println(store.getRandomWord("ab"));
		System.out.println(store.getRandomWord("b"));
		
		String filePath = "C:\\Users\\Kosta\\Desktop\\Work Folder\\Semester 2\\CS1801 Object Oriented Programming\\words\\nouns.txt";
		
		WordStore newStore = new WordStore(filePath);
		
		System.out.println(newStore.getRandomWord("A"));
		System.out.println(newStore.getRandomWord("B"));
		System.out.println(newStore.getRandomWord("C"));
		System.out.println(newStore.getRandomWord("D"));

	}

}
