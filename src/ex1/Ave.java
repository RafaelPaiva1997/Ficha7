package ex1;

/**
 * Created by Carlos on 23/10/2017.
 */
public class Ave extends Animal {
    public Ave(int id, String tipo) {
        super(id, tipo);
    }

    @Override
    public void desloca() {
        System.out.print("Ave a voar.\n");
    }
}
