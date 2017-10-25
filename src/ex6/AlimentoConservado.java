package ex6;

/**
 * Created by Carlos on 23/10/2017.
 */
public class AlimentoConservado extends AlimentoTransformado {

    private double valorProdutoConservaKG;

    @Override
    public String toString() {
        return "ALIMENTO CONSERVADO" +
                super.toString() +
                "\nValor Produto Conserva: " + valorProdutoConservaKG + "€/Kg";
    }

    @Override
    public int custoFinal() {
        Double out = valorProdutoConservaKG + taxaIva*valorProdutoConservaKG;
        return super.custoFinal() + out.intValue();
    }
}
