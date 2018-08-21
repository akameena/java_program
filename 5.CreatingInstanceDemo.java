class Car{

int speed= 90;
static Car c;

public static void main(String[] args){

c= new Car();
System.out.println(c);
Car c1= new Car();
System.out.println(c1);
Car c2= c1;
System.out.println(c2);

System.out.println("Speed is: "+c.speed);
c.show();
}

void show(){

System.out.println("This is non static method");

}

}