package lesson10.Map.task1;

import java.io.File;
import java.util.Map;

public class Translate {
	private Map<String, String> dictionary;

	public Translate(Map<String, String> dictionary) {
		super();
		this.dictionary = dictionary;
	}
	

	public Translate() {
		super();
	}


	public String translateWord(String word) {
		String result = dictionary.get(word);
		if(result == null) {
			return "*" + word + "*";
		}else {
			return result;
		}
	}
	
	public void loadDictionary(DictionaryDAO dictDAO) {
		this.dictionary.putAll(dictDAO.loadDictionary());
	}
	
	public void saveDictionary(DictionaryDAO dictDAO) {
		dictDAO.saveDictionary(dictionary);
	}
	
	public void translateFile(File in, File out) {
		String text = TextService.loadTextFromFile(in);
		String[] words = TextService.getWords(text);
		StringBuilder sb = new StringBuilder();
		for(String word : words) {
			sb.append(translateWord(word.toLowerCase()) + " ");
		}
		TextService.saveTextToFile(sb.toString(), out);
	}
	
	public void addWordsInteractive(AddWords addWords) {
		for(;addWords.addMorWords();) {
			dictionary.putAll(addWords.addWord());
		}
	}

	@Override
	public String toString() {
		return "Translate [dictionary=" + System.lineSeparator() + dictionary + "]";
	}
	
}
