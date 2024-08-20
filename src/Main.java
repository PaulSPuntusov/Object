import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(1,4);
        Fraction fr2 = new Fraction(1,4);
        System.out.println(fr1.equals(fr2));
        Fraction fr3 = fr2.clone();
        System.out.println(fr3);
    }


}