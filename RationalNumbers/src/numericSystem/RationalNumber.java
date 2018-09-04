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

	public void addition () {
		
	}

	@Override
	public void addRational(RationalNumber<Number> rationalToBeAdded) {
		// TODO Auto-generated method stub
		T number1 = multiply(numerator, (T)rationalToBeAdded.getDenominator());
		T number2 = multiply(denominator, (T)rationalToBeAdded.getNumerator());
		
		numerator = addition(number1, number2);
		denominator = multiply(denominator, (T) rationalToBeAdded.getDenominator());
		simplifyRational();
	}
	
	public T addition (T n1, T n2) {
		T number = null;
		if (n1 instanceof Long || n2 instanceof Long) {
			number = (T) Long.valueOf(n1.longValue()+n2.longValue());
		}
		else if (n1 instanceof Integer || n2 instanceof Integer) {			
			number = (T) Integer.valueOf(n1.intValue()+n2.intValue());
		}
		else if (n1 instanceof Short || n2 instanceof Short) {
			number = (T) Short.valueOf((short) (n1.shortValue()+n2.shortValue()));
		}
		return number;
	}


	@Override
	public void substractRational(RationalNumber<Number> rationalToBeSubstracted) {
		// TODO Auto-generated method stub
		T number1 = multiply(numerator, (T)rationalToBeSubstracted.getDenominator());
		T number2 = multiply(denominator, (T)rationalToBeSubstracted.getNumerator());
		
		numerator = subtraction(number1, number2);
		denominator = multiply(denominator, (T) rationalToBeSubstracted.getDenominator());
		simplifyRational();
		
	}
	
	public T subtraction (T n1, T n2) {
		T number = null;
		if (n1 instanceof Long || n2 instanceof Long) {
			number = (T) Long.valueOf(n1.longValue() - n2.longValue());
		}
		else if (n1 instanceof Integer || n2 instanceof Integer) {			
			number = (T) Integer.valueOf(n1.intValue() - n2.intValue());
		}
		else if (n1 instanceof Short || n2 instanceof Short) {
			number = (T) Short.valueOf((short) (n1.shortValue() - n2.shortValue()));
		}
		return number;
	}


	@Override
	public void multiplyRational(RationalNumber<Number> rationalFactor) {
		// TODO Auto-generated method stub
		numerator = multiply(numerator, (T) rationalFactor.getNumerator());
		denominator = multiply(denominator, (T) rationalFactor.getDenominator());
		simplifyRational();
		
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

	@Override
	public void divideRational(RationalNumber<Number> rationalQuocient) {
		numerator = multiply(numerator, (T) rationalQuocient.getDenominator());
		denominator = multiply(denominator, (T) rationalQuocient.getNumerator());
		simplifyRational();
		
	}
	public T divide(T n1, T n2) {
		T number = null;
		if (n1 instanceof Long || n2 instanceof Long) {
			number = (T) Long.valueOf(n1.longValue()/Math.abs(n2.longValue()));
		}
		else if (n1 instanceof Integer || n2 instanceof Integer) {			
			number = (T) Integer.valueOf(n1.intValue()/Math.abs(n2.intValue()));
		}
		else if (n1 instanceof Short || n2 instanceof Short) {
			number = (T) Short.valueOf((short) (n1.shortValue()/Math.abs(n2.shortValue())));
		}
		return number;
	}
	
	public T mcd(T n1, T n2) {
		boolean t = false;
		T r = null;
		
		
		if (n1 instanceof Long || n2 instanceof Long) {
			while (n2.longValue() != 0) {
				r = (T) Long.valueOf(n1.longValue()%n2.longValue());
				n1 = n2;
				n2 = r;	       
			}
		}
		else if (n1 instanceof Integer || n2 instanceof Integer) {			
			while (n2.intValue() != 0) {
				r = (T) Integer.valueOf(n1.intValue()%n2.intValue());
				n1 = n2;
				n2 = r;	       
			}
		}
		else if (n1 instanceof Short || n2 instanceof Short) {
			while (n2.shortValue() != 0) {
				r = (T) Short.valueOf((short) (n1.shortValue()%n2.shortValue()));
				n1 = n2;
				n2 = r;	       
			}			
		}
		
	     
	     return n1;

	}

	


	@Override
	public void simplifyRational() {
		// TODO Auto-generated method stub
		T mcd = mcd(numerator, denominator);
		numerator = divide(numerator, mcd);
		denominator = divide(denominator, mcd);
		
	}


	@Override
	public void rationalInverse() {
		T change = numerator;
		if (numerator instanceof Integer) {
			if (numerator.intValue() != 0) {
				numerator = denominator;
				denominator = change;
			}
		}
		else if (numerator instanceof Long) {
			if (numerator.longValue() != 0) {
				numerator = denominator;
				denominator = change;
			}
		}
		else if (numerator instanceof Short) {
			if (numerator.shortValue() != 0) {
				numerator = denominator;
				denominator = change;
			}
		}
		simplifyRational();
	}


	@Override
	public void squaredRational() {
		numerator = multiply(numerator, numerator);
		denominator = multiply(denominator, denominator);
		simplifyRational();
		
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
