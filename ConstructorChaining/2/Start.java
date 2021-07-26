public class Start
{
	public static void main(String args[])
	{
		A a = new A();
		A aa = new A(10);
		A aaa = new A(10, 20);
		
		System.out.println("---------------------");
		
		B b = new B();
		B bb = new B(30);
		B bbb = new B(30,40);
		
		System.out.println("---------------------");
		
		C c = new C();
		C cc = new C(50);
		C ccc = new C(50,60);
		
		System.out.println("---------------------");
		
		D d = new D();
		D dd = new D(70);
		D ddd = new D(70,80);
		
	}
}