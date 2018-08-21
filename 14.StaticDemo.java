class Car{

static int x= 90;
int y= 80;

public static void main(String[] args){
Car c= new Car();
System.out.println(x);
System.out.println(Car.x);
System.out.println(c.x);
c.x= 100;
Car c1= new Car();
System.out.println(c1.x);


System.out.println(c.y);
c.y= 110;
System.out.println(c1.y);

}

}