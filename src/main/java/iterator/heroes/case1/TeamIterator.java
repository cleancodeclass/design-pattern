package iterator.heroes.case1;

public class TeamIterator implements Iterator {

	private Team team;
	private int cursor;
	
	public TeamIterator(Team team) {
		this.team = team;
		this.cursor = 0;
	}

	@Override
	public boolean hasNext() {
		return cursor != team.size();
	}
	
	@Override
	public Object next() {
		return team.get(cursor++);
	}
	
}
