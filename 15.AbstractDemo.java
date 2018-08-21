abstract class Car{

abstract void move();

}

class BMW{

public static void main(String[] args){
    Car c= new Car(){

void move(){
System.out.println("I am move in Car");
}

};


c.move();


}


}
