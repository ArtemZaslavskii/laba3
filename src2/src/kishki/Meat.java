package kishki;

import java.util.Map;
import java.util.Scanner;

public class Meat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = scanner.nextLine();

        NewMeat WordFrequencyCounter = null;
        Map<String, Integer> wordFrequency = WordFrequencyCounter.countWordFrequency(text);

        System.out.println("\nWord frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}