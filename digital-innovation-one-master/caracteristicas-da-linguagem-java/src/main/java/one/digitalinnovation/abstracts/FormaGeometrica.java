package one.digitalinnovation.abstracts;

public abstract class FormaGeometrica {

    public abstract String nome(); //Se os metodos sao abstratos ele não tem corpo
    public abstract Double area();

    public String desenha(int x , int y) {
        return "Desenhando nas coordenadas X="+x+" Y:"+y;
    }
}
