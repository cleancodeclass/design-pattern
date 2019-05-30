package prototype.ironmansuit.case2;

public abstract class IronManSuit implements Cloneable{

	private String name;
	private int armorLevel;
	private int attack;
	private int depense;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArmorLevel() {
		return armorLevel;
	}

	public void setArmorLevel(int armorLevel) {
		this.armorLevel = armorLevel;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDepense() {
		return depense;
	}

	public void setDepense(int depense) {
		this.depense = depense;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Object clone = super.clone();
		IronManSuit suit = (IronManSuit) clone;	
		System.out.println(suit.getName() + " created! " + suit.hashCode());
		return clone;
	}
}
