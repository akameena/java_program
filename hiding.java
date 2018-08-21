 class Animal {
    public  void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}

 class Cat extends Animal {
    public  void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Animal anml = new Cat();
        //Animal myAnimal = myCat;
        anml.testClassMethod();
        //myAnimal.testInstanceMethod();
    }
}
