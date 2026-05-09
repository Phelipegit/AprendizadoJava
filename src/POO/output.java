package POO;

import java.util.ArrayList;
import java.util.List;

public class output {

    private static List<Transacao> list = new ArrayList<>(List.of(new Transacao(EnumTipo.PIX,300000000.00),new Transacao(EnumTipo.CARTAO,500.00)));
    public static void main(String[] args) {
        ProcessadorPagamento.processarPagamento(list);
    }
}
