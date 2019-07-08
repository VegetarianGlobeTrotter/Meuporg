package personnages;

public interface Combattant {

	public void effectuerAttaquePhysique(Combattant opposant);

	public void effectuerAttaqueMagique(Combattant opposant);

	public void encaisserAttaquePhysique(int ptsDegats);

	public void encaisserAttaqueMagique(int ptsDegats);

	public int getPV();

	public int getLevel();

	public int getAgilite();

	public int getForce();

	public int getIntelligence();

	public default boolean isAlive() {
		if (getPV() > 0) {
			return true;
		}
		return false;
	}
}