package examplePrograms;
class B{
	
}
class C extends B
{
	
}
class Base
{
	B fun() {
		System.out.println("fun is in Base class");
		return new B();
	}
}
class Derived extends Base
{
	@Override
	C fun()
	{
		System.out.println("fun is in Derived class");
		return new C();
	}
}
public class CovarientObject {

	public static void main(String[] args) {

		Base b=new Base();
		b.fun();
		Derived d=new Derived();
		d.fun();
	}

}
