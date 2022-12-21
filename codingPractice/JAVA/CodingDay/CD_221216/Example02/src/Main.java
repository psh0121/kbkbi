
public class Main {
	
	public static <T extends Number> double add1 (T a1, T a2)
	{
		double result;
		result = a1.doubleValue() + a2.doubleValue();
		
		return result;
	}
	
	public static <T extends Number> T add2 (T a3, T a4)
	{
		T result = null;
		
		// class이름으로 하고싶으면 ==> a1.getClass().getName()
		
		// if(a3.getClass() == Integer.class)
		// if(a3.getClass().getName().equals("java.lang.Integer"))
		if(a3 instanceof Integer)
		{
			result = (T)(Integer)((Integer)a3 + (Integer)a4);
		}
		
		else if(a3 instanceof Double)
		{
			result = (T)(Double)((Double)a3 + (Double)a4);
		}
		
		return result;
	}

	public static void main(String[] args) 
	{
		////////////////////////////////////////////////
		// type1
		Integer a1 = 1;
		Integer a2 = 2;

		double k = add1(a1, a2);

		//System.out.println(k);

		Double d1 = 1.0;
		Double d2 = 2.0;

		double z = add1(d1, d2);

		//System.out.println(z);

		////////////////////////////////////////////////
		// type2

		Integer a3 = 1;
		Integer a4 = 2;

		Integer n = add2(a3, a4);

		System.out.println(n);

		Double d3 = 1.0;
		Double d4 = 2.2;

		Double m = add2(d3, d4);

		System.out.println(m);

	}

}
