package Adminstrador;

public class Caminhao extends Veiculo {
    private int quantidadeDeEixos;
    private double capacidadeCarga;
    private double precoCaminhao;

    public Caminhao() {
        super();
    }

    public Caminhao(double capacidadeCarga, String placa, String veiculo, int quantidadeDeEixos) {
        super( placa,veiculo);
        this.quantidadeDeEixos = quantidadeDeEixos;
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString() {
        return
                super.toString() + '\n' +
                "Quantidade De Eixos: " + quantidadeDeEixos + '\n' +
                "Capacidade max de Kg: " + String.format("%.2f",capacidadeCarga);
    }

    @Override
    public double calcularCustoManutencao() {
        return 500 + (quantidadeDeEixos * 100);
    }

    @Override
    public double precoPorHoras(double horas) {
        return horas * precoCaminhao;
    }

    @Override
    public void preco(int eixos) {
        if (eixos == 2) {
            precoCaminhao = 80.00;
        } else if (eixos == 3) {
            precoCaminhao = 100.00;
        } else {
            precoCaminhao = 150.00;
        }
    }


    public int getQuantidadeDeEixos() {
        return quantidadeDeEixos;
    }

    public void setQuantidadeDeEixos(int quantidadeDeEixos) {
        this.quantidadeDeEixos = quantidadeDeEixos;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getPrecoCaminhao() {
        return precoCaminhao;
    }

    public void setPrecoCaminhao(double precoCaminhao) {
        this.precoCaminhao = precoCaminhao;
    }
}
