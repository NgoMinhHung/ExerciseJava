public class String3 {

    public boolean isSymmetry(String input){

        if (input.trim().isEmpty()){
            return false;
        }
        int lastIndex = input.length() - 1;
        int firstIndex = 0;
        while (firstIndex < lastIndex){
            if (input.charAt(firstIndex) != input.charAt(lastIndex)){
                return false;
            }else {
                lastIndex--;
                firstIndex++;
            }
        }
        return true;
    }
}
