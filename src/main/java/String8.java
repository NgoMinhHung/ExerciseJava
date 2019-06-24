public class String8 {

    public String Standardized(String input){

        if (input.trim().isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder();

        String[] sentence = input.split("[.,?!]+");
        String[] signs = input.replaceAll("[^.,?!]+", " ").trim().split("[\\s]+");


        for (String i : signs){
            System.out.println(i);
        }
        for (int i = 0; i < sentence.length; i++) {

            sentence[i] = sentence[i].trim().substring(0, 1).toUpperCase() + sentence[i].trim().substring(1).toLowerCase();

            if (i < signs.length) {

                result.append(sentence[i]).append(signs[i]).append(" ");

                if (signs[i].equals(",")) {
                    result.append(sentence[i].toLowerCase()).append(signs[i]).append(" ");
                }

            } else {
                result.append(sentence[i]);
            }
        }

        return result.toString().trim();
    }
}
