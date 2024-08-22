import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Dot d1 = new Dot(1,2);
        Dot d2 = new Dot(2,2);
        Dot d3 = new Dot(1,3);
        Dot d4 = new Dot(1,4);
        PolyLine p1 = new PolyLine(d1,d2,d3,d4);
        PolyLine p2 = new PolyLine(new Dot(1,2),new Dot(2,2),new Dot(1,3),new Dot(1,4));
        System.out.println(p1.equals(p2));
    }


}