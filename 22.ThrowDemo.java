import java.io.*;

class Car{

public static void main(String[] args) throws Exception{

System.out.println(1);
Car c= new Car();
c.show();
System.out.println(2);
}

void show() throws FileNotFoundException{
try{
System.out.println(3);
FileReader f= new FileReader("a.txt");
}
catch(FileNotFoundException e){
System.out.println(e);
throw e;
}
System.out.println(4);
}

}