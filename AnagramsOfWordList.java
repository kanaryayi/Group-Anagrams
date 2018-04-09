import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AnagramsOfWordList {
	static HashMap<String,ArrayList<String>> anagrams(String[] words,int size) {
		HashMap<String,ArrayList<String>> anagrams = new HashMap<>();
		for(String s : words) {
			char[] sorted = s.toCharArray();
			Arrays.sort(sorted);
			if(anagrams.containsKey(String.valueOf(sorted))) {
				anagrams.get(String.valueOf(sorted)).add(s);
			}
			else {
				ArrayList<String> anagram = new ArrayList<>();
				anagram.add(s);
				anagrams.put(String.valueOf(sorted),anagram);
			}
		}
		return anagrams;
	}
	public static void main(String[] args) {
		
		String[] words= {"yiğit","adam","ahmet","süleyman","silent","enlist"};
		HashMap<String,ArrayList<String>> anagrams = anagrams(words, words.length);
		
		for(String s : anagrams.keySet()) {
			ArrayList<String> anagram=anagrams.get(s);
			if(anagram.size()>1) {
				System.out.println(anagram.toString());
			}
		}
	}
}
