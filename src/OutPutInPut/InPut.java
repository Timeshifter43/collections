package OutPutInPut;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InPut {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("D://Projects/Java/Collection/testWrite.txt");
             FileOutputStream fos = new FileOutputStream("D://Projects/Java/Collection/ReWrite.txt") ) {

            byte[] buffer = new byte[fis.available()];

            fis.read(buffer, 0, buffer.length);
            fos.write(buffer, 0, buffer.length);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
