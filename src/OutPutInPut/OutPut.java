package OutPutInPut;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutPut {
    public static void main(String[] args) {
        String text = "Something info";
        try(FileOutputStream fos = new FileOutputStream("D://Projects/Java/Collection/testWrite.txt")){
            //перевод в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);

        }catch (IOException ex){
            ex.printStackTrace();
        }
        System.out.println("Info has been written");
    }

}
