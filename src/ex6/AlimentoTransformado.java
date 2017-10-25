package ex6;

/**
 * Created by Carlos on 23/10/2017.
 */
public abstract class AlimentoTransformado extends Alimento {

    protected double pesoBruto;
    protected double custoMédioTransformacaoKG;

    @Override
    public String toString() {
        return super.toString() +
                "\nPeso Bruo: " + pesoBruto + "Kgs" +
                "\nCusto Médio Transformação: " + custoMédioTransformacaoKG + "€/Kg";
    }

    @Override
    public int custoFinal() {
        Double out = custoMédioTransformacaoKG;
        return super.custoFinal() + out.intValue();
    }
}
