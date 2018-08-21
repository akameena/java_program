class Car{

Car(){
this(890);
System.out.println("I am Car Cons");
}
Car(int a){
System.out.println("I am Car I Cons "+a);
}

}

class BMW extends Car{

BMW(){
this(89);
System.out.println("I am BMW Cons");
}

BMW(int a){
super(87);
System.out.println("I am BMW I Cons "+a+90);
}

public static void main(String[] args){
BMW b= new BMW();
BMW b1= new BMW(20);
}

}
