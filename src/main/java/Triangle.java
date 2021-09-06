import java.lang.Math;
class Triang{
    int a;
    int b;
    int c;

    public Triang (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void area(){
        float p = (a+b+c)/2;
        float s = (float) Math.sqrt(((p-a)*(p-b)*(p-c)*p));
        System.out.println(s);
    }
}

public class Triangle
{
    public static void main(String[] args) {
        Triang ar1 = new Triang (11,12,12);
        Triang ar2 = new Triang(66,72,50);
        ar1.area();
        ar2.area();
    }
}