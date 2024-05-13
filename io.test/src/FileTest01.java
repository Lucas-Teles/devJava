import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\POO_JAVA\\devJava\\io.test\\arquivo\\file.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            boolean exists = file.exists();
            if (exists){
                System.out.println("Deleted " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
