package Segundo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ObjectM {

    public static CUsuario processarObject() throws IOException, InterruptedException {
        ObjectMapper objectMapper = new ObjectMapper();

        RecordClass record = objectMapper.readValue(RequisicaoApi.devolverDados(),RecordClass.class);

        return new CUsuario(record.id(),record.name(),record.username(),record.email(),record.website());
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        CUsuario usuario = processarObject();

        System.out.println(usuario.getId());
    }
}
