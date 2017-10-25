package ex6;

/**
 * Created by Carlos on 23/10/2017.
 */
public abstract class Alimento {

    protected String descricao;
    protected String origem;
    protected double peso;
    protected double taxaIva;
    protected double precoAquisicaoKG;

    @Override
    public String toString() {
        return "\nDescrição: " + descricao +
                "\nOrigem: " + origem +
                "\nPeso: " + peso + "Kgs" +
                "\nTaxa Iva: " + taxaIva + "%" +
                "\nPreço Aquisição: " + precoAquisicaoKG + "€/Kg";
    }

    public int custoFinal() {
        Double out = precoAquisicaoKG + taxaIva*precoAquisicaoKG;
        return out.intValue();
    }
}
