import java.util.ArrayList;
import java.util.Collections;

public class String9 {


    public String convert(String input) {

        if (!input.matches("[A-Za-z]+")) {
            return "Error";
        }

        StringBuilder result = new StringBuilder();
        char current = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == current) {
                count++;
            } else {
                if (count > 1) {
                    result.append(current).append(count);
                    count = 1;
                }else if (count == 1){
                    result.append(current);
                }

                current = input.charAt(i);
            }

            if (i == input.length() - 1) {
                if (count > 1){
                    result.append(current).append(count);
                } else if (count == 1) {
                    result.append(current);
                }
            }
        }
        return result.toString();
    }
}
