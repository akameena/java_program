class Car{

int price= 600000;
int price1= 900000;
public static void main(String[] args){

System.out.println("Hi");
Car c= new Car();
System.out.println(c.price);
c.show(500000);
System.out.println(c.price);
System.out.println("Bye");

}

void show(int price){
price= price+90;
System.out.println(price);
System.out.println(this.price);
System.out.println(this.price1);
}

}
