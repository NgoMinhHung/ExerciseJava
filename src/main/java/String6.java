public class String6 {

    public String convertString(String inp){

        if (!inp.trim().isEmpty()) {

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < inp.length(); i++) {
                if (Character.isUpperCase(inp.charAt(i))) {
                    result.append(Character.toLowerCase(inp.charAt(i)));
                } else {
                    result.append(Character.toUpperCase(inp.charAt(i)));
                }
            }

            return result.toString();
        }

        return null;
    }
}
