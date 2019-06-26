package strings;

public class String15 {

    public int getnumberVerify(String input) {

        if (!input.matches("[\\d]+")) {
            return -1;
        } else {

            int sum = 0;

            for (int i = 0; i < input.length(); i++) {
                if (i % 2 != 0) {
                    sum += 3 * (input.charAt(i) - '0');
                } else {
                    sum += input.charAt(i) - '0';
                }
            }
            return (sum % 10 == 0 ? 0 : 10 - (sum % 10));
        }
    }
}
