//package AB;
class A
{
    int a=10;
    static int b=30;
    public static void main(String[] args)
    {
        A ob = new A();
        ob.show();
        disp();
    }
     void show()
    {
        System.out.println(" A = "+a);

    }
   static void disp()
    {
         A ob2 = new A();
        System.out.println(" b = "+b);
    }
}
