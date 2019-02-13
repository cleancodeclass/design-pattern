package relationship;

/**
 * @author SDS
 *
 */
public class MainClass extends AbstractClass implements InterfaceClass{
	
	AssociationClass asc;
	AggregationClass agc;
	CompositionClass cc;
	DependencyClass dc;
	
	public MainClass() {
		super();
		this.cc = new CompositionClass();
	}

	public MainClass(AggregationClass agc) {
		super();
		this.agc = agc;
	}

	public void setAsc(AssociationClass asc) {
		this.asc = asc;
	}

	public void call(DependencyClass dc){
		dc.print();
	}
}
