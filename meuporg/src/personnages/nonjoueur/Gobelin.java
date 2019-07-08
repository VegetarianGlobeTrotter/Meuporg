package personnages.nonjoueur;

public class Gobelin extends Monstre {

	private static int niveau = 1;
	private static String name = "Gobelin";
	private static int forceGobelin = 1;
	private static int intelligenceGobelin = 1;
	private static int agiliteGobelin = 1;
	private static int levelGobelin = 1;
	private static int pvMaxGobelin = 1;

	public Gobelin() {
		super(intelligenceGobelin, agiliteGobelin, forceGobelin, levelGobelin, pvMaxGobelin, niveau, name);
	}

}
