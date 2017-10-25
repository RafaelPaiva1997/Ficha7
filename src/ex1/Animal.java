package ex1;

/**
 * Created by Carlos on 23/10/2017.
 */
public class Animal {

    private int id;
    private String tipo;

    public Animal(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public void desloca() {
        System.out.print("Animal a deslocar-se\n");
    }
}
