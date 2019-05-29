import java.util.ArrayList;

public class Exercise18 {
    public int reverseBits(int input) {
        int result = 0;
        while (input != 0) {
            result <<= 1;
            result |= input & 1;
            input >>= 1;
        }
        return result;
    }
}
