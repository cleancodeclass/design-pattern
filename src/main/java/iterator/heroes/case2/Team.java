package iterator.heroes.case2;

import java.util.AbstractCollection;
import java.util.Iterator;

// TODO 01. java.util.AbstractCollection 객체를 extends하여 Collection 객체를 구현한다.
public class Team extends AbstractCollection<Hero>{
	private Hero[] heroes;
	private int last = 0;
	
	public Team(int maxsize) {
		heroes = new Hero[maxsize];
	}
	
	@Override
	public Iterator<Hero> iterator() {
		// TODO 02. anonymous inner type의 java.util.Iterator 를 생성하여 return한다.
		// TODO 03. java.util.Iterator 에서 구현해야할 메소드(hasNext(),next())를 생성하여 구현한다.
		return new Iterator<Hero>() {

			int cursor;
			@Override
			public boolean hasNext() {
				return cursor != last;
			}

			@Override
			public Hero next() {
				return heroes[cursor++];
			}
		};
	}

	@Override
	public int size() {
		return last;
	}
	
	// TODO 04. AbstractCollection 에서 오라이드된 add 메소드를 구현한다.
	@Override
	public boolean add(Hero hero) {
		heroes[last++] = hero;
		return true;
	}
}
