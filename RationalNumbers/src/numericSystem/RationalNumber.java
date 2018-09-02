package numericSystem;

public class RationalNumber<T extends Number> implements IRationalNumber<RationalNumber<Number>> {
	private T numerator;
	private T denominator;

	public RationalNumber(T numerator, T denominator) {		
		this.numerator = numerator;
		this.denominator = denominator;
	}
	

	public void setNumerator(T numerator) {
		this.numerator = numerator;
	}


	public void setDenominator(T denominator) {
		this.denominator = denominator;
	}


	@Override
	public void addRational(RationalNumber<Number> rationalToBeAdded) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void substractRational(RationalNumber<Number> rationalToBeSubstracted) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void multiplyRational(RationalNumber<Number> rationalFactor) {
		// TODO Auto-generated method stub
		numerator = multiply(numerator, (T) rationalFactor.getNumerator());
		denominator = multiply(denominator, (T) rationalFactor.getDenominator());
		
	}


	private T multiply(T n1, T n2) {
		T number = null;
		if (n1 instanceof Long || n2 instanceof Long) {
			number = (T) Long.valueOf(n1.longValue()*n2.longValue());
		}
		else if (n1 instanceof Integer || n2 instanceof Integer) {			
			number = (T) Integer.valueOf(n1.intValue()*n2.intValue());
		}
		else if (n1 instanceof Short || n2 instanceof Short) {
			number = (T) Short.valueOf((short) (n1.shortValue()*n2.shortValue()));
		}
		return number;
		
	}

//	public T mcd(T n1, T n2) {
//		boolean t = false;
//		T r = null;
//		
//		r = ((T) Long.valueOf(n1.longValue() % n2.longValue())) != (Integer.valueOf(0));
//		if (n1 instanceof Long || n2 instanceof Long) {
//			while (() != 0) {
//			       r = n1 % n2;
//			       n1 = n2;
//			       n2 = n2;
//			     }
//		}
//		else if (n1 instanceof Integer || n2 instanceof Integer) {			
//		
//		}
//		else if (n1 instanceof Short || n2 instanceof Short) {
//		
//		}
//	     
//	     return n1;
//
//	}

	@Override
	public void divideRational(RationalNumber<Number> rationalQuocient) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void simplifyRational() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void rationalInverse() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void squaredRational() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Number getNumerator() {
		// TODO Auto-generated method stub
		return numerator;
	}


	@Override
	public Number getDenominator() {
		// TODO Auto-generated method stub
		return denominator;
	}


	
}
