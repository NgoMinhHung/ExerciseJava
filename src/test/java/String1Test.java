import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class String1Test {

    @Test
    public void Test_getSentence(){
        assertArrayEquals(new String1().getSentence("Hom nay troi mua to qua! Toi co nen nam ngu o nha k nhi? Nhung con nhieu viec phai lam. Con phai giat ao quan nua\n Thooi dep di :V"), new String[]{"Hom nay troi mua to qua"," Toi co nen nam ngu o nha k nhi"," Nhung con nhieu viec phai lam"," Con phai giat ao quan nua"," Thooi dep di :V"});
        assertArrayEquals(new String1().getSentence(""),null);
    }
}
