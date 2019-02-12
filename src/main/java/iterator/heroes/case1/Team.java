package iterator.heroes.case1;

// TODO 1. iterator.heroes.case1.Aggregate 인터페이스를 implements 한다.
public class Team{
	
	private Hero[] heroes;
	private int last = 0;
	
	public Team(int maxsize) {
		heroes = new Hero[maxsize];
	}

	public Hero get(int index){
		// TODO 5. heroes 배열에서 입력파라미터 index 의 value를 return 한다. 
		return null;
	}
	
	public void add(Hero hero){
		// TODO 4. heroes 배열에 입력파라미터 Hero객체를 추가한다.  
	}
	
	public int size(){
		return last;
	}
	
	// TODO 2. @Override를 선언하여 iterator.heroes.case1.Aggregate 인터페이스의 오버라이딩 메소드임을 표현한다.
	public Iterator iterator() {
		// TODO 3. iterator.heroes.case1.Iterator 인터페이스 구현체인 iterator.heroes.case1.TeamIterator 를 생성하여 return 한다. 
		return null;
	}
	
}
