import java.io.*;

class Car{

public static void main(String[] args){

System.out.println(1);
try{
Car c= new Car();
c.move();
}
catch(Exception e){
System.out.println(e);
}
System.out.println(2);

}

void move() throws IOException{
System.out.println(5);
show();
System.out.println(6);
}

void show() throws FileNotFoundException{
System.out.println(3);
FileReader f= new FileReader("a.txt");
System.out.println(4);
}

}