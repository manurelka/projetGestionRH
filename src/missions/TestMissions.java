package missions;

import ressources.Competence;
import ressources.DomaineCompetences;
import ressources.ListePersonnes;
import ressources.Personne;

public class TestMissions {

	public static void main(String[] args) {
		//Test class MissionRealisation
		MissionRealisation mission = new MissionRealisation("Mission Test", 10, 12, 3, 2017, 20);
		MissionFormation formation = new MissionFormation("Formation Test", 5, 12, 3, 2017, 2);
		mission.afficher();
		formation.afficher();
		
		Competence competenceA = new Competence(DomaineCompetences.A, 5, "LibGB", "LibFR");
		Competence competenceB = new Competence(DomaineCompetences.B, 5, "LibGB", "LibFR");
		Competence competenceC = new Competence(DomaineCompetences.C, 5, "LibGB", "LibFR");
		
		mission.addPlan(competenceA, 2);
		mission.addPlan(competenceB, 3);
		mission.addPlan(competenceC, 5);
		
		formation.add(competenceA);
		formation.add(competenceB);
		
		ListePersonnes personnes = new ListePersonnes();
		personnes.ajouter(new Personne("Manuela", "Ivanova", 1, 9, 8, 2011));
		personnes.get(1).ajouterCompetence(competenceC);
		personnes.get(1).ajouterCompetence(competenceA);
		personnes.get(1).ajouterCompetence(competenceB);
		personnes.ajouter(new Personne("Pepi", "Nikolov", 2, 10, 8, 2011));
		personnes.get(2).ajouterCompetence(competenceC);
		personnes.ajouter(new Personne("Hristo", "Nikolov", 3, 10, 8, 2011));
		personnes.get(3).ajouterCompetence(competenceC);
		personnes.ajouter(new Personne("Ivan", "Ivanov", 4, 10, 8, 2011));
		personnes.get(4).ajouterCompetence(competenceC);
		personnes.ajouter(new Personne("Ivan", "Petrov", 5, 10, 8, 2008));
		personnes.get(5).ajouterCompetence(competenceC);
		personnes.ajouter(new Personne("Peter", "Petrov", 6, 10, 8, 2008));
		personnes.get(6).ajouterCompetence(competenceA);
		personnes.ajouter(new Personne("Peter", "Nikolov", 7, 10, 8, 2008));
		personnes.get(7).ajouterCompetence(competenceA);
		personnes.ajouter(new Personne("Alexander", "Manev", 8, 10, 8, 2008));
		personnes.get(8).ajouterCompetence(competenceB);
		personnes.ajouter(new Personne("George", "Kostov", 9, 10, 8, 2008));
		personnes.get(9).ajouterCompetence(competenceB);
		personnes.ajouter(new Personne("Peter", "Todorov", 10, 20, 8, 2008));
		personnes.get(10).ajouterCompetence(competenceB);
		personnes.ajouter(new Personne("Peter", "Manev", 11, 20, 8, 2008));
		personnes.get(11).ajouterCompetence(competenceB);
		personnes.get(11).ajouterCompetence(competenceC);
		personnes.get(11).ajouterCompetence(competenceA);
		personnes.ajouter(new Personne("Jordan", "Manev", 12, 20, 8, 2008));
		personnes.get(12).ajouterCompetence(competenceA);
		personnes.ajouter(new Personne("Apostol", "Pavlov", 13, 20, 8, 2008));
		personnes.get(13).ajouterCompetence(competenceC);
		personnes.ajouter(new Personne("Angel", "Vulchanov", 14, 20, 8, 2008));
		personnes.get(14).ajouterCompetence(competenceA);
		personnes.ajouter(new Personne("Genadi", "Vulkov", 15, 20, 8, 2008));
		personnes.get(15).ajouterCompetence(competenceC);
		personnes.get(15).ajouterCompetence(competenceA);
		personnes.ajouter(new Personne("Ginka", "Liubenova", 16, 20, 8, 2008));
		personnes.get(16).ajouterCompetence(competenceA);
		
		personnes.afficher();
		/*
		personnes.ajouter(new Personne("Manuela", "Ivanova", 1, 9, 8, 2011));
		personnes.get(1).ajouterCompetence(competenceC);
		personnes.get(1).ajouterCompetence(competenceB);
		personnes.get(1).ajouterCompetence(competenceA);
		personnes.ajouter(new Personne("Pepi", "Nikolov", 2, 10, 8, 2011));
		personnes.get(2).ajouterCompetence(competenceA);
		personnes.get(2).ajouterCompetence(competenceC);
		personnes.ajouter(new Personne("Hristo", "Nikolov", 3, 10, 8, 2011));
		personnes.get(3).ajouterCompetence(competenceC);
		personnes.ajouter(new Personne("Ivan", "Ivanov", 4, 10, 8, 2011));
		personnes.get(4).ajouterCompetence(competenceB);
		personnes.get(4).ajouterCompetence(competenceC);
		personnes.ajouter(new Personne("Ivan", "Petrov", 5, 10, 8, 2008));
		personnes.get(5).ajouterCompetence(competenceB);
		personnes.get(5).ajouterCompetence(competenceC);
		personnes.ajouter(new Personne("Peter", "Petrov", 6, 10, 8, 2008));
		personnes.get(6).ajouterCompetence(competenceB);
		personnes.get(6).ajouterCompetence(competenceA);
		personnes.ajouter(new Personne("Peter", "Nikolov", 7, 10, 8, 2008));
		personnes.get(7).ajouterCompetence(competenceB);
		personnes.get(7).ajouterCompetence(competenceA);
		personnes.ajouter(new Personne("Alexander", "Manev", 8, 10, 8, 2008));
		personnes.get(8).ajouterCompetence(competenceB);
		personnes.ajouter(new Personne("George", "Kostov", 9, 10, 8, 2008));
		personnes.get(9).ajouterCompetence(competenceB);
		personnes.ajouter(new Personne("Peter", "Todorov", 10, 20, 8, 2008));
		personnes.get(10).ajouterCompetence(competenceB);
		personnes.ajouter(new Personne("Peter", "Manev", 11, 20, 8, 2008));
		personnes.get(10).ajouterCompetence(competenceB);
		*/
		mission.recommander(personnes).afficher();
		mission.affecter(mission.recommander(personnes));
		//mission.recommander(personnes).afficher(); // n'est plus possible puisqu'on a affecté du personnel :)
		
		formation.recommander(personnes).afficher();
		formation.affecter(formation.recommander(personnes));
		formation.recommander(personnes);
	}

}
