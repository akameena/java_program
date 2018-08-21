class A
{
    A(int a,int b)
    {
        this(5,6);
        System.out.println(a+b);
    }
}
class B extends A
{
    public static void main(String ... args)
    {
        Thread.currentThread().setName("My-main");
        System.out.println(Thread.currentThread().getName());
    B ob = new B();
    }
    B()
    {
        super(6,7);
        System.out.println("B");
    }
}
