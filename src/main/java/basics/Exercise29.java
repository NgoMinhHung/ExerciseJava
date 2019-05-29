package basics;

public class Exercise29 {

    public int convertRomanToDecimal(String input) {

        int result = 0;
        int[] decimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < decimal.length; i++) {
            while (input.indexOf(roman[i]) == 0) {
                result += decimal[i];
                input = input.substring(roman[i].length());
            }

        }

        return result;
    }
}
