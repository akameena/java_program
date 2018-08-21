class Car{

Car(){
this(20);
System.out.println("Default cons ");
}

Car(int i){
this(20, 30);
System.out.println("I cons: "+i);
}

Car(int a, int b){
System.out.println("II cons: "+a+b);
}

public static void main(String[] args){
Car c= new Car();
}

}