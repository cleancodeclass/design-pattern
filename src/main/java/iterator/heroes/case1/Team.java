package iterator.heroes.case1;

// TODO 01. iterator.heroes.case1.Aggregate 인터페이스를 implements 한다.
public class Team implements Aggregate{
	
	private Hero[] heroes;
	private int last = 0;
	
	public Team(int maxsize) {
		heroes = new Hero[maxsize];
	}

	public Hero get(int index){
		// TODO 05. heroes 배열에서 입력파라미터 index 의 value를 return 한다. 
		return heroes[index];
	}
	
	public void add(Hero hero){
		// TODO 04. heroes 배열에 입력파라미터 Hero객체를 추가한다. 
		heroes[last] = hero;
		last++;
	}
	
	public int size(){
		return last;
	}
	
	// TODO 02. @Override를 선언하여 iterator.heroes.case1.Aggregate 인터페이스의 오버라이딩 메소드임을 표현한다.
	@Override
	public Iterator iterator() {
		// TODO 03. iterator.heroes.case1.Iterator 인터페이스 구현체인 iterator.heroes.case1.TeamIterator 를 생성하여 return 한다. 
		return new TeamIterator(this);
	}
	
}
