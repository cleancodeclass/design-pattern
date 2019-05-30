package prototype.ironmansuit.case1;

public class Mark2 extends IronManSuit{

	public Mark2() {
		super();
		this.setName("Mark2");
	}

	@Override
	public IronManSuit clone() {
		IronManSuit suit = new Mark2();
		suit.setName(this.getName());
		suit.setArmorLevel(this.getArmorLevel());
		suit.setAttack(this.getAttack());
		suit.setDepense(this.getDepense());
		System.out.println(suit.getName() + " created! " + suit.hashCode());
		return suit;
	}
}
