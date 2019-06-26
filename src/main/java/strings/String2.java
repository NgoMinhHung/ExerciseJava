package strings;

import java.util.ArrayList;

public class String2 {

    public ArrayList<String> getWords(String input){

        ArrayList<String> result = new ArrayList<>();
        String[] temp = input.trim().split("[\\s]");

        for (String word : temp){
            if (word.matches("[\\w]+")){
                result.add(word);
            }
        }
        return result;
    }
}
