package personnages.nonjoueur;

import java.io.Serializable;

import personnages.Combattant;

public class Monstre extends PersonnageNonJoueur implements Combattant, Serializable {

	private int pvActuel;
	private int level;
	private int force;
	private int intelligence;
	private int agilite;
	private String name;
	private int niveauDepart;

	public Monstre(int intelligence, int agilite, int force, int level, int pvMax, int niveau, String name) {
		this.force = force;
		this.agilite = agilite;
		this.intelligence = intelligence;
		this.name = name;
		this.niveauDepart = niveauDepart;
		this.level = niveau;
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

	@Override
	public int getPV() {
		// TODO Auto-generated method stub
		return pvActuel;
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return level;
	}

	@Override
	public int getAgilite() {
		// TODO Auto-generated method stub
		return agilite;
	}

	@Override
	public int getForce() {
		// TODO Auto-generated method stub
		return force;
	}

	@Override
	public int getIntelligence() {
		// TODO Auto-generated method stub
		return intelligence;
	}

	public String toString() {

		return "Vous avez rencontré un monstre, il s'agit d'un :" + this.name + " !";
	}

}
