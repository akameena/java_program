class Car{

static void show(){

System.out.println("I am show method");
}

static void fun(int a, String b){
System.out.println("I am func method "+a+b);

}

static int move(int a, int pawani, String s, float f){
System.out.println("I am move method");
System.out.println(s+(f+a)+pawani);
return a+pawani;
}

public static void main(String[] args){

System.out.println("Hi");
show();
fun(30, "java");

//int pawani= move(20, 40, " Ducat ", 89.90f);
//System.out.println("Speed: "+pawani);

System.out.println("Speed: "+move(20, 40, " Ducat ", 89.90f));
System.out.println("Bye");

}


}
