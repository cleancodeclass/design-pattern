package prototype.ironmansuit.case1;

public class Mark3 extends IronManSuit{

	public Mark3() {
		super();
		this.setName("Mark3");
	}

	@Override
	public IronManSuit clone() {
		IronManSuit suit = new Mark3();
		suit.setName(this.getName());
		suit.setArmorLevel(this.getArmorLevel());
		suit.setAttack(this.getAttack());
		suit.setDepense(this.getDepense());
		System.out.println(suit.getName() + " created! " + suit.hashCode());
		return suit;
	}
}
