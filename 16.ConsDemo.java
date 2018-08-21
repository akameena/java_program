class Car{

Car(int a){
System.out.println("I am I constructor "+a);
}

Car(){
System.out.println("I am D constructor ");
}

Car(byte a, int b){
System.out.println("I am BI constructor "+(a+b));
}

Car(int b, byte s){
System.out.println("I am IB constructor "+b+s);
}

public static void main(String[] args){
Car c= new Car((byte)20);
System.out.println(c);

Car c1= new Car();
Car c2= new Car((byte)20,30);

}

}
