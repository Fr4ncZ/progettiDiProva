package corsojava.ESERCIZIVARI.catalogo.plutone;

import java.io.*;
import java.util.*;

public class CatalogoProdotti   {

    private final Map<String, Prodotto> prodotti = new HashMap<>();
    private final Map<String, Set<Prodotto>> prodottiPerCategoria = new HashMap<>();

    public void aggiungiProdotto(Prodotto prodotto) {
     prodotti.put(prodotto.getId(), prodotto);
     prodottiPerCategoria.computeIfAbsent(prodotto.getCategoria(), k -> new HashSet<>()).add(prodotto);
    }

    public boolean rimuoviProdotto(String id) {
        Prodotto prodotto = prodotti.remove(id);
        boolean retval = false;
        if (prodotto != null) {
            Set<Prodotto> prodottiCategoria = prodottiPerCategoria.get(prodotto.getCategoria());
            if (prodottiCategoria != null) {
                prodottiCategoria.remove(prodotto);
                if (prodottiCategoria.isEmpty()) {
                    prodottiPerCategoria.remove(prodotto.getCategoria());
                }
                retval = true;
            }
        }
        return retval;
    }

    public Prodotto cercaProdotto(String id) {
        return prodotti.get(id);
    }

    public Set<Prodotto> ProdottiPerCategoria(String categoria) {
        return prodottiPerCategoria.getOrDefault(categoria, Collections.emptySet());
    }

    public void salvaSuDisco(String filePath) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(this);
        }
    }

    public static CatalogoProdotti caricaDaDisco(String filePath) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (CatalogoProdotti) ois.readObject();
        }
    }

}
