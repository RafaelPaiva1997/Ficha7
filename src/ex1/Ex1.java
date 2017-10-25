package ex1;

import java.util.LinkedList;

/**
 * Created by Carlos on 23/10/2017.
 */
public class Ex1 {

    public static void main(String[] args) {
        LinkedList<Animal> animals = new LinkedList<>();
        animals.add(new Ave(1,"pomba"));
        animals.add(new Mamífero(2,"homem"));
        animals.add(new Peixe(3,"bacalhau"));
        animals.add(new Reptil(4,"cobra"));
        for (Animal a : animals)
            a.desloca();
    }
}
