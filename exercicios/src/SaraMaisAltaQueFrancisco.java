import java.util.Locale;

public class SaraMaisAltaQueFrancisco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String nome1 = "Francisco";
        String nome2 = "Sara";
        double alturaFrancisco = 150;
        double alturaSara = 110;
        int quantosAnos = 0;

        while (alturaSara <= alturaFrancisco){
            alturaSara += 3;
            alturaFrancisco += 2;
            quantosAnos ++;
        }

        System.out.println("Vai demorar " + quantosAnos + " anos" + ", para Sara ficar mais alta que Francisco");
    }
}
