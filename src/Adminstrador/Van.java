package Adminstrador;

public class Van extends Veiculo{
    private boolean possuiRefrigeracao;
    private int capacidadeDePessoa;
    private double precoVan ;

    public Van() {
        super();
    }

    public Van(int capacidaDePessoas, String placa, String veiculo, boolean possuiRefrigeracao) {
        super( placa,veiculo);
        this.possuiRefrigeracao = possuiRefrigeracao;
        this.capacidadeDePessoa = capacidaDePessoas;
    }


    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Capacidade por pessoas: " + capacidadeDePessoa  + '\n' +
                "Possui Refrigeração: " + possuiRefrigeracao;
    }

    @Override
    public double calcularCustoManutencao() {
        if (possuiRefrigeracao == true) return 450;
        return 300 ;
    }

    @Override
    public void preco(int eixos){
        if (eixos == 10) {
            precoVan = 50.00;
        } else if (eixos == 13) {
            precoVan = 70.00;
        } else{
            precoVan = 100.00;
        }
    }
    @Override
    public double precoPorHoras(double horas) {
        return horas * precoVan;
    }

    public boolean isPossuiRefrigeracao() {
        return possuiRefrigeracao;
    }

    public void setPossuiRefrigeracao(boolean possuiRefrigeracao) {
        this.possuiRefrigeracao = possuiRefrigeracao;
    }

    public int getCapacidaDePessoa() {
        return capacidadeDePessoa;
    }

    public void setCapacidaDePessoa(int capacidaDePessoa) {
        this.capacidadeDePessoa = capacidaDePessoa;
    }

    public double getPrecoVan() {
        return precoVan;
    }

    public void setPrecoVan(double precoVan) {
        this.precoVan = precoVan;
    }
}
