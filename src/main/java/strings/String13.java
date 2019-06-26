package strings;

public class String13 {

    public boolean isEqualsubString(String inp1,String inp2){

        String str1 = inp1.toLowerCase();
        String str2 = inp2.toLowerCase();


        int index;

        for (int i = 0; i < str2.length(); i++) {
            index = str1.indexOf(str2.charAt(i));
            if (index == -1) {
                return false;
            }
        }
        for (int i = 0; i < str1.length(); i++) {
            index = str2.indexOf(str1.charAt(i));
            if (index == -1) {
                return false;
            }
        }

        return true;
    }
}
