package Adimistrador;

import ContratosInterface.Contratos;

public abstract class Veiculo implements Contratos {
    private String veiculo;
    private String placa;



    public Veiculo() {
    }

    public Veiculo( String placa, String veiculo) {
        this.placa = placa;
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Veiculo: " + veiculo + '\n' +
                "Placa: " + placa ;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
