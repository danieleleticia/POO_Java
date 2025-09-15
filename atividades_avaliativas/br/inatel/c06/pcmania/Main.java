/*
==> Projeto PCMania <==
Nome: Daniele Letícia Pereira Sousa
Curso: GEC - Matricula: 2095
*/


package br.inatel.c06.pcmania;

import java.util.Scanner;
import br.inatel.c06.pcmania.computador.Computador;
import br.inatel.c06.pcmania.computador.MemoriaUSB;
import br.inatel.c06.pcmania.cliente.Cliente;
import br.inatel.c06.pcmania.pedido.ProcessarPedido;

public class Main
{
    public static void main(String[] args)
    {
        MemoriaUSB memoria1 = new MemoriaUSB("Pen-drive", 16);
        Computador promocao1 = new Computador("Apple", 2095,"macOS Sequoia", 64);
        promocao1.addHardware("Pentium Core i3", 2200);
        promocao1.addHardware("Memoria RAM", 8);
        promocao1.addHardware("HD", 500);
        promocao1.addMemoriaUSB(memoria1);

        MemoriaUSB memoria2 = new MemoriaUSB("Pen-drive", 32);
        Computador promocao2 = new Computador("Samsung", 3329,"Windows 8", 64);
        promocao2.addHardware("Pentium Core i5", 3370);
        promocao2.addHardware("Memoria RAM", 16);
        promocao2.addHardware("HD", 1024);
        promocao2.addMemoriaUSB(memoria2);

        MemoriaUSB memoria3 = new MemoriaUSB("HD externo", 1024);
        Computador promocao3 = new Computador("Dell",7773,"Windows 10", 64);
        promocao3.addHardware("Pentium Core i7", 4500);
        promocao3.addHardware("Memoria RAM", 32);
        promocao3.addHardware("HD",2048);
        promocao3.addMemoriaUSB(memoria3);

        Cliente cliente = new Cliente("Daniele Letícia Pereira Sousa", "99988877720");

        //criando vetor na main para que seja possivel contabiliza as compras com ASSOCIAÇÃO SIMPLES
        Computador[] carrinho = new Computador[10];
        int quant = 0;

        Scanner entrada = new Scanner(System.in);
        int opcao;

        System.out.println("==>PCMania<==");
        System.out.println("Olá, qual promoção de PC's gostaria de aproveitar?");
        System.out.println("1 - Apple | 2 - Samsung | 3 - Dell | 0 - Finalizar compra..");
        do
        {
            opcao = entrada.nextInt();

            if(opcao == 1)
            {
                carrinho[quant] = promocao1;
                System.out.println("PC Apple adicionado com sucesso!");
                quant++;
            }
            else if(opcao == 2)
            {
                carrinho[quant] = promocao2;
                System.out.println("PC Samsung adicionado com sucesso!");
                quant++;
            }
            else if(opcao == 3)
            {
                carrinho[quant] = promocao3;
                System.out.println("PC Dell adicionado com sucesso!");
                quant++;
            }
            else if(opcao == 0)
            {
                if(quant < 2)
                {
                    System.out.println("ERRO! Mínimo de 2 PC's para finalização da compra");
                    opcao = -1;
                }
                else{
                    System.out.println("Compra finalizada com sucesso!");
                    break;
                }
            }
            else
                System.out.println("Opção Inválida! TENTE NOVAMENTE..");
        }
        while(opcao != 0);

        cliente.setComputadores(carrinho);

        System.out.println("\n======> RESUMO DA COMPRA <======");
        System.out.println("Dados do Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("\nOs PC's adquiridos:");

        for(Computador computador : cliente.getComputadores())
        {
            if(computador != null)
            {
                computador.mostraPCConfigs();
            }
        }

        System.out.print("\nVALOR FINAL: ");
        System.out.println(cliente.calculaTotalCompra());
        System.out.println("============================");

        ProcessarPedido.processar(cliente.getComputadores());




    }
}
