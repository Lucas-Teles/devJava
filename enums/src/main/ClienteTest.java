package main;

import dominio.Cliente;
import dominio.TipoCliente;
import org.w3c.dom.ls.LSOutput;

public class ClienteTest {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubaasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Tsubaasa", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Tsubaasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Tsubaasa", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }

}
