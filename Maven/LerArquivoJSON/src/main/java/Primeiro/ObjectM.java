package Primeiro;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ObjectM {

    public static void main(String[] args) throws IOException {
        processarDados();
    }

    public static void processarDados() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        RecordClass obj = objectMapper.readValue(new File("src/main/java/ex.json"),RecordClass.class);

        CExample cExample = new CExample(obj.nome(),obj.idade(), obj.setor());

        System.out.println(cExample.getIdade());

    }
}
