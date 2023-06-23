import utils.Constants;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {
   static String myFile;

    static FileOutputStream fout;
    static byte[] byteArr;

    public static void main(String fileName, String myText ) {


        myFile = Constants.BASE_PATH_OUT + fileName;

        try {
            fout = new FileOutputStream(myFile);
            // Конвертація рядка в байти
            byteArr = myText.getBytes();
            fout.write(byteArr, 0, byteArr.length);
            // Закриття потоку
            fout.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        System.out.println("Success!");
    }
}
