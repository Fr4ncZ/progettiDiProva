package corsojava.ESERCIZIVARI.catalogo.plutone;

import java.io.*;
import java.util.*;


public class Prodotto   {
    private final String id;
    private final String nome;
    private final String categoria;

    public Prodotto(String id, String nome, String categoria) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getId()
    {return id;}
    public String getNome()
    {return nome;}
    public String getCategoria()
    {return categoria;}

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Prodotto)) return false;

        Prodotto prodotto = (Prodotto) o;

        return id.equals(prodotto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }

}
