import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexTest01 {
    public static void main(String[] args) {
        String regex = "ab";
        //String texto = "ababaaaaababaabbbbbaaaab";
        String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto: " + texto2);
        System.out.println("indice: 0123456789" );

        while (matcher.find()){
            System.out.println(matcher.start() + " ");
        }
    }
}
