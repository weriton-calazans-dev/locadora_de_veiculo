package EmpresaLocadoraVeiculos;

import Adimistrador.Caminha;
import Adimistrador.GerenciadorDeAlugueis;
import Adimistrador.Van;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner imput = new Scanner(System.in);

        Caminha[] caminhas = new Caminha[3];
        caminhas[0] = new Caminha(8000.00,"ASD-4444","Caminhão",4);
        caminhas[1] = new Caminha(6000.00,"QWE-3333","Caminhão",3);
        caminhas[2] = new Caminha(4000.00,"ZXC-2222","Caminhão",2);

        Van[] vans = new Van[3];
        vans[0] = new Van(14,"ASD-1515","Van",true);
        vans[1] = new Van(13,"ASD-1313","Van",true);
        vans[2] = new Van(10,"ZXC-1010","Van",false);

        System.out.println("*******************************************************");
        System.out.println("******** Bem-Vindo! A locadora de veículos ************");
        char validacao = 'N';
        int escolha;
        double horas;
        GerenciadorDeAlugueis gerenciadorDeAlugueis = new GerenciadorDeAlugueis();

        do {
            System.out.println("***** Qual categoria do veiculo gostaria de alugar *****");
            System.out.println("1- Caminhão:");
            System.out.println("2- Van de passeio:");
            int categoria = imput.nextInt();

            switch(categoria){
                case 1:
                    for (int i = 0; i < caminhas.length; i++) {
                        System.out.println("*******************************************************");
                        System.out.println("***** "+ (i + 1) + "-" + caminhas[i].getVeiculo() + " *****");
                        System.out.println("***** Quantidade de eixos: " + caminhas[i].getQuantidadeDeEixos());
                        System.out.println("***** Capacidade de Kg: " + String.format("%.2f", caminhas[i].getCapacidadeCarga()));
                    }

                    System.out.println("***** Qual destes caminhão seria suficiente para transporta sua carga hoje? *****");
                    escolha = imput.nextInt();
                    escolha -= 1;
                    System.out.println(caminhas[escolha].toString());
                    gerenciadorDeAlugueis.preco(escolha);
                    System.out.println("Preço por horas: R$ " + String.format("%.2f",gerenciadorDeAlugueis.getPrecoCaminhao()));
                    System.out.println("Quantas horas precisaria para o seu serviço? ");
                    horas = imput.nextDouble();
                    System.out.println("********************************************");
                    System.out.println("***** Contrato do aluguel ****************");
                    System.out.println(caminhas[escolha].toString());
                    System.out.println("Tempo de locação: " + String.format("%.2f", horas) + " horas");
                    System.out.println("Preço por horas: R$ " + String.format("%.2f",gerenciadorDeAlugueis.getPrecoCaminhao()));
                    System.out.println("O valor do aluguel: R$" + String.format("%.2f",gerenciadorDeAlugueis.precoPorHorasCaminhas(horas)));
                    validacao = 'N';
                    break;
                case 2:
                     for (int i = 0; i < vans.length; i++) {
                        System.out.println("*******************************************************");
                        System.out.println("***** " + (i + 1) + "-" + vans[i].getVeiculo() + " *****");
                        System.out.println("***** Quantidade de acentos: " + vans[i].getCapacidadePessoa() );
                         System.out.println("**** Ar-condicionado: " + vans[i].isPossuiRefrigeracao());
                    }
                    System.out.println("***** Qual destas van seria suficiente para sua viajem hoje? *****");
                    escolha = imput.nextInt();
                    escolha -= 1;
                    System.out.println(vans[escolha].toString());
                    gerenciadorDeAlugueis.preco(vans[escolha].getCapacidadePessoa());
                    System.out.println("Preço por horas: R$ " + String.format("%.2f",gerenciadorDeAlugueis.getPrecoVan()));
                    System.out.println("Quantas horas precisaria para o sua viajem? ");
                    horas = imput.nextDouble();
                    System.out.println("********************************************");
                    System.out.println("***** Contrato do aluguel ****************");
                    System.out.println(vans[escolha].toString());
                    System.out.println("Tempo de locação: " + String.format("%.2f", horas) + " horas");
                    System.out.println("Preço por horas: R$ " + String.format("%.2f",gerenciadorDeAlugueis.getPrecoVan()));
                    System.out.println("Valor total do aluguel: R$" + String.format("%.2f",gerenciadorDeAlugueis.precoPorHorasVan(horas)));
                    validacao = 'N';
                    break;
                default:
                    System.out.println("***** Erro! Opção invalida. *****");
                    validacao = 'S';
            }

        } while (validacao == 'S');

        imput.close();
    }
}
