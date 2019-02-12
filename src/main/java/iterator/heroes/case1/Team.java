package iterator.heroes.case1;

public class Team implements Aggregate{
	
	private Hero[] heroes;
	private int last = 0;
	
	public Team(int maxsize) {
		heroes = new Hero[maxsize];
	}

	public Hero get(int index){
		return heroes[index];
	}
	
	public void add(Hero hero){
		heroes[last++] = hero;
	}
	
	public int size(){
		return last;
	}
	
	@Override
	public Iterator iterator() {
		return new TeamIterator(this);
	}
	
}
