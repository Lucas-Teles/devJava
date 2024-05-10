package teste;

public class StringTest01 {

    public static void main(String[] args) {
        String nome = "Lucas Teles";
        nome.concat(" - Dev Backend");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Lucas Teles");
        sb.append(" - Dev Backend");
        System.out.println(sb);
    }


}
