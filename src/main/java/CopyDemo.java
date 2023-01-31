import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {

    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("d://test.txt");
            FileOutputStream fos = new FileOutputStream("d://test1.txt");
            fis.transferTo(fos);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
