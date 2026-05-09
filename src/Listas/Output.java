package Listas;

import java.util.ArrayList;
import java.util.List;

public class Output {

    private static List<String> list = new ArrayList<>(List.of("Ana","fjdfshd","cmc","ruweurwerhewhr","fusfh","8rewurweu","cvjcj"));

    private static List<Integer> listaInteger = new ArrayList<>(List.of(4,6,78,2,4,6,4,23,5,7));

    public static void main(String[] args) {
        List<String> stringList = ManipulacaoListas.retornarListaTamanho(5).retornar(list);

        Integer somaLista = ManipulacaoListas.retornarListaSoma().retornar(listaInteger);
    }
}
