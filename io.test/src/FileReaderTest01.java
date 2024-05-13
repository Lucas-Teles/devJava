import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\POO_JAVA\\devJava\\io.test\\arquivo\\file2.txt");
        try(FileReader fr = new FileReader(file)){
            char[] in = new char[48];
            fr.read(in);
            for (char c : in){
                System.out.print(c);
            }
            //outra maneira
            int i;
            while ((i = fr.read()) != -1){
                System.out.print((char)i);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }


    }
}
