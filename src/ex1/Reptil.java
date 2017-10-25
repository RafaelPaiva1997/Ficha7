package ex1;

/**
 * Created by Carlos on 23/10/2017.
 */
public class Reptil extends Animal {
    public Reptil(int id, String tipo) {
        super(id, tipo);
    }

    @Override
    public void desloca() {
        System.out.print("Reptil a rastejar.\n");
    }
}
