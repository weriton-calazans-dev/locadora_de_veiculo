package Adimistrador;

public class Van extends Veiculo{
    private boolean possuiRefrigeracao;
    private int capacidaDePessoa;

    public Van(int capacidaDePessoas, String placa, String veiculo, boolean possuiRefrigeracao) {
        super( placa,veiculo);
        this.possuiRefrigeracao = possuiRefrigeracao;
        this.capacidaDePessoa = capacidaDePessoas;
    }


    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Capacidade por pessoas: " + capacidaDePessoa  + '\n' +
                "Possui Refrigeração: " + possuiRefrigeracao;
    }

    public boolean isPossuiRefrigeracao() {
        return possuiRefrigeracao;
    }

    public void setPossuiRefrigeracao(boolean possuiRefrigeracao) {
        this.possuiRefrigeracao = possuiRefrigeracao;
    }

    public int getCapacidaDePessoa() {
        return capacidaDePessoa;
    }

    public void setCapacidaDePessoa(int capacidaDePessoa) {
        this.capacidaDePessoa = capacidaDePessoa;
    }
}
