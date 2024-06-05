package week10;

public class Lingkaran
{
    private int radius;
    private static final double pi = 3.14;
    
    public Lingkaran (int radius)
    {
        this.radius = radius;
    }

    public double luas()
    {
        return radius*radius*pi;
    }
    
    public double keliling()
    {
        return 2*radius*pi;
    }

    public int getradius()
    {
        return radius;
    }
}