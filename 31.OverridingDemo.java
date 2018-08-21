class Car{

static void show(){
System.out.println("I am Orignal Method");
}

}

class BMW extends Car{

public static void main(String[] args){
BMW b= new BMW();
b.show();
}

//@Override
static void show(){
super.show();
System.out.println("I am Overridden Method");
}


}