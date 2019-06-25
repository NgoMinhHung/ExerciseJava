import java.util.StringTokenizer;

public class String11 {

    public String calculateExpression(String input) {

        if (input.trim().isEmpty()) {
            return null;
        }

        StringBuilder result = new StringBuilder();

        StringTokenizer expression = new StringTokenizer(input, "[+ - * / ^ >> <<]", true);

        int number1 = Integer.parseInt(expression.nextToken());
        String operator = expression.nextToken();
        String operator2 = "";
        if (operator.equals(">") || operator.equals("<")) {
            operator2 = expression.nextToken();
        }
        int number2 = Integer.parseInt(expression.nextToken());

        if (operator.equals("+")) {
            result.append(number1 + number2);
        }
        if (operator.equals("-")) {
            result.append(number1 - number2);
        }
        if (operator.equals("*")) {
            result.append(number1 * number2);
        }
        if (operator.equals("/")) {
            result.append(number1 / number2);
        }
        if (operator.equals("^")){
            result.append(Math.pow(number1,number2));
        }
        if (operator.equals(">") && operator2.equals(">")){
            result.append(number1 >> number2);
        }
        if (operator.equals("<") && operator2.equals("<")){
            result.append(number1 << number2);
        }

        return result.toString();
    }
}
