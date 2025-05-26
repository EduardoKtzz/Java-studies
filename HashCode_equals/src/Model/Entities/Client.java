package Model.Entities;

import java.util.Objects;

public class Client {

    //Atributos
    private String name;
    private String email;

    //Equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(email, client.email);
    }

    //hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    //Construtor
    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Getters e Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
