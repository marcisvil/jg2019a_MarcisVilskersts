package lv.jg.lesson9;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {

    private Set<String> uniqueWords = new HashSet<>();

    public void addWord(String newWord) {
        uniqueWords.add(newWord);
    }

    public void getUniqueWords() {
        System.out.println(uniqueWords.size());
    }

    public void printToConsole() {
        uniqueWords.stream().forEach(word -> System.out.println(word));
    }

    public static void main(String[] args) {

        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();

        uniqueWordVocabulary.addWord("AAA");
        uniqueWordVocabulary.addWord("BBB");
        uniqueWordVocabulary.addWord("BBB");
        uniqueWordVocabulary.addWord("CCC");
        uniqueWordVocabulary.getUniqueWords();
        uniqueWordVocabulary.printToConsole();
    }
}
