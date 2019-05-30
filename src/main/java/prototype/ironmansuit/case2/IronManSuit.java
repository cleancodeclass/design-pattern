package prototype.ironmansuit.case2;

//TODO 01. java.lang.Cloneable 인터페이스를 implements 합니다.
public abstract class IronManSuit{

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
	
	// TODO 02. 'public Object clone()' override 합니다.
	// 'super.clone()' 을 활용하여 객체를 clone합니다.
	// 리턴전에 객체를 출력합니다. System.out.println(suit.getName() + " created! " + suit.hashCode());
}
