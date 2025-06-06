package corsojava.ESERCIZIVARI.animali.nora;

public class TestAnimali {

	public static void main(String[] args) {
			Zoo zoo = new Zoo(10);
			zoo.aggiungiAnimali(new Cane ("Adolfo","Onnivoro","Maschio","Pastore tedesco","Marroncino e Nero"));
			zoo.aggiungiAnimali(new Aquila ("Ezio","Carnivoro","Maschio","Aquila Reale","Nera"));
			zoo.aggiungiAnimali(new Pesce ("Nemo","Onnivoro","Femmina","Pagliaccio","Rosso"));
			
			
			zoo.mostraTuttiGliAnimali();
	
			 }

}
