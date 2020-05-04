// Reference vs Object vs Instance vs Class

public class House{

	private String color;

	public House(String color){
		this.color=color;
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color=color;
	}
}

class Main{

	public static void main(String[] args) {
		
		House blueHouse=new House("blue");
		House anotherHouse=blueHouse;

		System.out.println(blueHouse.getColor());// prints blue
		System.out.println(anotherHouse.getColor());// blue

		anotherHouse.setColor("red");
		System.out.println(blueHouse.getColor());// red
		System.out.println(anotherHouse.getColor());// red

		House greenHouse=new House("green");
		anotherHouse=greenHouse;

		System.out.println(blueHouse.getColor());// red
		System.out.println(greenHouse.getColor());// green
		System.out.println(anotherHouse.getColor());// green
	}
}