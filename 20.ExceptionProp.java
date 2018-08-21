class Car{

public static void main(String[] args){
Car c= new Car();
c.method1();
System.out.println("This is main printed");
}
void method1(){

method2();

System.out.println("This is method1");
}
void method2(){
method3();
System.out.println("This is method2");
}
void method3(){
method4();
System.out.println("This is method3");
}
void method4(){
int i= 10/0;
System.out.println("This is method4");
}
}