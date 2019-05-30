package prototype.ironmansuit.case2;

public class Main {

	// 토니스타크는 아이언맨 슈트를 각각의 모델마다 여러벌 만들어 두길 원합니다. 
	// 아이언맨 슈트는 생산년도에 따라 Mark1 부터 Mark3 까지 모델이 존재합니다.
	public static void main(String[] args) throws CloneNotSupportedException {
		
		long start = System.currentTimeMillis();
		
		// 1. 아이언맨 슈트 Mark1을 생산합니다.
		IronManSuit mark1_1 = createMark1();
		IronManSuit mark1_2 = (IronManSuit) mark1_1.clone();
		IronManSuit mark1_3 = (IronManSuit) mark1_1.clone();
		IronManSuit mark1_4 = (IronManSuit) mark1_1.clone();
		System.out.println("-------------------------------------");
		
		// 2. 아이언맨 슈트 Mark2를 생산합니다.
		IronManSuit mark2_1 = createMark2();
		IronManSuit mark2_2 = (IronManSuit) mark2_1.clone();
		IronManSuit mark2_3 = (IronManSuit) mark2_1.clone();
		IronManSuit mark2_4 = (IronManSuit) mark2_1.clone();
		System.out.println("-------------------------------------");
		
		// 3. 아이언맨 슈트 Mark3를 생산합니다.
		IronManSuit mark3_1 = createMark3();
		IronManSuit mark3_2 = (IronManSuit) mark3_1.clone();
		IronManSuit mark3_3 = (IronManSuit) mark3_1.clone();
		IronManSuit mark3_4 = (IronManSuit) mark3_1.clone();
		System.out.println("-------------------------------------");
		
		long end = System.currentTimeMillis();
		
		// 4. 아이언맨 슈트 만드는데 걸린 시간입니다.
		long elapsedTime = end-start;
		System.out.println("Elapsed Time: " + elapsedTime);
		
	}

	private static IronManSuit createMark3() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		IronManSuit suit = new Mark3();
		suit.setArmorLevel(3);
		suit.setAttack(100);
		suit.setDepense(100);
		System.out.println("Mark3 created! " + suit.hashCode());
		return suit;
	}

	private static IronManSuit createMark2() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		IronManSuit suit = new Mark2();
		suit.setArmorLevel(2);
		suit.setAttack(90);
		suit.setDepense(90);
		System.out.println("Mark2 created! " + suit.hashCode());
		
		return suit;
	}

	private static IronManSuit createMark1() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		IronManSuit suit = new Mark1();
		suit.setArmorLevel(1);
		suit.setAttack(80);
		suit.setDepense(80);
		System.out.println("Mark1 created! " + suit.hashCode());

		return suit;
	}

}
