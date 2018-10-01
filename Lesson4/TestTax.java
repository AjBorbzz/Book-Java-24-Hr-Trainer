package Lesson4;

public class TestTax {

	public static void main(String[] args) {
		double grossIncome ; //local variables
		String state;
		int dependents;
		
		grossIncome = 50000;
		state = "NJ";
		dependents = 2;

		Tax t = new Tax(grossIncome, state, dependents);
		Tax t2 = new Tax(60000, "TX", 4);
	
		double yourTax = t.calcTax();
		double hisTax = t2.calcTax();
		double EuroTax0 = Tax.convertToEuro(yourTax);
		double EuroTax = Tax.convertToEuro(hisTax);
		System.out.println("Your tax is :" + yourTax);
		System.out.println("His Tax  is :" + hisTax);
		System.out.println("your tax, converted to Euro, is : " + EuroTax0);
		System.out.println("His tax, converted to Euro, is : " + EuroTax);
	}

}
