class Car{

int engine= 1;
byte wheels= 4;
static void move(){
System.out.println("Car can moves");
}
}


class BMW extends Car{

int engine= 2;

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

class BMWS7 extends BMW{

public static void main(String[] args){

BMWS7 b= new BMWS7();
System.out.println("BMWS7 has Engine: "+b.engine);
System.out.println("BMWS7 has wheels: "+b.wheels);
move();
b.moveFast();
b.moveVeryFast();
}
void moveVeryFast(){
System.out.println("BMWS7 can moves very fast");
}

}
