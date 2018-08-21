import java.util.*;

class MyException extends Exception{

MyException(String message){
super(message);
}

}

class AgeChecker{

public static void main(String[] args){
try{
Scanner sc= new Scanner(System.in);
System.out.println("Please enter age");
int age= sc.nextInt();

show(age);
}
catch(Exception e){
System.out.println(e);
}
}

static void show(int age) throws MyException{
if(age>= 20 && age<= 25){
System.out.println("Age is perfect for marriage");
}
else{
MyException e= new MyException("You are not eligible for marriage");
throw e;
}

}

}
