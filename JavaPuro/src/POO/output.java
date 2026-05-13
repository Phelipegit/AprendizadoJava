package POO;

import java.util.ArrayList;
import java.util.List;

public class output {

    private static List<Integer> listaInteger = new ArrayList<>(List.of(3,5,6,4,2,2,4,6,7,4));
    private static List<Transacao> list = new ArrayList<>(List.of(new Transacao(EnumTipo.PIX,3000.00),new Transacao(EnumTipo.CARTAO,500.00)));
    public static void main(String[] args) {
        ProcessadorPagamento.processarPagamento(list);

        Double result = list.stream().map(Transacao::getValor).reduce((0.0),Double::sum);

        System.out.println(result);
    }
}
