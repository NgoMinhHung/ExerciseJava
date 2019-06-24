public class String7 {

    public int getIndexSubString(String input, String subString) {

        int index = 0;

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == subString.charAt(index)) {
                index++;

                if (index == subString.length()) {
                    return i - subString.length() + 1;
                }

            } else {
                i -= index;
                index = 0;
            }

        }

        return -1;
    }
}
