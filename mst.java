class GFG{
	static int a=10;
	static int b;
	static int c;
	
	static{
		b=a*4;
	}
	static {
		c=a+10;
	}
	public static void p1()
	{
		System.out.println("B is "+b);
	}
	public static void p2()
	{
		System.out.println("C is "+c);
	}
	public static void main(String args[])
	{
		System.out.println("A is "+a);
		p1();
		p2();
	}
}

