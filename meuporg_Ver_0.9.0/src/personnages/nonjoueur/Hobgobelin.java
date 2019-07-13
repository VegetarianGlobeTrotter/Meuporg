package personnages.nonjoueur;

public class Hobgobelin extends Monstre {

	private static int intelligenceHobgobelin = 2;
	private static int agiliteHobgobelin = 2;
	private static int forceHobgobelin = 2;
	private static int levelHobgobelin = 2;
	private static int pvMaxHobgobelin = 2;
	private static int niveau = 2;
	private static String name = "Hobegobelin";

	public Hobgobelin() {
		super(intelligenceHobgobelin, agiliteHobgobelin, forceHobgobelin, levelHobgobelin, pvMaxHobgobelin, niveau,
				name);
	}

}
