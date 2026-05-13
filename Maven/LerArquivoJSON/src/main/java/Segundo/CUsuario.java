package Segundo;

public class CUsuario {
    private Integer id;

    private String name;

    private String username;

    private String email;

    private String website;

    public CUsuario(Integer id, String name, String username, String email, String website) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.website = website;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getWebsite() {
        return website;
    }
}
