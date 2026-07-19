package Adminstrador;

public class ServicoManutencao {

    public double calcularCustoManutencao(double horas, double precoFixo){
       return precoFixo / 24 * horas ;
    }
}
