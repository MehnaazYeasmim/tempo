class GFG{
	static int a=200;
	static int b;
	static int c;
	
	static{
		b=a*4;
	}
	static {
		c=a+20;
		System.out.println("Nice");
		System.out.println("Iam cool!!!!");
		
	}
	public static void p1()
	{
		System.out.println("B is "+b);
		System.out.println("Static keyword");
	}
	public static void p2()
	{
		System.out.println("C is "+c);
		System.out.println("Static keyword");
		
	}
	public static void main(String args[])
	{
		System.out.println("A is "+a);
		p1();
		p2();
	}
}

