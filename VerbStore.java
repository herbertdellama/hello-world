import java.io.IOException;

public class VerbStore extends WordStore {

	public static void main(String[] args) throws IOException {
		
		String filePath = "C:\\Users\\Kosta\\Desktop\\Work Folder\\Semester 2\\CS1801 Object Oriented Programming\\words\\verbs.txt";
		
		WordStore verbStore = new WordStore(filePath);
		
		System.out.println(verbStore.getRandomWord("A"));
		System.out.println(verbStore.getRandomWord("B"));
		System.out.println(verbStore.getRandomWord("C"));
		System.out.println(verbStore.getRandomWord("D"));

	}

}
