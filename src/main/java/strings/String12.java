package strings;

public class String12 {
    public String deleteDuplicateElements(String input) {

        if (!input.matches("[A-Za-z\\s]+")) {
            return "Error";
        }

        StringBuilder result = new StringBuilder();
        char current = input.charAt(0);

        for (int i = 1; i < input.length(); i++) {

            if (input.charAt(i) != current) {
                result.append(current);
                current = input.charAt(i);
            }

            if (i == input.length() - 1) {
                result.append(current);
            }
        }
        return result.toString();
    }
}
