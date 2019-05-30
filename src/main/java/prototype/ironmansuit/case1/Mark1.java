package prototype.ironmansuit.case1;

public class Mark1 extends IronManSuit{

	public Mark1() {
		super();
		this.setName("Mark1");
	}
	
	@Override
	public IronManSuit clone() {
		IronManSuit suit = new Mark1();
		suit.setName(this.getName());
		suit.setArmorLevel(this.getArmorLevel());
		suit.setAttack(this.getAttack());
		suit.setDepense(this.getDepense());
		System.out.println(suit.getName() + " created! " + suit.hashCode());
		return suit;
	}
}
