package Model.Entities;

import java.util.Objects;

public class Candidatos {

    //Atributos
    private String name;
    private int votos;

    //Construtor
    public Candidatos(String name, int votos) {
        this.name = name;
        this.votos = votos;
    }

    //Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Candidatos that = (Candidatos) o;
        return Objects.equals(name, that.name);
    }

    //Hashcode
    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
