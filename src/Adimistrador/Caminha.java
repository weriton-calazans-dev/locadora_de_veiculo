package Adimistrador;

public class Caminha extends Veiculo {
    private int quantidadeDeEixos;
    private double capacidadeCarga;

    public Caminha(double capacidadeCarga, String placa, String veiculo, int quantidadeDeEixos) {
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
}
