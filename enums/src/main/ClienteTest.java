package main;

import dominio.Cliente;
import dominio.TipoCliente;
import dominio.TipoPagamento;
import org.w3c.dom.ls.LSOutput;

public class ClienteTest {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubaasa", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Tsubaasa", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);


        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }

}
