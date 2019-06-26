package strings;

public class String1 {

    public String[] getSentence(String input){

        String[] result;

        if (!input.trim().isEmpty()){
            result = input.split("[.?!\n]");
            return result;
        }
        return null;
    }
}
