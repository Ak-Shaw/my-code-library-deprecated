class A{

	int a;
	public int b;
	private int c;
	protected int d;

	A(){
		a=1;
		b=2;
		c=3;
		d=4;
	}
}

class B extends A{

	B(){

		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args) {
		
		B ob=new B();
	}
}