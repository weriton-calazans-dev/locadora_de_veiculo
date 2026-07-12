package Adimistrador;

public class Caminha extends Veiculo {
    private int quantidadeDeEixos;

    public Caminha(double capacidadeCarga, String placa, String veiculo, int quantidadeDeEixos) {
        super(capacidadeCarga, placa,veiculo);
        this.quantidadeDeEixos = quantidadeDeEixos;
    }


    @Override
    public String toString() {
        return
                super.toString() + '\n' +
                "Quantidade De Eixos: " + quantidadeDeEixos;
    }

    public int getQuantidadeDeEixos() {
        return quantidadeDeEixos;
    }

    public void setQuantidadeDeEixos(int quantidadeDeEixos) {
        this.quantidadeDeEixos = quantidadeDeEixos;
    }
}
