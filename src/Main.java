public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Template Dva = new Template(13);
        myPredicate<Integer> isDiv13 = t -> (t % 13) == 0;
        System.out.println(isDiv13.test(13));
        Dva.setNumber(123.5);
        System.out.println(Dva.multiplicate());
//
    }
}