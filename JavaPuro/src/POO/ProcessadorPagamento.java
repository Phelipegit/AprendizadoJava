package POO;

import java.util.List;

public class ProcessadorPagamento {

    public static String calcularSituacao(Transacao transacao) {
        if(transacao.getValor() > 0 && transacao.getValor() < 1000000) {
            return "Aprovada";
        } else {
            return "Reprovada";
        }
    }

    public static Double calcularValorFinal(Transacao transacao) {
        return transacao.getValor() + (transacao.getValor()) * (transacao.getEnumTipo().getTaxa()/100);
    }

    public static void processarPagamento(List<Transacao> list) {
        list.forEach(element -> {
            System.out.println(element.getEnumTipo() + ":" + calcularValorFinal(element) + " " + calcularSituacao(element));
        });
    }
}
