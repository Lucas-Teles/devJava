import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        // File
        // FileWriter
        // FileReader
        // BufferedWriter
        // BufferedReader

        File file = new File("C:\\temp\\POO_JAVA\\devJava\\io.test\\arquivo\\file2.txt");

        try(FileWriter fw = new FileWriter(file, true)) {
            fw.write("O Lucas está se tornando um ótimo desenvolvedor.\n JAVA É TUDO");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
