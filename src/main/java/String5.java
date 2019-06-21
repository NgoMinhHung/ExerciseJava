import java.util.ArrayList;
import java.util.List;

public class String5 {

    public ArrayList<String> getDuplicateWords(String input){


        ArrayList<String> result = new ArrayList<>();
        if (!input.isEmpty()) {
            String[] temp = input.split("[\\s!?.\n]+");
            String current = temp[0];

            int count = 1;

            for (int i = 1; i < temp.length; i++) {
                if (temp[i] == current) {
                    count++;
                } else {
                    if (count > 1) {
                        result.add(current);
                        count = 1;
                    }

                    current = temp[i];
                }

                if (i == temp.length - 1 && count > 1) {
                    result.add(current);
                }
            }
        }
        return result;
    }
}
