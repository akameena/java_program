class A
{

    A()
    {
        System.out.println("A Construct");
    }
}
class B extends A
{

    B(int a)
    {
        System.out.println("B Construct  = "+a);
    }

    B()
    {
        this(10);// here super() is implicit  involve
       System.out.println("B Construct");
    }
    public static void main(String[] args)
    {

         B ob = new B();
    }
}
