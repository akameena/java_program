class Car{

int price= 500000;
int speed= 90;

public static void main(String[] args){

Car[] c= new Car[3];
c[0]= new Car();
c[1]= new Car();
c[2]= new Car();
System.out.println(c[0].price);
System.out.println(c[1].speed);


}

}