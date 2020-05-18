class SimpleCalculator{

	SimpleCalculator(){
		System.out.println("SimpleCalculator constructor called");
	}

	public int add(int a, int b){
		return a+b;
	}

	public int substract(int a, int b){
		return a-b;
	}

	public float divide(int a, int b){
		return (float)a/b;
	}

	public int multiply(int a, int b){
		return a*b;
	}
}

class ScientificCalculator extends SimpleCalculator{

	ScientificCalculator(){
		System.out.println("ScientificCalculator constructor called");
	}

	public double cosec(double angle){
		return 1/Math.sin(angle*22.0/7.0/180.0);
	}

	public double sec(double angle){
		return 1/Math.cos(angle*22.0/7.0/180.0);
	}

	public double cot(double angle){
		return 1/Math.tan(angle*22.0/7.0/180.0);
	}

	public static void main(String[] args) {
		
		ScientificCalculator ob=new ScientificCalculator();

		System.out.println(ob.add(5,6));		
		System.out.println(ob.substract(5,6));
		System.out.println(ob.divide(5,6));
		System.out.println(ob.multiply(5,6));
		System.out.println(ob.cosec(30));
		System.out.println(ob.sec(60));
		System.out.println(ob.cot(45));
	}	
}