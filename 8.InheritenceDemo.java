class Car{

int engine= 1;
byte wheels= 4;
static void move(){
System.out.println("Car can moves");
}
}

class BMW extends Car{

public static void main(String[] args){

BMW b= new BMW();
System.out.println("BMW has Engine: "+b.engine);
System.out.println("BMW has wheels: "+b.wheels);
move();
b.moveFast();

}
void moveFast(){
System.out.println("BMW can moves fast");
}

}


class Ford extends Car{

public static void main(String[] args){

Ford b= new Ford();
System.out.println("Ford has Engine: "+b.engine);
System.out.println("Ford has wheels: "+b.wheels);
move();
b.moveSlow();

}
void moveSlow(){
System.out.println("Ford can moves slow");
}

}
