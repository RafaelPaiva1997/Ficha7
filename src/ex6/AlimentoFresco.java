package ex6;

/**
 * Created by Carlos on 23/10/2017.
 */
public class AlimentoFresco extends Alimento {

    private double custoEmbalamentoKG;

    @Override
    public String toString() {
        return "ALIMENTO FRESCO" +
                super.toString() +
                "\nCusto Embalamento: " + custoEmbalamentoKG + "€/Kg";
    }
}
