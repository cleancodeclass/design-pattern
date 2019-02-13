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
		// TODO 06. cursor 와 team의 last 값을 활용하여 구현한다.
		return cursor != team.size();
	}
	
	@Override
	public Object next() {
		// TODO 07. team 객체를 순회하며 한 건식 Hero객체를 가져와 return한다.
		return team.get(cursor++);
	}
	
}
