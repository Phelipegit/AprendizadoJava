package Listas;

import java.util.ArrayList;
import java.util.List;

public class ManipulacaoListas {

    private static List<String> stringList = new ArrayList<>(List.of("Ana","Roberto","Phelipe","Silvania","Vitor"));
    private static List<Integer> integerList = new ArrayList<>(List.of(3,5,6,7,3,2,5,7,8,1,1,3,4,6,7,3,3));

    public static void main(String[] args) {
        List<String> lista = retornarListaTamanho(6).retornar();
        Integer soma = retornarListaSoma().retornar();

        System.out.println(lista);
        System.out.println(soma);
    }

    public static IRetornar<List<String>> retornarListaTamanho(int tamanho) {
        return () -> stringList.stream().filter(p -> p.length() <= tamanho).toList();
    }

    public static IRetornar<Integer> retornarListaSoma() {
        return () -> integerList.stream().reduce(0,Integer::sum);
    }
}
