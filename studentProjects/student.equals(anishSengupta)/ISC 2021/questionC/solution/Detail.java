package questionC.solution;

public class Detail {
    
  String name;
  String address;
  long telno;
  double rent;

  Detail(
      String name, 
      String address, 
      long telno, 
      double rent) {

    this.name = name;
    this.address = address;
    this.telno = telno;
    this.rent = rent;
  }

  public void show() {

    System.out.println("Name: " + this.name);
    System.out.println("Address: " + this.address);
    System.out.println("Telephone: " + this.telno);
    System.out.println("Rent: " + this.rent);
  }

  
}