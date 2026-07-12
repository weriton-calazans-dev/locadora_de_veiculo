package Adimistrador;

public class Van extends Veiculo{
    private boolean possuiRefrigeracao;

    public Van(int capacidadePessoas, String placa, String veiculo, boolean possuiRefrigeracao) {
        super(capacidadePessoas, placa,veiculo);
        this.possuiRefrigeracao = possuiRefrigeracao;
    }


    @Override
    public String toString() {
        return
                "Veiculo: " + super.getVeiculo() + '\n' +
                "Placa: " + super.getPlaca() + '\n' +
                "Capacidade por pessoas: " + super.getCapacidadePessoa() + '\n' +
                "Possui Refrigeração: " + possuiRefrigeracao;
    }

    public boolean isPossuiRefrigeracao() {
        return possuiRefrigeracao;
    }

    public void setPossuiRefrigeracao(boolean possuiRefrigeracao) {
        this.possuiRefrigeracao = possuiRefrigeracao;
    }
}
