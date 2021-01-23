package one.digitalinnovation.interfaces;

public class Gol implements Carro {

    @Override //Override é sobrescrever o método
    public String marca() {

        return "Volkswagen";
    }

    @Override
    public Double valor() {
        return null;
    }
}
