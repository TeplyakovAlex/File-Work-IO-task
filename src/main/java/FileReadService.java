import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadService {
    static String path;
    static FileInputStream fin;

    public static void main(String fileName) {


        path = Constants.BASE_PATH_OUT + fileName;

        try {
            fin = new FileInputStream(path);
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
