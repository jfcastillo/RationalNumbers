package view;

import numericSystem.IRationalNumber;
import numericSystem.RationalNumber;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Main m = new Main();
		RationalNumber<Number> a = new RationalNumber<Number>(1, 2);		
		RationalNumber<Number> b = new RationalNumber<Number>(6, 4);
		
		a.multiplyRational(b);
		System.out.println(a.getNumerator());
		System.out.println(a.getDenominator());
//		b.multiplyRational(new RationalNumber<Number>(0, 1));
//		boolean prueba = true;
//		prueba = prueba && (a.getNumerator().intValue() == 3 && a.getDenominator().intValue() == 4);
//		prueba = prueba && (b.getNumerator().intValue() == 0);

	}

}
