package corsojava.ESERCIZIVARI.animali.dina;
public class TestAnimali {
    public static void main(String[] args) {
        Cane cane = new Cane("Fido");
        Uccello uccello = new Uccello("Tweety");
        Pesce pesce = new Pesce("Nemo");

        Zoo zoo = new Zoo();
        zoo.aggiungiAnimale(new Cane("Fido"));
        zoo.aggiungiAnimale(uccello);
        zoo.aggiungiAnimale(pesce);

        zoo.mostraTutti();

        
        zoo.vola("Tweety");
        zoo.vola("Nemo");
        zoo.vola("Neasdamo");
        
        

        cane.riportaOggetto();
        uccello.vola();
        pesce.nuota();
    }
}