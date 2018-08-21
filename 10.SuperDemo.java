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
b.moveFast();

}
void moveFast(){

System.out.println("Car has Engine: "+super.engine);
System.out.println("BMW has Engine: "+engine);
System.out.println("BMW has wheels: "+wheels);
move();
System.out.println("BMW can moves fast");
}

}


class BMWS7 extends BMW{

int engine= 3;

public static void main(String[] args){
BMWS7 b= new BMWS7();
b.moveveryFast();

}
void moveveryFast(){

System.out.println("BMW has Engine: "+super.engine);
System.out.println("BMWS7 has Engine: "+engine);
}

}