package POO;

public class Transacao {

    private EnumTipo enumTipo;

    private Double valor;

    public Transacao(EnumTipo enumTipo, Double valor) {
        this.enumTipo = enumTipo;
        this.valor = valor;
    }

    public EnumTipo getEnumTipo() {
        return this.enumTipo;
    }

    public Double getValor() {
        return this.valor;
    }
}
