//Sanakirjatiedostolistat english ja finnish 
//ja niiden vertailu, samojen sanojen etsiminen
import java.util.*;
import java.io.*;

public class Find {
    public static void main(String[] args) throws Exception {
        ArrayList<String> englishWords = new ArrayList<>();
        HashSet<String> finnishWords = new HashSet<>();
        Scanner reader = new Scanner(new File("english.txt"));
        while (reader.hashNextLine()) {
            englishWords.add(reader.nextLine());
        }
        reader = new Scanner(new File("finnish.txt"));
        while (reader.hashNextLine()) {
            finnishWords.add(reader.nextLine());
        }
        int counter = 0;
        long startTime = System.nanoTime();
        for (String word : englishWords) {
            if (finnishWords.contains(word)) {
                System.out.println(word);
                counter++;
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Sanoja yhteensä: " + counter);
        System.out.println("Aikaa hakuun kului: " + (endTime-startTime)/1e9 + " s.");
    }
}
