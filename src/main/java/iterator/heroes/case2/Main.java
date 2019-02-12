package iterator.heroes.case2;

import java.util.Iterator;

public class Main{
	public static void main(String[] args){
		
		Team avengers = new Team(3);
		avengers.add(new Hero("IronMan"));
		avengers.add(new Hero("AntMan"));
		avengers.add(new Hero("SpiderMan"));
		
//		Iterator<Hero> it = avengers.iterator();
//		while(it.hasNext()){
//			Hero hero = (Hero)it.next();
//			System.out.println(hero.getName());
//		}
		
		for (Hero hero : avengers) {
			System.out.println(hero.getName());
		}
	}
}
