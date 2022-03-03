package me.dio;

import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.OperadorDeCaixa;
import me.dio.models.Vendedor;

public class Main {

    public static void main(String[] args) {
        /*Endereco endereco = new Endereco();
        endereco.setRua("Endereço para essa rua");
        System.out.println(endereco.getRua());*/

        Endereco endereco =
            new Endereco("Rua funcionário",
                "Complemento endereço funcionário", "bairro funcionário");
        System.out.println(endereco);
        System.out.println("-----");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Camila Vendedora");
        vendedor.setDocumento("123.456.789-00");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);
        System.out.println("-----");

        OperadorDeCaixa operadorCaixa =
            new OperadorDeCaixa("Camila Op Caixa", "789.456.123-00", 2000d, endereco);
        System.out.println(operadorCaixa);
        System.out.println("-----");

        Gerente gerente = new Gerente();
        gerente.setNome("Camila Gerente");
        gerente.setDocumento("456.123.789-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3.0);

        System.out.println(gerente);

    }
}
