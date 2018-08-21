class BMW{

public static void main(String[] args){

Car c= new Car(){

public void show(){
System.out.println("I am show");
}
public int move(){
System.out.println("I am move");
return 20;
}

};

c.show();
System.out.println("Value: "+c.move());


}

}

interface Car{
void show();
int move();
}