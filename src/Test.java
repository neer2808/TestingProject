class person
{
  String name;
  int age;
  car carobj;
  person(String name, int age)
  {
    this.name = name;
    this.age = age;

  }
  void intro()
  {
    System.out.println(name + ""+ age);
  }
}
class car
{
  String make;
  String type;
  String price;
    car(String make, String type, String price)
    {
      this.make = make;
      this.price= price;
      this.type= type;
    }
    void carintro()
    {
      System.out.println(make + " " + type+ ""+ price);
    }
}
public class Test {
  public static void main(String[] args) {
   car obj = new car("honda","suv","100000");
   person pobj = new person("aaa",56);
   pobj.carobj= obj;
   pobj.intro();
   pobj.carobj.carintro();
  }
}
