public class String17 {

    public String subStringNumber(String inp1, String inp2) {

        if (!inp1.matches("\\d+") || !inp2.matches("\\d+")) {
            return "Number Error";
        }

        if (inp1.length() == inp2.length() && inp1.charAt(0) < inp2.charAt(0)){
            String temString = inp1;
            inp1 = inp2;
            inp2 = temString;
            return "-" + subStringNumber(inp1,inp2);
        }

        while (inp1.length() != inp2.length()) {

            if (inp1.length() < inp2.length()) {
                inp1 = "0" + inp1;
            } else {
                inp2 = "0" + inp2;
            }

        }


        StringBuilder result = new StringBuilder();

        int sub, temp = 0;

        for (int i = inp1.length() - 1; i >= 0; i--) {

            char number1 = inp1.charAt(i);
            char number2 = inp2.charAt(i);
            if (number1 < number2) {

                sub = 10 + (number1 - number2) - temp;
                if (i != 0){
                    temp = 1;
                    result.insert(0, sub);
                } else {
                    sub *= -1;
                    result.insert(0,sub);
                }
            } else {
                sub = (number1 - number2) - temp;
                temp = 0;
                result.insert(0, sub);
            }
        }

        return result.toString();
    }
}
