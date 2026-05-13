package Segundo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record RecordClass(int id, String name, String username, String email,String website) {
}
