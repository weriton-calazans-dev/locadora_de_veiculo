package Adimistrador;

public class GerenciadorDeAlugueis {
    private double precoCaminhao;
    private double precoVan ;

    public void preco(int eixos){
        if (eixos == 2){
            precoCaminhao = 80.00;
        } else if (eixos == 3) {
            precoCaminhao = 100.00;
        }else {
            precoCaminhao = 150.00;
        }
        if (eixos == 10) {
            precoVan = 50.00;
        } else if (eixos == 13) {
            precoVan = 70.00;
        } else{
            precoVan = 100.00;
        }
    }
    public double precoPorHorasCaminhas(double horas){
        return horas * precoCaminhao;
    }
    public double precoPorHorasVan(double horas){
        return horas * precoVan;
    }

    @Override
    public String toString() {
        return  super.toString();
    }

    public double getPrecoCaminhao() {
        return precoCaminhao;
    }

    public void setPrecoCaminhao(double precoCaminhao) {
        this.precoCaminhao = precoCaminhao;
    }

    public double getPrecoVan() {
        return precoVan;
    }

    public void setPrecoVan(double precoVan) {
        this.precoVan = precoVan;
    }
}
