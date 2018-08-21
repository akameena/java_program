class Car{
int wheels= 4;

public final static void main(String[] args){
Car c= new Car();
c.wheels= 5;
System.out.println(c.wheels);
}
void show(){
System.out.println("This is show in Car");
}

}

class BMW extends Car{

void show(){
super.show();
System.out.println("This is show in BMW");
}

public static void main(String[] args){
BMW c= new BMW();
c.show();
}

}