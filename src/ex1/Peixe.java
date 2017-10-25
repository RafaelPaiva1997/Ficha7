package ex1;

/**
 * Created by Carlos on 23/10/2017.
 */
public class Peixe extends Animal {
    public Peixe(int id, String tipo) {
        super(id, tipo);
    }

    @Override
    public void desloca() {
        System.out.print("Peixe a nadar.\n");
    }
}
