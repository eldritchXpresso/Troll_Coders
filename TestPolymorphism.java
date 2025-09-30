public class TestPolymorphism {
	public static void main(String[] args) {
		Animal a;
		a = new Dog();
		a.sound();
		((Animal) a).sound();

		Animal b;
		b = (Animal) new Bird();
		b.sound();


		a = (Animal) new Cat();
		a.sound();
		((Dog) a).sound();

	
	}
}
