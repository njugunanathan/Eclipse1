package contact;

 class Cycle {
	 double run=42.9;
		 void nice() {
			System.out.println("I burn bright");
		}
		}
class Dog extends Cycle {
	void ride(){
		System.out.println("I have pedals");
	}
}

class Right extends Cycle {
	void won() {
		System.out.println("The Earth is an oblate in nature");
	}
}
class bicycle {
	public static void main(String[] args) { 
		Dog fine = new Dog();
		fine.ride();
		Right c=new Right();
		c.nice();
		c.won();
		System.out.println(fine.run);
		
	}
	
}

