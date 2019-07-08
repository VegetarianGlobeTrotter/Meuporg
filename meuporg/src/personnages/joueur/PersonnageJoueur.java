package personnages.joueur;

import java.io.Serializable;

import personnages.Combattant;

public abstract class PersonnageJoueur implements Combattant, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int xp;
	private String name;
	private int intelligence;
	private int agilite;
	private int force;
	private int niveauActuel;
	private int niveauDepart;
	private int pvActuel;
	private int pvMax;

	public PersonnageJoueur(int force, int agilite, int intelligence, int pvActuel, int niveauDepart, String name) {
		this.force = force;
		this.agilite = agilite;
		this.intelligence = intelligence;
		this.pvActuel = pvActuel;
		this.name = name;
		this.niveauDepart = niveauDepart;
		this.xp = 0;

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

	public void gagnerNiveau() {
		setLevel(++niveauActuel);
	}

	public void recevoirSoin() {
		setPv((int) (1.25 * pvActuel));
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

	public int getNiveauDepart() {
		return niveauDepart;
	}

	public void setNiveauDepart(int niveauDepart) {
		this.niveauDepart = niveauDepart;
	}

	public boolean estEnVie() {
		if (getPV() > 0) {
			return true;
		}
		return false;
	}

}
