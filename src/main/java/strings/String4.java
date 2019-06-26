package strings;

import java.util.Arrays;

public class String4 {

    public int sumNumberInString(String input){

        if (!input.isEmpty()){
            input= input.replaceAll("[\\D]"," ").trim();
            String[] temp = input.split("[ ]+");
            return Arrays.stream(temp).mapToInt(Integer::parseInt).sum();
        }
        return 0;
    }
}
