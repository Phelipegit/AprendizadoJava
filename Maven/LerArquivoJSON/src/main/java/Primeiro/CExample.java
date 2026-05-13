package Primeiro;

public class CExample {
    private String nome;

    private Integer idade;

    private String setor;

    public CExample(String nome, Integer idade, String setor) {
        this.nome = nome;
        this.idade = idade;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getSetor() {
        return setor;
    }
}
