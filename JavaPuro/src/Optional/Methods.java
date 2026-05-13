package Optional;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Methods {

    private static HashMap<Integer,String> listaMethod2 = new HashMap<>(Map.of(
            485,"Arroz",
            685,"Bolacha"));

    //Retorno do método protege contra NPE(NullPointerException),bastante utilizado em aplicações
    public Optional<String> devolverNomeUsuario(String nome) {
        return Optional.ofNullable(nome);
    }
}
