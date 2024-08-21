import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Dot d1 = new Dot(1,2);
        Dot d2 = new Dot(1,2);
        System.out.println(d1.equals(d2));
        Dot d3 = d2.clone();
        System.out.println(d3);
    }


}