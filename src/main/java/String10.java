public class String10 {
    public String convert(String input) {

        StringBuilder result = new StringBuilder();

        if (!input.matches("[\\w]+")){
            return "Error";
        }
        char current = 0;

        int i = 0;
        while (i < input.length()) {

            current = input.charAt(i);

            result.append(current);

            String temp = "0";

            i++;

            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                temp += input.charAt(i);
                i++;
            }

            int count = Integer.parseInt(temp) - 1;

            while (count > 0) {
                result.append(current);
                count--;
            }

        }
        return result.toString();
    }
}
