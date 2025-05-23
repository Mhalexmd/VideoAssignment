import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an English text: ");
        String text = scanner.nextLine().toLowerCase();

        HashMap<String, Integer> wordCount = new HashMap<>();
        HashMap<Character, Integer> letterCount = new HashMap<>();

        StringBuilder currentWord = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letterCount.put(ch, letterCount.getOrDefault(ch, 0) + 1);
                currentWord.append(ch);
            } else if (currentWord.length() > 0) {
                String word = currentWord.toString();
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                currentWord.setLength(0);
            }
        }
        if (currentWord.length() > 0) {
            String word = currentWord.toString();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        String mostFrequentWord = null;
        int maxCount = 0;
        for (var entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());
        sortedWords.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("\nWord frequencies:");
        for (var entry : sortedWords) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        List<Character> letters = new ArrayList<>(letterCount.keySet());
        Collections.sort(letters);
        System.out.println("\nLetter frequencies:");
        for (char c : letters) {
            System.out.println(c + " : " + letterCount.get(c));
        }

        System.out.println("\nMost frequent word: " + mostFrequentWord);
        System.out.println("Frequency: " + maxCount);
    }
}