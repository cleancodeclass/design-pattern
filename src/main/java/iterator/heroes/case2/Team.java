package iterator.heroes.case2;

import java.util.AbstractCollection;
import java.util.Iterator;

public class Team extends AbstractCollection<Hero>{
	private Hero[] heroes;
	private int last = 0;
	
	public Team(int maxsize) {
		heroes = new Hero[maxsize];
	}
	
	@Override
	public Iterator<Hero> iterator() {
		return new Iterator<Hero>() {
			private int cursor;
			
			@Override
			public boolean hasNext() {
				return cursor != size();
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
	
	@Override
	 public boolean add(Hero hero) {
		heroes[last++] = hero;
		return true;
    }
}
