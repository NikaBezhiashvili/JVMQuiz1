public class Main {
    public static void main(String[] args){
//        დავალება 1
        System.out.println(Diskriminanti(2.3F, 3F, 4F));
//        დავალება 2
        String stringArray[] = {"Nikoloz", "Bezhiashvili", "Jacob", "Sama", "Business and Technology University"};
        System.out.println(Masivi(stringArray));
//        დავალება 3
        Fraction wiladi1 = new Fraction(5, 4);
        wiladi1.Shekveca(5);
        System.out.println(wiladi1.a  + " " + wiladi1.b);
        wiladi1.Gamravleba(7);
        System.out.println(wiladi1.a  + " " + wiladi1.b);
    }

    public static double Diskriminanti(double a, double b, double c){
        return Math.pow(b, 2)-4*a*c;
    }

    public static String Masivi(String[] args){

        int count = 0;
        String shortest_word = null;
        for (int i = 0; i < args.length; i++) {
            if(i == 0){
                count = args[i].length();
            }else if(args[i].length() < args[i-1].length()){
                count = args[i].length();
                shortest_word = args[i];
            }
        }
        return "უმოკლესი სიტყვაა " + shortest_word + " რომელიც შედგება " + count + " ასოთი.";
    }
}
