import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexTest02 {
    public static void main(String[] args) {
        // \d = todos os digitos
        // \D = o que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-z | A-Z, digitos e _
        // \W = tudo que não for incluso no \w
        // [] -> range de caracteres
        // ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        // {n,m} n até m
        // () -> agrupamento
        // | ou
        // $ fim da linha
        // . -> 1.3 123, 1A3, 1@3

        String regex = "([a-zA-A0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "lucas@gmail.com, samia@gmail.com, lumia@gmail.com.br, teste123@gmail.com";
        System.out.println("samia@gmail.com".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group()+"\n");
        }
    }
}
