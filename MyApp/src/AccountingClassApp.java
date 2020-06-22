class Accounting {
	// field
//	public static double valueOfSupply;
//	public static double vatRate;
//	public static double expenseRate;
	
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	public void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpense());
		System.out.println("Income : " + getIncome());
		System.out.println("Dividend 1 : " + getDividend1());
		System.out.println("Dividend 2 : " + getDividend2());
		System.out.println("Dividend 3 : " + getDividend3());
		System.out.println();
	}

	public double getDividend3() {
		return getIncome() * 0.2;
	}

	public double getDividend2() {
		return getIncome() * 0.3;
	}

	public double getDividend1() {
		return getIncome() * 0.5;
	}

	public double getIncome() {
		return valueOfSupply - getExpense();
	}

	public double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public double getVAT() {
		return valueOfSupply * vatRate;
	}
	
	public double getTotal() {
		return valueOfSupply + getVAT();
	}

}

//class Accounting2 {
//	// field
//	public static double valueOfSupply;
//	public static double vatRate;
//	public static double expenseRate;
//	
//	public static void print() {
//		System.out.println("Value of supply : " + valueOfSupply);
//		System.out.println("VAT : " + getVAT());
//		System.out.println("Total : " + getTotal());
//		System.out.println("Expense : " + getExpense());
//		System.out.println("Income : " + getIncome());
//		System.out.println("Dividend 1 : " + getDividend1());
//		System.out.println("Dividend 2 : " + getDividend2());
//		System.out.println("Dividend 3 : " + getDividend3());
//	}
//
//	public static double getDividend3() {
//		return getIncome() * 0.2;
//	}
//
//	public static double getDividend2() {
//		return getIncome() * 0.3;
//	}
//
//	public static double getDividend1() {
//		return getIncome() * 0.5;
//	}
//
//	public static double getIncome() {
//		return valueOfSupply - getExpense();
//	}
//
//	public static double getExpense() {
//		return valueOfSupply * expenseRate;
//	}
//
//	public static double getVAT() {
//		return valueOfSupply * vatRate;
//	}
//	
//	public static double getTotal() {
//		return valueOfSupply + getVAT();
//	}
//
//}

public class AccountingClassApp {

	public static void main(String[] args) {
		
//		Accounting.valueOfSupply = 10000;
//		Accounting.vatRate = 0.1;
//		Accounting.expenseRate = 0.3;
//		Accounting.print();
		
//		Accounting2.valueOfSupply = 20000;
//		Accounting2.vatRate = 0.05;
//		Accounting2.expenseRate = 0.2;
//		Accounting2.print();
		
//		Accounting.valueOfSupply = 10000;
//		Accounting.vatRate = 0.1;
//		Accounting.expenseRate = 0.3;
//		Accounting.print(); 
		
		// instance
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();		
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();	
		
		a1.print();
	}
}
