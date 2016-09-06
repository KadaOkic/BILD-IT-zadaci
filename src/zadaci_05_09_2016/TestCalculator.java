package zadaci_05_09_2016;

public class TestCalculator {

	public static void main(String[] args) {
		// testing rational calculator assigning arguments and different
		// operations
		String[] arguments = { "5/4 + 4/3" };
		RationalCalculator.main(arguments);
		String[] arguments2 = { "3/5 - 2/3" };
		RationalCalculator.main(arguments2);
		String[] arguments3 = { "3/5 * 2/3" };
		RationalCalculator.main(arguments3);
		String[] arguments4 = { "3/5 / 3/5" };
		RationalCalculator.main(arguments4);
	}

}
