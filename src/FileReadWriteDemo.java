import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWriteDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("resources/poem.txt");
            int readData = 0;
            char data = '\u0000';
            String str = "";
            while ((readData = fileInputStream.read()) != -1){
                data = (char) readData;
                str = str + data;
                System.out.print(data);

            }
            FileOutputStream fileOutputStream =
                    new FileOutputStream("resources/abc.txt");
            byte[] bytes = str.getBytes();
            fileOutputStream.write(bytes);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
