class Method 
{
	public static void main(String[] args) 
	{
		System.out.println("main method start");
        prime(10);
       System.out.println("main method ends");
	}

	public static void prime(int num)
	{
		int i=2;
		while (num>i)
		{
			if (num%i==0)
			{
				break;
			}
			i++;
		}
		if (num==i)
		{
			System.out.println("prime num is="+num);
		}
		else 
			System.out.println("not aprime num is="+num);
	}
}
