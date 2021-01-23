package aulas.oo.part04.exemploSuper;

public class Carro extends Veiculo {

    public Carro(String modelo, String marca, double valorVenal) {
        super(modelo, marca, valorVenal);
    }

    public Carro(String modelo, String marca, double valorVenal, int quantidadeDePortas) {
        super(modelo, marca, valorVenal); //focado no veículo - classe mãe
        this.quantidadeDePortas = quantidadeDePortas; //específico de carro
    }

    private int quantidadeDePortas;

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public double calculaImposto() {
        return this.getValorVenal() * 0.07;
    }
}
