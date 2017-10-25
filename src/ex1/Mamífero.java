package ex1;

/**
 * Created by Carlos on 23/10/2017.
 */
public class Mamífero extends Animal {
    public Mamífero(int id, String tipo) {
        super(id, tipo);
    }

    @Override
    public void desloca() {
        System.out.print("Mamífero a andar.\n");
    }
}
