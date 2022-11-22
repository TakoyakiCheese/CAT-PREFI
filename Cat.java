public class Cat extends Animal {
	
	@Override
	public void eat() {
		System.out.print("Cats loves to eat fish");
	}
	
	@Override
	public void sleep(){
		System.out.print("and sleep for 8-10 hours a day");
	}
	
	@Override
	public void makesound() {
		System.out.println("Meow");
	}
	
}