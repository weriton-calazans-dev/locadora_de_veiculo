package Adimistrador;

import ContratosInterface.Contratos;

public abstract class Veiculo implements Contratos {
    private String veiculo;
    private String placa;
    private double capacidadeCarga;
    private int capacidadePessoa;

    public Veiculo() {
    }

    public Veiculo(int capacidadePessoa, String placa, String veiculo) {
        this.capacidadePessoa = capacidadePessoa;
        this.placa = placa;
        this.veiculo = veiculo;
    }

    public Veiculo(double capacidadeCarga, String placa, String veiculo) {
        this.veiculo = veiculo;
        this.capacidadeCarga = capacidadeCarga;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo: " + veiculo + '\n' +
                "Capacidade da carga: " + String.format("%.2f",capacidadeCarga) + " Kg" + '\n' +
                "Placa: " + placa ;
    }

    public int getCapacidadePessoa() {
        return capacidadePessoa;
    }

    public void setCapacidadePessoa(int capacidadePessoa) {
        this.capacidadePessoa = capacidadePessoa;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
