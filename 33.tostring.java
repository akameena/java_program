class Box
{
    double w,h,d;
    Box(double W, double H, double D)
    {
        w = W;
        h = H;
        d = D;
    }
    public String toString()
    {
        return "dimensions are" + w +"X"+h+"X"+d;
    }
}
class tostringDemo
{
    public static void main(String[] args)
    {
        Box ob = new Box(10,20,30);
        //String s  = "box " +ob;
        System.out.print(ob);
       // System.out.println(s);

    }
};
