public class Main {

	public static void main(String[] args) {
		
		// TODO implement your own Calculator Implementation and create a new CalculatorImpl Class
		Calculator calc = new CalculatorImpl();
		
		calc.addValue(20);	// currently highest number
		calc.addValue(4);	// currently lowest number
		calc.addValue(16);
		
		// add other integers
		calc.addValue(99);
		calc.addValue(54);
		calc.addValue(7);

		// output lowest number 
		System.out.println(calc.getMinimum());
		// output highest number
		System.out.println(calc.getMaximum());
		// output sum of all numbers
		System.out.println(calc.sum());
	}

}
