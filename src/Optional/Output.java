package Optional;

import java.util.Optional;

public class Output {

    public static void main(String[] args) {
        Methods methods = new Methods();

        //METHOD 1
        Optional<String> stringOptional = methods.devolverNomeUsuario("Phelipe");

        if(stringOptional.isPresent()) {
            String nome = stringOptional.get();
            System.out.println(nome);
        } else {
            System.out.println("Usuário não encontrado");
        }

        //METHOD 2
        Optional<>
    }
}
