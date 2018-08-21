import java.io.*;

class Car{

public static void main(String[] args){
FileReader f= null;

System.out.println("Hi");

try{
System.out.println(1);
//int i= 90/0;
f= new FileReader("a.txt");
System.out.println(2);

}

catch(FileNotFoundException e){
System.out.println(e.getMessage());
System.out.println("wait");

e.printStackTrace();
}

finally{
try{
f.close();
}
catch(Exception e){
System.out.println(e);
}
System.out.println("Run for sure");
}
System.out.println("Bye");

}

}
