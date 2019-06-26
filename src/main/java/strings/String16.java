package strings;

public class String16 {
    public String addString(String inp1, String inp2) {

        if (!inp1.matches("\\d+") || !inp2.matches("\\d+")) {
            return "Number Error";
        }

        while (inp1.length() != inp2.length()) {

            if (inp1.length() < inp2.length()) {
                inp1 = "0" + inp1;
            } else {
                inp2 = "0" + inp2;
            }

        }

        StringBuilder result = new StringBuilder();

        int sum, temp = 0;

        for (int i = inp1.length() - 1; i >= 0; i--) {

            int number1 = inp1.charAt(i) - '0';
            int number2 = inp2.charAt(i) - '0';

            sum = number1 + number2 + temp;

            temp = sum / 10;

            if (i != 0) {
                sum %= 10;
            }

            result.insert(0, sum);
        }

        return result.toString();
    }
}
