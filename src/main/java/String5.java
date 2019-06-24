import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class String5 {

    public ArrayList<String> getWords(String inp) {
        ArrayList<String> result = new ArrayList<>();
        if (!inp.isEmpty()) {
            String[] temp = inp.split("[\\s]+");
            for (String word : temp) {
                if (word.matches("[\\w]+")) {
                    result.add(word);
                }
            }
        }
        return result;
    }

    public ArrayList<String> getDuplicateWords(String input) {


        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> words = getWords(input);

        if (words.size() < 2) return result;
        Collections.sort(words);

        String current = words.get(0);
        int count = 1;

        for (int i = 1; i < words.size(); i++) {
            if (words.get(i).equals(current)) {
                count++;
            } else {
                if (count > 1) {
                    result.add(current);
                    count = 1;
                }

                current = words.get(i);
            }

            if (i == words.size() - 1 && count > 1) {
                result.add(current);
            }
        }
        return result;
    }
}
