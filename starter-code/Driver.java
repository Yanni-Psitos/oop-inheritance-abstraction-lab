public abstract class Driver{
	public static void main(String[] args) {
	Pets[] pets = new Pets[2];
		pets[0] = new Dog();
		pets[1] = new Cat();

		for(int i = 0;i<pets.length;i++){
			System.out.println(pets[i].feed(""));
			System.out.println(pets[i].groom(""));
			System.out.println(pets[i].playWith(""));
		}

	Households[] households = new Households[2];
		households[0] = new HouseholdOne();
		households[1] = new HouseholdTwo();

		for (int i = 0; i<households.length; i++){
			System.out.println(households[i].income(0));
			System.out.println(households[i].taxes(0));
		}
	}

}
