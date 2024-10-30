@FunctionalInterface
interface myPredicate<T extends Number> {
    boolean test(T num);
}
@FunctionalInterface
interface myFunctionals<T extends Number, R extends Number>{
    R discriminant(T a, T b, T c);
}
public class Tester {
    public static void main(String[] args){
        myPredicate<Integer> isDiv13 = t -> (t % 13) == 0;
        System.out.println(isDiv13.test(13));
        myFunctionals<Integer, Double> disc = (a, b, c) -> Double.valueOf(b * b - (4 * a * c));
        System.out.println(disc.discriminant(-2, 3, 2));
    }
}//
