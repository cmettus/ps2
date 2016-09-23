package base;

public class MyInteger {
	
	
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue() {
		this.iValue = iValue;
	}

	public boolean isEven()
	{
		return (this.iValue % 2 == 0);
	}
	
	public boolean isOdd()
	{
		return (iValue % 2 != 0);
	}
	
	public boolean isPrime()
	{
		for (int i = 2; i < iValue; i++) {
			if (iValue % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(int value)
	{
		return (value % 2 == 0);
	}
	
	public static boolean isOdd(int value)
	{
		return (value % 2 != 0);
	}
	
	public static boolean isPrime(int value)
	{
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger firstval)
	{
		return (firstval.iValue % 2 == 0);
	}
	
	public static boolean isOdd(MyInteger firstval)
	{
		return (firstval.iValue % 2 != 0);
	}
	
	public static boolean isPrime(MyInteger firstval)
	{
		for (int i = 2; i < firstval.iValue; i++) {
			if (firstval.iValue % i == 0)
				return false;
		}
		return true;
	}
	
	public boolean equals(int firstval){
		if (this.iValue == firstval) 
			return true;
		else 
			return false;
	}
	public boolean equals(MyInteger firstval){
		if (this.iValue == firstval.iValue) 
			return true;
		else 
			return false;
	}
}

