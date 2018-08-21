package abc;

public class A{

private static int x= 90;

public static void main(String[] args){

System.out.println("I am main in A");
System.out.println(x);
}
}

class B{

public static void main(String[] args){

A a= new A();
//System.out.println(a.x);
a.main(args);

}

}