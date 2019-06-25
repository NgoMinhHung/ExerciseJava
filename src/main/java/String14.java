public class String14 {

    public boolean isBarcode(String input) {

        if (input.length() != 13 || input.matches("[\\D]+")) {
            return false;
        } else {

            int sum = 0;

            for (int i = 0; i < input.length(); i++) {
                if (i % 2 != 0) {
                    sum += 3 * (input.charAt(i) - '0');
                } else {
                    sum += input.charAt(i) - '0';
                }
            }

            return sum % 10 == 0;
        }
    }
}
