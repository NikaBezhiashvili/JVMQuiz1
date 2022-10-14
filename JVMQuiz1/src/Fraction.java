public class Fraction {
    public static double a;
    public static double b;

    public Fraction(int x, int y){
        a = x;
        b = y;
    }

    public static void Shekveca(double c){
        a /= c;
        b /= c;
    }


    public static void Gamravleba(double c){
        a *= c;
    }
}
