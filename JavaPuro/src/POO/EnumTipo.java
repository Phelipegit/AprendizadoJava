package POO;

public enum EnumTipo {
    PIX("Pix",1.00),CARTAO("Cartao",2.50);

    private String desc;

    private Double taxa;

    EnumTipo(String desc, Double taxa) {
        this.desc = desc;
        this.taxa = taxa;
    }

    public String getDesc() {
        return this.desc;
    }

    public Double getTaxa() {
        return this.taxa;
    }
}
