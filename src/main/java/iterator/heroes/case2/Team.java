package iterator.heroes.case2;

import java.util.AbstractCollection;
import java.util.Iterator;

// TODO 1. java.util.AbstractCollection 객체를 extends하여 Collection 객체를 구현한다.
public class Team extends AbstractCollection<Hero>{
	private Hero[] heroes;
	private int last = 0;
	
	public Team(int maxsize) {
		heroes = new Hero[maxsize];
	}
	
	@Override
	public Iterator<Hero> iterator() {
		// TODO 2. anonymous inner type의 java.util.Iterator 를 생성하여 return한다.
		// TODO 3. java.util.Iterator 에서 구현해야할 메소드(hasNext(),next())를 생성하여 구현한다.
		return null;
	}

	@Override
	public int size() {
		return last;
	}
	
	@Override
	public boolean add(Hero hero) {
		return false;
	}
}
