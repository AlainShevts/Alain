import java.util.HashMap;
import java.util.Scanner;

class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        // Разбиваем текст на слова и удаляем знаки препинания
        String[] words = text.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");

        // Создаем HashMap для хранения частоты встречаемости каждого слова
        HashMap<String, Integer> wordFrequency = new HashMap<>();

        // Вычисляем частоту встречаемости каждого слова
        for (String word : words) {
            if (!wordFrequency.containsKey(word)) {
                wordFrequency.put(word, 1);
            } else {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            }
        }

        // Выводим результаты
        System.out.println("Список уникальных слов и их частота встречаемости:");
        for (String word : wordFrequency.keySet()) {
            System.out.println(word + ": " + wordFrequency.get(word));
        }
    }
}