package personnages.joueur;

import java.io.Serializable;
import personnages.Combattant;

public abstract class PersonnageJoueur implements Combattant, Serializable {

	private int xp;
	private String name;
	private int intelligence;
	private int agilite;
	private int force;
	protected int niveauActuel = 1;
	private int pvActuel;
	private int pvMax;
	private int gainForceParNiveau;
	private int gainIntelligenceParNiveau;
	private int gainAgiliteParNiveau;
	private int gainPvMaxParNiveau;
	private String nomClasse;

	public PersonnageJoueur(int force, int agilite, int intelligence, int pvActuel, int gainForceParNiveau,
			int gainIntelligenceParNiveau, int gainAgiliteParNiveau, int gainPvMaxParNiveau, String name,
			String nomClasse) {
		this.force = force;
		this.agilite = agilite;
		this.intelligence = intelligence;
		this.pvActuel = pvActuel;
		this.pvMax = pvActuel;
		this.name = name;
		this.xp = 0;
		this.gainForceParNiveau = gainForceParNiveau;
		this.gainIntelligenceParNiveau = gainIntelligenceParNiveau;
		this.gainAgiliteParNiveau = gainAgiliteParNiveau;
		this.gainPvMaxParNiveau = gainPvMaxParNiveau;
		this.nomClasse = nomClasse;
	}

	@Override
	public void effectuerAttaquePhysique(Combattant opposant) {
		opposant.encaisserAttaquePhysique(force);
	}

	@Override
	public void effectuerAttaqueMagique(Combattant opposant) {
		opposant.encaisserAttaquePhysique(intelligence);
	}

	@Override
	public void encaisserAttaquePhysique(int ptsDegats) {
		this.pvActuel -= ptsDegats;
	}

	@Override
	public void encaisserAttaqueMagique(int ptsDegats) {
		this.pvActuel -= ptsDegats;
	}

	public void recevoirSoin() {
		if (1.25 * this.getPV() < getPvMax()) {
			setPv((int) (1.25 * pvActuel));
		} else {
			this.setPv(getPvMax());
		}
	}

	public void gagnerExperience(Combattant opposant) {
		int experienceGagne = opposant.getLevel() * 10;
		if (!opposant.isAlive()) {
			this.setXp(this.getXp() + experienceGagne);
			System.out.println(this.getName() + " a gagné " + experienceGagne + " points d'experiences!!");
		}
		;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getAgilite() {
		return agilite;
	}

	public void setAgilite(int agilite) {
		this.agilite = agilite;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getLevel() {
		return niveauActuel;
	}

	public void setLevel(int level) {
		this.niveauActuel = level;
	}

	public int getPV() {
		return pvActuel;
	}

	public void setPv(int pv) {
		this.pvActuel = pv;
	}

	public void setPvMax(int augmentationPvMax) {
		this.pvMax += pvMax;
	}

	public int getPvMax() {
		return this.pvMax;
	}

	public String toString() {

		return this.name + " ";
	}

	public void gagnerNiveau(boolean bonusDuCoach) {
		if ((int) (this.getXp() / 100) >= 1 || bonusDuCoach) {
			setLevel(++niveauActuel);
			this.setPvMax(getPvMax() + this.gainPvMaxParNiveau);
			this.setPv(this.getPV() * 2);
			this.setForce(this.getForce() + this.gainForceParNiveau);
			this.setAgilite(this.getAgilite() + this.gainAgiliteParNiveau);
			this.setIntelligence(this.getForce() + this.gainIntelligenceParNiveau);
			System.out.println(this.name + " vient de gagner un niveau!");
			this.setXp(this.getXp() % 50);
		}
	}

	public String getNomClasse() {
		return this.nomClasse;
	}
}
