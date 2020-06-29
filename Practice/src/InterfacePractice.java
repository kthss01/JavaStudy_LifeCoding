
interface I {
	public void z();
}

class Z implements I {
	public void z() {
	}
}

class CalculatorDummy implements Calculatable {
	int first, second, third;

	@Override
	public void setOprands(int first, int second, int third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	@Override
	public int sum() {
		return first + second + third;
	}

	@Override
	public int avg() {
		return (first + second + third) / 3;
	}

}

public class InterfacePractice {
	public static void main(String[] args) {
		CalculatorDummy c = new CalculatorDummy();
		c.setOprands(10, 20, 30);
		System.out.println(c.sum() + c.avg());
	}

}
