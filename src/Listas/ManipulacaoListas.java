package Listas;

import java.util.ArrayList;
import java.util.List;

public class ManipulacaoListas {

    public static IRetornar<List<String>,List<String>> retornarListaTamanho(int tamanho) {
        return (stringList) -> stringList.stream().filter(p -> p.length() <= tamanho).toList();
    }

    public static IRetornar<Integer,List<Integer>> retornarListaSoma() {
        return (integerList) -> integerList.stream().reduce(0,Integer::sum);
    }
}
