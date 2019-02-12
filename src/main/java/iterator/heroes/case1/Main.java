package iterator.heroes.case1;

public class Main{
	public static void main(String[] args){
		
		Team avengers = new Team(3);
		avengers.add(new Hero("IronMan"));
		avengers.add(new Hero("AntMan"));
		avengers.add(new Hero("SpiderMan"));
		
		Iterator it = avengers.iterator();
		while(it.hasNext()){
			Hero hero = (Hero)it.next();
			System.out.println(hero.getName());
		}
	}
}
