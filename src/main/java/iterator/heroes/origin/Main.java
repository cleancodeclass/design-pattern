package iterator.heroes.origin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main{
	public static void main(String[] args){
		
		List<Hero> avengers = new ArrayList<>();
		avengers.add(new Hero("IronMan"));
		avengers.add(new Hero("AntMan"));
		avengers.add(new Hero("SpiderMan"));
		
		Iterator<Hero> it = avengers.iterator();
		while(it.hasNext()){
			Hero hero = (Hero)it.next();
			System.out.println(hero.getName());
		}
	}
}
