package vues;
import javax.swing.JFrame;

public class TheMain {

	public static void main(String[] args) {
		// Test de la vue personne
		JFrame fenetre = new JFrame();
		PersonneJPA c = new PersonneJPA();
		fenetre.setContentPane(c);
		fenetre.setVisible(true);
		
		// Test de la vue compétences
		JFrame fenetreCpt = new JFrame();
		CompetenceJP cpt = new CompetenceJP();
		fenetreCpt.setContentPane(cpt);
		fenetreCpt.setVisible(true);
	}
}
