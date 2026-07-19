package EmpresaLocadoraVeiculos;

import Adminstrador.*;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Veiculo[] veiculos = new Veiculo[6];
        veiculos[0] = new Caminhao(8000.00, "ASD-4444", "Caminhão", 4);
        veiculos[1] = new Caminhao(6000.00, "QWE-3333", "Caminhão", 3);
        veiculos[2] = new Caminhao(4000.00, "ZXC-2222", "Caminhão", 2);
        veiculos[3] = new Van(14, "ASD-1515", "Van", true);
        veiculos[4] = new Van(13, "ASD-1313", "Van", true);
        veiculos[5] = new Van(10, "ZXC-1010", "Van", false);

        System.out.println("*******************************************************");
        System.out.println("******** Bem-Vindo! A locadora de veículos ************");

        int escolha;
        double horas;
        ServicoManutencao servicoManutencao = new ServicoManutencao();

        System.out.println("*******************************************************");
        System.out.println();
        System.out.println("***** Qual categoria do veiculo gostaria de alugar *****");
        System.out.println("1- Caminhão:");
        System.out.println("2- Van de passeio:");
        int categoria = input.nextInt();
        int contadora = 1;

        for (int i = 0; i < veiculos.length; i++) {
            if (categoria != 1 && categoria != 2) {
                System.out.println("***** Erro! Opção invalida. *****");
            }
            if (categoria == 1 && veiculos[i] instanceof Caminhao caminhao) {
                System.out.println("*******************************************************");
                System.out.println("***** " + contadora + "-" + caminhao.getVeiculo() + " *****");
                System.out.println("***** Quantidade de eixos: " + caminhao.getQuantidadeDeEixos());
                System.out.println("***** Capacidade de Kg: " + String.format("%.2f", caminhao.getCapacidadeCarga()));
                contadora++;
            }
            if (categoria == 2 && veiculos[i] instanceof Van van) {
                System.out.println("*******************************************************");
                System.out.println("***** " + contadora + "-" + van.getVeiculo() + " *****");
                System.out.println("***** Quantidade de assentos: " + van.getCapacidaDePessoa());
                System.out.println("**** Ar-condicionado: " + van.isPossuiRefrigeracao());
                contadora ++;
            }
        }

        System.out.println();
        System.out.println("*********************************************************************************");
        System.out.println("***** Qual destes veículos atenderia sua necessidade hoje? *****");
        System.out.println("***** Digite a numeração referent ao veiculo desejado  *(ex: 1 )* *****");
        escolha = input.nextInt();
        int correspondencia = 1;
        Veiculo veiculoEscolhido = null;
        for (int i = 0; i < veiculos.length; i++) {
            if(categoria == 1 && veiculos[i] instanceof Caminhao){
                if(correspondencia == escolha){
                    veiculoEscolhido = veiculos[i];
                    break;
                }
                correspondencia ++;
            }
            if (categoria == 2 && veiculos[i] instanceof Van){
                if(correspondencia == escolha){
                    veiculoEscolhido = veiculos[i];
                    break;
                }
                correspondencia ++;
            }
        }

        System.out.println(veiculoEscolhido.toString());
        double preco = 0;
        if (veiculoEscolhido instanceof Caminhao caminhao){
            veiculoEscolhido.preco(caminhao.getQuantidadeDeEixos());
            preco = caminhao.getPrecoCaminhao();
        }
        if (veiculoEscolhido instanceof Van van){
            preco = van.getPrecoVan();
            veiculoEscolhido.preco(van.getCapacidaDePessoa());
        }
        System.out.println("Preço por horas: R$ " + String.format("%.2f", preco));
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("Quantas horas precisaria para o seu serviço? ");
        horas = input.nextDouble();
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("************* Contrato do aluguel ****************");
        System.out.println(veiculoEscolhido.toString());
        System.out.println("Tempo de locação: " + String.format("%.2f", horas) + " horas");
        System.out.println("Preço por horas: R$ " + String.format("%.2f", preco));
        System.out.println("Valor total do  aluguel: R$" + String.format("%.2f", veiculoEscolhido.precoPorHoras(horas)));
        System.out.println("******************************************************************");
        System.out.printf("***** O custo total da manutenção deste aluguel sera: %.2f *****%n",servicoManutencao.calcularCustoManutencao(horas, veiculoEscolhido.calcularCustoManutencao()));
        System.out.println("******************************************************************");

        input.close();
    }
}
