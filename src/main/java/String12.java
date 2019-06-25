public class String12 {
    public String deleteDuplicateElements(String input) {

        if (!input.matches("[A-Za-z\\s]+")) {
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
                    result.append(current);
                    count = 1;
                } else {
                    result.append(current);
                }
                current = input.charAt(i);
            }

            if (i == input.length() - 1) {
                result.append(current);
            }
        }
        return result.toString();
    }
}
