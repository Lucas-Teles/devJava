package main;

import domain.Cliente;
import domain.TipoCliente;
import domain.TipoPagamento;

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
